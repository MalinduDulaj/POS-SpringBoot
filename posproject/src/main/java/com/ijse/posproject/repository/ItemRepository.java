package com.ijse.posproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.posproject.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

}
