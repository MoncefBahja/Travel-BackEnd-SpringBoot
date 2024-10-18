package org.moncef.bookingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.moncef.bookingservice.model.Product;
import org.moncef.bookingservice.model.User;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Long idUser ;
    private Long idProduct ;
    private LocalDateTime bookingDate;
    private BookingStatus status;
    @Transient
    private User user ;
    @Transient
    private Product product ;



}
