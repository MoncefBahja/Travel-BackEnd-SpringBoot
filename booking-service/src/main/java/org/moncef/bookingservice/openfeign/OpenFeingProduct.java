package org.moncef.bookingservice.openfeign;


import org.moncef.bookingservice.model.Product;
import org.moncef.bookingservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUCT-SERVICE")

public interface OpenFeingProduct {

    @GetMapping("/product")
    public List<Product> findAllProducts () ;
    @GetMapping("/product/{id}")
    public Product findProductById (@PathVariable Long id) ;
}
