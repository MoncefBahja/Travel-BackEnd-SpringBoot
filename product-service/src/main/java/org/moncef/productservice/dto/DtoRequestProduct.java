package org.moncef.productservice.dto;

import lombok.*;
import org.moncef.productservice.entities.ProductType;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class DtoRequestProduct {
    private String name;
    private ProductType type; // Example: Flight, Hotel, Car Rental
    private BigDecimal price;
    private String description;
    private Integer availableUnits;
}
