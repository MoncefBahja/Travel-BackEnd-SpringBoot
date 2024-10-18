package org.moncef.bookingservice.service;

import jakarta.transaction.Transactional;
import org.moncef.bookingservice.dto.DtoRequestBooking;
import org.moncef.bookingservice.dto.DtoResponseBooking;
import org.moncef.bookingservice.entities.Booking;
import org.moncef.bookingservice.mapper.MapperBookingIn;
import org.moncef.bookingservice.model.Product;
import org.moncef.bookingservice.model.User;
import org.moncef.bookingservice.openfeign.OpenFeingProduct;
import org.moncef.bookingservice.openfeign.OpenfeignUser;
import org.moncef.bookingservice.repo.RepoBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Transactional
@Service

public class ServiceBookingImp implements  ServiceBookingIn{

    @Autowired
    RepoBooking repoBooking ;
    @Autowired
    MapperBookingIn mapperBookingIn ;
    @Autowired
    OpenfeignUser openfeignUser ;
    @Autowired
    OpenFeingProduct openFeingProduct ;
    @Override
    public void postBooking(DtoRequestBooking dtoRequestBooking) {
        repoBooking.save(mapperBookingIn.dtoRequestBookingFun(dtoRequestBooking));
    }

    @Override
    public List<DtoResponseBooking> getAllBooking() {
        List<Booking> bookings = new ArrayList<>() ;
        List<User> users = new ArrayList<>() ;
        List<Product> products = new ArrayList<>() ;
        bookings = repoBooking.findAll() ;
        users=openfeignUser.findAllUsers() ;
        products=openFeingProduct.findAllProducts() ;
        List<DtoResponseBooking> dtoResponseBookings = new ArrayList<>() ;

        for (Booking booking : bookings) {
            for (User user : users) {
                if(Objects.equals(booking.getIdUser(), user.getId())){
                    booking.setUser(user);
                }
            }

            for (Product product : products){
                if(Objects.equals(booking.getIdProduct(), product.getId())) {
                    booking.setProduct(product);

                }
            }
        DtoResponseBooking  dtoResponseBooking = mapperBookingIn.dtoResponseBookingFun(booking) ;
        dtoResponseBookings.add(dtoResponseBooking) ;

        }

        return dtoResponseBookings;
    }

    @Override
    public DtoResponseBooking getBookingByID(Long id) {
        Booking booking = repoBooking.findById(id).get() ;
        User user =  openfeignUser.findUserById(booking.getIdUser())  ;
        Product product = openFeingProduct.findProductById(booking.getIdProduct()) ;
        booking.setUser(user);
        booking.setProduct(product);
        return mapperBookingIn.dtoResponseBookingFun(booking);
    }

    @Override
    public void updateBooking(Long id, DtoRequestBooking dtoRequestBooking) {
         Booking booking= repoBooking.findById(id).get() ;

         if(booking.getBookingDate()!=null) booking.setBookingDate(dtoRequestBooking.getBookingDate());
        if(booking.getStatus()!=null) booking.setStatus(dtoRequestBooking.getStatus());
        if(booking.getIdUser()!=null) booking.setIdUser(dtoRequestBooking.getIdUser());
        if(booking.getIdProduct()!=null ) booking.setIdProduct(dtoRequestBooking.getIdProduct());
        if(booking.getUser()!=null) booking.setUser(dtoRequestBooking.getUser());
        if(booking.getProduct()!=null) booking.setProduct(dtoRequestBooking.getProduct());
repoBooking.save(booking) ;
    }

    @Override
    public void delete(Long id) {
        repoBooking.deleteById(id);

    }
}
