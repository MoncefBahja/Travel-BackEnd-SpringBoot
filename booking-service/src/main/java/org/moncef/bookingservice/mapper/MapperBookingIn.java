package org.moncef.bookingservice.mapper;

import org.moncef.bookingservice.dto.DtoRequestBooking;
import org.moncef.bookingservice.dto.DtoResponseBooking;
import org.moncef.bookingservice.entities.Booking;

public interface MapperBookingIn {

    public Booking dtoRequestBookingFun (DtoRequestBooking dtoRequestBooking) ;
    public DtoResponseBooking dtoResponseBookingFun (Booking booking) ;
}
