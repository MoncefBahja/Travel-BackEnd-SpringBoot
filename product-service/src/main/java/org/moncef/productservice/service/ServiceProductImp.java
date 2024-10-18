package org.moncef.productservice.service;

import jakarta.transaction.Transactional;
import org.moncef.productservice.dto.DtoRequestProduct;
import org.moncef.productservice.dto.DtoResponseProduct;
import org.moncef.productservice.entities.Product;
import org.moncef.productservice.entities.ProductType;
import org.moncef.productservice.mapper.MapperProductIn;
import org.moncef.productservice.repo.RepoProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ServiceProductImp  implements  ServiceProductIn{

    @Autowired
    MapperProductIn mapperProductIn;
    @Autowired
    RepoProduct repoProduct ;
    @Override
    public void create(DtoRequestProduct dtoRequestProduct) {
        repoProduct.save(mapperProductIn.dtoRequestProductFun(dtoRequestProduct) );
    }

    @Override
    public List<DtoResponseProduct> read() {
        List<Product> products = new ArrayList<>() ;
        products = repoProduct.findAll() ;
        List<DtoResponseProduct> dtoResponseProducts = new ArrayList<>( ) ;
        for (Product product : products ){
            DtoResponseProduct dtoResponseProduct = mapperProductIn.dtoResponseProductFun(product) ;
            dtoResponseProducts.add(dtoResponseProduct);
        }
        return dtoResponseProducts ;    }

    @Override
    public DtoResponseProduct readById(Long id) {
        Product   product = repoProduct.findById(id).get();
        return mapperProductIn.dtoResponseProductFun(product) ;    }

    @Override
    public void update(Long id, DtoRequestProduct dtoRequestProduct) {
        Product product = repoProduct.findById(id).get();
        if(product.getName()!=null) product.setName(dtoRequestProduct.getName());
        if(product.getType()!=null) product.setType(dtoRequestProduct.getType());
        if(product.getPrice()!=null) product.setPrice(dtoRequestProduct.getPrice());
        if(product.getDescription()!=null) product.setDescription(dtoRequestProduct.getDescription());
        if(product.getAvailableUnits()!=null) product.setAvailableUnits(dtoRequestProduct.getAvailableUnits());
        repoProduct.save(product) ;
    }


    @Override
    public void delete(Long id) {
        repoProduct.deleteById(id);


    }

    @Override
    public List<DtoResponseProduct> readByName(String name) {
        List<Product> products = repoProduct.findByName(name) ;
        List<DtoResponseProduct> dtoResponseProducts = new ArrayList<>() ;
        for (Product product :products) {
            dtoResponseProducts.add(mapperProductIn.dtoResponseProductFun(product))  ;
        }
        return  dtoResponseProducts ;//

    }

    @Override
    public List<DtoResponseProduct> readByName(ProductType type) {
        List<Product> products =repoProduct.findByType(type) ;
        List<DtoResponseProduct> dtoResponseProducts = new ArrayList<>() ;
        for (Product product :products) {
            dtoResponseProducts.add(mapperProductIn.dtoResponseProductFun(product));
        }
        return dtoResponseProducts;
    }
}
