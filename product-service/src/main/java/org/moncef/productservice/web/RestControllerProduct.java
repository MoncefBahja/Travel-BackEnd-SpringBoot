package org.moncef.productservice.web;

import org.moncef.productservice.dto.DtoRequestProduct;
import org.moncef.productservice.dto.DtoResponseProduct;
import org.moncef.productservice.entities.ProductType;
import org.moncef.productservice.repo.RepoProduct;
import org.moncef.productservice.service.ServiceProductIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerProduct {

    @Autowired
    RepoProduct repoProduct ;
    @Autowired
    ServiceProductIn serviceProductIn ;

    @PostMapping("/product")
    public void post (@RequestBody DtoRequestProduct dtoRequestProduct) {
        serviceProductIn.create(dtoRequestProduct);
    }

    @GetMapping("/product")
    public List<DtoResponseProduct> get() {
        return serviceProductIn.read();
    }


        @GetMapping ("/product/id/{id}")
        public DtoResponseProduct getById (@PathVariable Long id) {
        return  serviceProductIn.readById(id) ;
        }

    @PutMapping ("/product/{id}")
    public void put (@RequestBody DtoRequestProduct dtoRequestProduct ,@PathVariable Long id) {
        serviceProductIn.update(id , dtoRequestProduct);
    }

    @DeleteMapping ("/product/{id}")
    public void delete (@PathVariable Long id) {
        serviceProductIn.delete(id);
    }

    @GetMapping ("/product/name/{name}")
    public List<DtoResponseProduct> getByName (@PathVariable String name ) {
     return   serviceProductIn.readByName(name) ;
    }

    @GetMapping ("/product/type/{type}")
    public List<DtoResponseProduct> getByType (@PathVariable ProductType type ) {
        return   serviceProductIn.readByName(type) ;
    }




}
