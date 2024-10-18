package org.moncef.bookingservice.web;

import org.moncef.bookingservice.dto.DtoRequestBooking;
import org.moncef.bookingservice.dto.DtoResponseBooking;
import org.moncef.bookingservice.service.ServiceBookingIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerBooking {
    @Autowired
    ServiceBookingIn serviceBookingIn ;

    @PostMapping("/booking")
    public void postBooking (@RequestBody DtoRequestBooking dtoRequestBooking) {
        serviceBookingIn.postBooking(dtoRequestBooking);
    }
    @GetMapping ("/booking")
    public List<DtoResponseBooking> getBooking () {
       return serviceBookingIn.getAllBooking() ;
    }

    @GetMapping ("/booking/{id}")
    public DtoResponseBooking getBooking (@PathVariable Long id) {
        return serviceBookingIn.getBookingByID(id) ;
    }
    @PutMapping ("booking/{id}")
    public void putBooking (@PathVariable Long id , @RequestBody DtoRequestBooking dtoRequestBooking){
        serviceBookingIn.updateBooking(id,dtoRequestBooking);
    }
    @DeleteMapping ("booking/{id}")
    public void deleteBooking (@PathVariable Long id) {
        serviceBookingIn.delete(id);
    }






}
