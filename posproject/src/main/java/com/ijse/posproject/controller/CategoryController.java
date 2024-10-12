package com.ijse.posproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.posproject.entity.Category;
import com.ijse.posproject.service.CategoryService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

@CrossOrigin(origins ="*")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/categories")   
    public ResponseEntity<?> createCategory(@RequestBody Category category){

        try {
            // Category newCategory = new Category();
            // newCategory.setCategoryName(category.getCategoryName());
            System.out.println("yes");
            Category createCategory = categoryService.createCategory(category);
            return ResponseEntity.status(201).body(createCategory);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

}
