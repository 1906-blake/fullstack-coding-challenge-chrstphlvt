package com.grocery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.models.groceryItems;
import com.grocery.repos.GItemsRepo;

@Service
public class GItemsServices {
	
	@Autowired
	private GItemsRepo gitemRepo;
	
//	public groceryItems newGItems(int item_id) {
//		return gitemRepo.save(item_id);
//	}

	public groceryItems newGItems(int item_id) {
		return gitemRepo.save(item_id);
	}
	
	
	
}
