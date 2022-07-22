package com.anuj.asset.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AssetController {
	
	@Autowired
	AssetRepo repo;
	
	
	
	@GetMapping("/asset")
	public List<Asset> getAsset()
	{
		return repo.findAll();
	}
		
	@PostMapping("/asset")
	public String saveAsset(@RequestBody Asset asset)
	{
		repo.save(asset);
		return "save successful";
	}
	
	@GetMapping("/asset/{aname}")
	public Optional<Asset> getAsset(@PathVariable("aname") String aname)
	{
		return repo.findById(aname);
	}
	
	@PutMapping("/asset")
	public String updateAsset(@RequestBody Asset asset)
	{
		repo.save(asset);
		return "save successful";
	}
	
	@DeleteMapping("/asset/{aname}")
	public String deleteAsset(@PathVariable("aname") String aname)
	{
		@SuppressWarnings("deprecation")
		Asset obj=repo.getOne(aname);
		System.out.println(obj.getStatus());
		if(obj.getStatus().equals("assign"))return "asset is asign and cant be deleted";
		else repo.delete(obj);
		return "successful";
	}
	

}

