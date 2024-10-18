package org.moncef.productservice.mapper;

import org.moncef.productservice.dto.DtoRequestProduct;
import org.moncef.productservice.dto.DtoResponseProduct;
import org.moncef.productservice.entities.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MapperProductImp implements  MapperProductIn{
    @Override
    public Product dtoRequestProductFun(DtoRequestProduct dtoRequestProduct) {
        Product product = new Product() ;
        BeanUtils.copyProperties(dtoRequestProduct,product);
        return product;
    }

    @Override
    public DtoResponseProduct dtoResponseProductFun(Product product) {
        DtoResponseProduct dtoResponseProduct = new DtoResponseProduct() ;
        BeanUtils.copyProperties(product,dtoResponseProduct);
        return dtoResponseProduct;
    }
}
