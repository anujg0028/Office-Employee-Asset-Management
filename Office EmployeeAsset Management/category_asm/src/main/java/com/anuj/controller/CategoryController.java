package com.anuj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.controller.Category;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryRepo repo;
	
	
	
	@GetMapping("/category")
	public List<Category> getCategory()
	{
		return repo.findAll();
	}
		
	@PostMapping("/category")
	public String saveCategory(@RequestBody Category category)
	{
		repo.save(category);
		return "save successful";
	}
	
	@PutMapping("/category")
	public String updateAsset(@RequestBody Category category)
	{
		repo.save(category);
		return "save successful";
	}
	
	

}