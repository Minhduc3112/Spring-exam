package com.vn.spring.login.security.services;

import java.util.List;

import com.vn.spring.login.models.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category saveCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
