package org.moncef.productservice.mapper;

import org.moncef.productservice.dto.DtoRequestProduct;
import org.moncef.productservice.dto.DtoResponseProduct;
import org.moncef.productservice.entities.Product;

public interface MapperProductIn {

    public Product dtoRequestProductFun (DtoRequestProduct dtoRequestProduct);
     public DtoResponseProduct dtoResponseProductFun (Product product);


}
