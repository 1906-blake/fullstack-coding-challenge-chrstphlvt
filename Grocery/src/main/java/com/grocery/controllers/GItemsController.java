package com.grocery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.models.groceryItems;
import com.grocery.services.GItemsServices;


@RestController
@RequestMapping("grocery_items")
public class GItemsController {
	
	@Autowired
	private GItemsServices gitemsService;
	

	@Query (FROM grocery_list JOIN grocery_items ON item_id = items_id)
//	@PostMapping(item_id/{item_id}/grocery_items/)
	public groceryItems newGItems(@PathVariable int item_id ) {
		return gitemsService.newGItems(item_id);
	}
	
	
	
	
	
//	@ManyToOne
//	@JoinColumn(name="items_id")
//	public groceryItems delGItems(@PathVariable){
//		return null;
//	}
}
