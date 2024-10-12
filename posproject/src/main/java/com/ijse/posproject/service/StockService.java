package com.ijse.posproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.posproject.entity.Stock;



@Service
public interface StockService {
    List<Stock> getAllStocks ();
    Stock getStockById (Long id);
    Stock createStock (Stock stock);
    Stock updateStock (Long id,Stock stock);

    
}
