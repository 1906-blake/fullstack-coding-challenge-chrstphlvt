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
	
	public List<groceryList> findAll(){
		return glistRepo.findAll();
	}

	public List<groceryList> findByListId(int itemId) {
		return glistRepo.findByListId(itemId);
	}

	public groceryList createNewList(groceryList gList) {
		return glistRepo.save(gList);
	}
	
	
	
	

}
