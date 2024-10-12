package com.ijse.posproject.service;

import org.springframework.stereotype.Service;

import com.ijse.posproject.entity.Category;

@Service
public interface CategoryService {

    Category getCategoryById(Long categoryId);
    Category createCategory(Category category);
}
