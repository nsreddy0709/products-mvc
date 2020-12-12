package com.example.products.repository;

import com.example.products.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewsRepository extends JpaRepository<Reviews,Integer> {

    List<Reviews> findAllByPid(Integer id);
}
