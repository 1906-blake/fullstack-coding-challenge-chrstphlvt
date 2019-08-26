package com.grocery.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.models.groceryItems;

public interface GItemsRepo extends JpaRepository<groceryItems, Integer> {

	groceryItems save(int item_id);
	
}
