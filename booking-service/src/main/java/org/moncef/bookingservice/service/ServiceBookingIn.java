package org.moncef.bookingservice.service;

import org.moncef.bookingservice.dto.DtoRequestBooking;
import org.moncef.bookingservice.dto.DtoResponseBooking;
import org.moncef.bookingservice.entities.Booking;

import java.util.List;

public interface ServiceBookingIn {

    public void postBooking (DtoRequestBooking dtoRequestBooking) ;
    public List<DtoResponseBooking> getAllBooking () ;
    public DtoResponseBooking getBookingByID (Long id) ;
    public void updateBooking (Long id ,DtoRequestBooking dtoRequestBooking) ;
    public void delete (Long id ) ;
}
