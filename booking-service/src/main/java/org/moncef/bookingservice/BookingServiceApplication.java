package org.moncef.bookingservice;

import org.moncef.bookingservice.entities.Booking;
import org.moncef.bookingservice.entities.BookingStatus;
import org.moncef.bookingservice.repo.RepoBooking;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableFeignClients

public class BookingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner Start(RepoBooking repoBooking) {
        return args -> {
            Booking booking1 = Booking.builder()
                    .idUser(1L)
                    .idProduct(2L)
                    .bookingDate(LocalDateTime.now())
                    .status(BookingStatus.PENDING)
                    .build();
            repoBooking.save(booking1);
            Booking booking2 = Booking.builder()
                    .idUser(2L)
                    .idProduct(1L)
                    .bookingDate(LocalDateTime.now())
                    .status(BookingStatus.PENDING)
                    .build();
            repoBooking.save(booking2);

            Booking booking3 = Booking.builder()
                    .idUser(3L)
                    .idProduct(3L)
                    .bookingDate(LocalDateTime.now())
                    .status(BookingStatus.PENDING)
                    .build();
            repoBooking.save(booking3) ;







        };

    }

}
