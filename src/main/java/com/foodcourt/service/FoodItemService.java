package com.foodcourt.service;

import com.foodcourt.model.FoodItem;
import com.foodcourt.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    private FoodItemRepository repository;

    public List<FoodItem> findAll() {
        return repository.findAll();
    }

    public FoodItem save(FoodItem item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
