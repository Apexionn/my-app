package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
