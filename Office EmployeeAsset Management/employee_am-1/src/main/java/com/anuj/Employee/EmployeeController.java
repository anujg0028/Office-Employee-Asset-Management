package com.anuj.Employee;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anuj.asset.Asset;
import com.google.common.base.Optional;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
		Asset obj=restTemplate.getForObject("http://localhost:9001/asset/anuj",Asset.class);
		System.out.println(obj);
		
		return repo.findAll();
	}
		
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		repo.save(employee);
		return "save successful";
	}
	
	@PutMapping("/employee/{eid}/{aname}")
	public String assignasset(@PathVariable("eid")int eid,@PathVariable("aname")String aname)
	{
		java.util.Optional<Employee> emp=repo.findById(eid);
		
		Asset obj=restTemplate.getForObject("http://localhost:9001/asset/"+aname,Asset.class);
		System.out.println(emp.get());
		System.out.println(obj);
		
	    emp.get().setAset(obj);
	    System.out.println(emp);
		repo.save(emp.get());
		
		return  "succefull";
	}
	

}