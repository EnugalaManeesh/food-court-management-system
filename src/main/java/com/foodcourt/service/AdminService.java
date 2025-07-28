package com.foodcourt.service;

import com.foodcourt.model.Admin;
import com.foodcourt.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    public boolean validate(String username, String password) {
        Admin admin = repository.findByUsername(username);
        return admin != null && admin.getPassword().equals(password);
    }
}
