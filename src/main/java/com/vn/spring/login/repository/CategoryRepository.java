package com.vn.spring.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn.spring.login.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // custom queries if needed
}
