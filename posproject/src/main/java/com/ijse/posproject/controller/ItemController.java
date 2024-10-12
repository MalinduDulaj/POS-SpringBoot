package com.ijse.posproject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.posproject.dto.ItemReqDto;
import com.ijse.posproject.entity.Category;
import com.ijse.posproject.entity.Item;
import com.ijse.posproject.service.CategoryService;
import com.ijse.posproject.service.ItemService;

@CrossOrigin(origins = "*")
@RestController
public class ItemController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ItemService itemService;

    @PostMapping("/items")
    public ResponseEntity<?> createItem (@RequestBody ItemReqDto itemReqDto) {
        
        try {
            Item newItem = new Item();
            newItem.setItemName(itemReqDto.getItemName());
            newItem.setPrice(itemReqDto.getPrice());
            newItem.setDescription(itemReqDto.getDescription());
            Category category = categoryService.getCategoryById(itemReqDto.getCategoryId());
            newItem.setCategory(category);
            Item createItem = itemService.createItem(newItem);
            return ResponseEntity.status(201).body(createItem);
            
            
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
        
    }
}
