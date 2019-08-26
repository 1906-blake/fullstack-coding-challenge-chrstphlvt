package com.grocery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.models.groceryList;
import com.grocery.services.GListServices;

@RestController
@RequestMapping("grocery_list")
public class GListControllers {
	
	@Autowired
	private GListServices glistServices;
	
	@GetMapping
	public List<groceryList> findAll(){
		return glistServices.findAll();
	}
	
//	//add new item to groceryList
//	@PostMapping(grocery_list/item_id/{itemId})
//	public List<groceryList> findByListId (@PathVariable int itemId){
//		return glistServices.findByListId(itemId);
//	}
	
	// add new groceryList
	@PostMapping
	public groceryList createNewList(@RequestBody groceryList gList) {
		return glistServices.createNewList(gList);
	}
	
	
	
}
