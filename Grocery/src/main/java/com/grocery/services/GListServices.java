package com.grocery.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.models.groceryList;
import com.grocery.repos.GListRepo;



@Service
public class GListServices {
	
	@Autowired
	private GListRepo glistRepo;
	
	//find all of the lists
	public List<groceryList> findAll(){
		return glistRepo.findAll();
	}

	// find by grocery list id
	public List<groceryList> findByListId(int itemId) {
		return glistRepo.findByListId(itemId);
	}

	// create a new grocery list
	public groceryList createNewList(groceryList gList) {
		return glistRepo.save(gList);
	}
	
	
	
	

}
