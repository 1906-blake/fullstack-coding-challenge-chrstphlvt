package com.grocery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grocery_list")
public class groceryList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="list_id")
	private int listId;
	
	@Column(name="list_name")
	private String name;
	
	private int itemId;

	public groceryList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public groceryList(int listId, String name, int itemId) {
		super();
		this.listId = listId;
		this.name = name;
		this.itemId = itemId;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		result = prime * result + listId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		groceryList other = (groceryList) obj;
		if (itemId != other.itemId)
			return false;
		if (listId != other.listId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "groceryList [listId=" + listId + ", name=" + name + ", itemId=" + itemId + "]";
	}
	
	
	
}
