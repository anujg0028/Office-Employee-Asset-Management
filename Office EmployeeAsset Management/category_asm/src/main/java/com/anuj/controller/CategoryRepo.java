package com.anuj.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuj.controller.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
