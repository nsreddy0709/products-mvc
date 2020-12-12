package com.example.products.repository;

import com.example.products.model.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandsRepository extends JpaRepository<Brands,Integer> {

    Brands findByTitle(String name);
}
