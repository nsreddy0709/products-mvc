package com.example.products.repository;

import com.example.products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
    List<Products> findProductsByKeywordsLike(String name);



    List<Products> findProductsByBrand(Integer id);

    List<Products> findProductsByCategory(Integer id);

    Products findProductsByPtitle(String name);

}
