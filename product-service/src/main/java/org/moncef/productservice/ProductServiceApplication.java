package org.moncef.productservice;

import org.moncef.productservice.entities.Product;
import org.moncef.productservice.entities.ProductType;
import org.moncef.productservice.repo.RepoProduct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner Start(RepoProduct repoProduct) {
        return args -> {
            Product product1 = Product.builder()
                    .name("five")
                    .type(ProductType.HOTEL)
                    .price(BigDecimal.valueOf(300.00))
                    .description("the best hotel")
                    .availableUnits(4)
                    .build();
            repoProduct.save(product1);



                Product product2 = Product.builder()
                        .name("car")
                        .type(ProductType.CAR_RENTAL)
                        .price(BigDecimal.valueOf(100.00))
                        .description("the best CAR")
                        .availableUnits(11)
                        .build();
                repoProduct.save(product2);

            Product product5 = Product.builder()
                    .name("car")
                    .type(ProductType.CAR_RENTAL)
                    .price(BigDecimal.valueOf(500.00))
                    .description("the best 100 CAR")
                    .availableUnits(10)
                    .build();
            repoProduct.save(product5);


            Product product3 = Product.builder()
                            .name("flight")
                            .type(ProductType.FLIGHT)
                            .price(BigDecimal.valueOf(300.00))
                            .description("the best FLIGHT")
                            .availableUnits(7)
                            .build();
                    repoProduct.save(product3);

                        Product product4 = Product.builder()
                                .name("star")
                                .type(ProductType.HOTEL)
                                .price(BigDecimal.valueOf(500.00))
                                .description("the best hotel")
                                .availableUnits(8)
                                .build();
                        repoProduct.save(product4);
        };

    }
}