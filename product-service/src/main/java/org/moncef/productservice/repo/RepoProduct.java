package org.moncef.productservice.repo;

import org.moncef.productservice.entities.Product;
import org.moncef.productservice.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestController
public interface RepoProduct  extends JpaRepository<Product,Long> {
    public List<Product> findByName(String name);
    public List<Product> findByType (ProductType type) ;

}
