package com.vn.spring.login.security.services;

import java.util.List;

import com.vn.spring.login.models.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    List<Product> getProductByCategoryId(Long categoryIds);
    Product saveProduct(Product product);
    void deleteProduct(Long id);
}
