package com.ijse.posproject.service;

import org.springframework.stereotype.Service;

import com.ijse.posproject.entity.Item;

@Service
public interface ItemService {

    Item createItem(Item item);
}
