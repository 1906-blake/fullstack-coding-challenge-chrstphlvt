package com.grocery.repos;

import java.util.List;

import com.grocery.models.groceryList;



public interface GListRepo {

	List<groceryList> findAll();

	List<groceryList> findByListId(int itemId);

	groceryList save(groceryList gList);
	
}
