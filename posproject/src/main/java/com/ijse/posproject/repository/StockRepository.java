package com.ijse.posproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.posproject.entity.Stock;


@Repository
public interface StockRepository extends JpaRepository <Stock, Long> {
    
}
