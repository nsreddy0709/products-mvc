package com.example.products.repository;

import com.example.products.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepositories extends JpaRepository<Categories,Integer> {

    Categories findByTitle(String name);
}
