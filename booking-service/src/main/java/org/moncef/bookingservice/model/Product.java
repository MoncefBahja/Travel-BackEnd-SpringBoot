package org.moncef.bookingservice.model;

import lombok.*;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Product {
    private Long id;
    private String name;
    private ProductType type; // Example: Flight, Hotel, Car Rental
    private BigDecimal price;
    private String description;
    private Integer availableUnits;
}
