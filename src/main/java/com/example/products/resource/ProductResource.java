package com.example.products.resource;


import com.example.products.model.Brands;
import com.example.products.model.Categories;
import com.example.products.model.Products;
import com.example.products.model.Reviews;
import com.example.products.repository.BrandsRepository;
import com.example.products.repository.CategoriesRepositories;
import com.example.products.repository.ProductsRepository;
import com.example.products.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")


public class ProductResource {


    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    BrandsRepository brandsRepository;

    @Autowired
    CategoriesRepositories categoriesRepositories;

    @Autowired
    ReviewsRepository reviewsRepository;

    @GetMapping(value = "/all")
    public List<Products> getAll() {
        return productsRepository.findAll();
    }

    @GetMapping(value = "/Search")
    public List<Products> getProducts(@RequestParam String keywords){
        System.out.println(keywords);
        return productsRepository.findProductsByKeywordsLike("%"+keywords+"%");
    }
    @GetMapping(value = "/brands")
    public List<Products> getBrands(@RequestParam String name){
        System.out.println(name);
        Integer id = brandsRepository.findByTitle(name).getId();
        System.out.println(id);
        return productsRepository.findProductsByBrand(id);
    }

    @GetMapping(value = "/categories")
    public List<Products> getCategories(@RequestParam String name){
        System.out.println(name);
        Integer id = categoriesRepositories.findByTitle(name).getCat_id();
        System.out.println(id);
        return productsRepository.findProductsByCategory(id);
    }

    @GetMapping(value = "/reviews")
    public List<Reviews> getReviews(@RequestParam String name){
        System.out.println(name);
        Integer id = productsRepository.findProductsByPtitle(name).getProduct_id();
        System.out.println(id);
        return reviewsRepository.findAllByPid(id);
    }
    @GetMapping(value = "/call")
    public List<Categories> getCall() {
        return categoriesRepositories.findAll();
    }

    @GetMapping(value = "/ball")
    public List<Brands> getBall() {
        return brandsRepository.findAll();
    }


}
