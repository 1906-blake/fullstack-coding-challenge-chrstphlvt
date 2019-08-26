package com.grocery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "grocery_items")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class groceryItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_number")
	private int itemNumber;
	
	@Column(name="food")
	private String food;
	
	@Column(name="electronics")
	private String electronics;
	
	@Column(name="clothing")
	private String clothing;
	
	private int itemsId;

	public groceryItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public groceryItems(int itemNumber, String food, String electronics, String clothing, int itemsId) {
		super();
		this.itemNumber = itemNumber;
		this.food = food;
		this.electronics = electronics;
		this.clothing = clothing;
		this.itemsId = itemsId;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getElectronics() {
		return electronics;
	}

	public void setElectronics(String electronics) {
		this.electronics = electronics;
	}

	public String getClothing() {
		return clothing;
	}

	public void setClothing(String clothing) {
		this.clothing = clothing;
	}

	public int getItemsId() {
		return itemsId;
	}

	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clothing == null) ? 0 : clothing.hashCode());
		result = prime * result + ((electronics == null) ? 0 : electronics.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + itemNumber;
		result = prime * result + itemsId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		groceryItems other = (groceryItems) obj;
		if (clothing == null) {
			if (other.clothing != null)
				return false;
		} else if (!clothing.equals(other.clothing))
			return false;
		if (electronics == null) {
			if (other.electronics != null)
				return false;
		} else if (!electronics.equals(other.electronics))
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (itemNumber != other.itemNumber)
			return false;
		if (itemsId != other.itemsId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "groceryItems [itemNumber=" + itemNumber + ", food=" + food + ", electronics=" + electronics
				+ ", clothing=" + clothing + ", itemsId=" + itemsId + "]";
	}

	
	
	

}
