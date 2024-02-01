package com.vn.spring.login.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vn.spring.login.models.Category;
import com.vn.spring.login.models.Product;
import com.vn.spring.login.security.services.CategoryService;
import com.vn.spring.login.security.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showProductList(Model model) {
        return "product/list";
    }

       @PostMapping("/filter")
    public ResponseEntity<List<Product>> filterProducts(@RequestParam(value = "categories", required = false) List<Long> categoryIds) {
        List<Product> filteredProducts;

        if (categoryIds != null && !categoryIds.isEmpty()) {
            filteredProducts = new ArrayList<>();
            for (Long categoryId : categoryIds) {
                List<Product> productsForCategory = productService.getProductByCategoryId(categoryId);
                filteredProducts.addAll(productsForCategory);
            }
        } else {
            // If no categories selected, show all products
            filteredProducts = productService.getAllProducts();
        }

        return new ResponseEntity<>(filteredProducts, HttpStatus.OK);
    }
}

