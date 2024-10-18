package org.moncef.productservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private ProductType type; // Example: Flight, Hotel, Car Rental
    private BigDecimal price;
    private String description;
    private Integer availableUnits;

}
