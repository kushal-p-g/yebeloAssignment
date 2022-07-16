package com.yebelo.assign.entity;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("FeetchNextNumber")
public class HomeController {
	@Autowired
	private CatAndValueRepository repo;
	
	@Autowired
	private CatAndValue catValue;
	
	
	@GetMapping("/category")
	public List<CatAndValue> listOfCategory(){
	return repo.findAll();
		
	}
	
	//save the data to database 
	@PostMapping("/{categoryCode}/{value}")
	public CatAndValue setTabValues(@PathVariable String categoryCode,@PathVariable int value) {
		catValue.setCategoryCode(categoryCode);
		catValue.setValue(value);
		return repo.save(catValue);
	}
	
	//to find the values using category as a parameter

	@GetMapping("/{category}")
	public  List<CatAndValue> findCategory(@PathVariable String category) {
		return repo.findByCategoryCode(category);
		
	}
}
