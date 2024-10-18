package org.moncef.bookingservice.mapper;

import org.moncef.bookingservice.dto.DtoRequestBooking;
import org.moncef.bookingservice.dto.DtoResponseBooking;
import org.moncef.bookingservice.entities.Booking;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MapperBookingImp implements  MapperBookingIn{
    @Override
    public Booking dtoRequestBookingFun(DtoRequestBooking dtoRequestBooking) {
         Booking booking = new Booking() ;
        BeanUtils.copyProperties(dtoRequestBooking,booking);
        return booking;
    }

    @Override
    public DtoResponseBooking dtoResponseBookingFun(Booking booking) {
         DtoResponseBooking dtoResponseBooking = new DtoResponseBooking() ;
         BeanUtils.copyProperties(booking,dtoResponseBooking);
        return dtoResponseBooking;
    }
}
