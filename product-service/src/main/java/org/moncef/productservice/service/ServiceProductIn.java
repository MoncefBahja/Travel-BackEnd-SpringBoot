package org.moncef.productservice.service;

import org.moncef.productservice.dto.DtoRequestProduct;
import org.moncef.productservice.dto.DtoResponseProduct;
import org.moncef.productservice.entities.ProductType;

import java.util.List;

public interface ServiceProductIn {

    public void create (DtoRequestProduct dtoRequestProduct) ;
    public List<DtoResponseProduct> read () ;
    public DtoResponseProduct readById (Long id ) ;
    public void update (Long id , DtoRequestProduct dtoRequestProduct) ;
    public void delete (Long id );

    public  List<DtoResponseProduct> readByName (String name) ;
   public List<DtoResponseProduct> readByName (ProductType type) ;

}
