package com.vn.spring.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn.spring.login.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // custom queries if needed
    List<Product> findByCategoryId(Long id);
}
