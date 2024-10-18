package org.moncef.bookingservice.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.*;
import org.moncef.bookingservice.entities.BookingStatus;
import org.moncef.bookingservice.model.Product;
import org.moncef.bookingservice.model.User;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class DtoResponseBooking {
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
