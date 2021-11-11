package com.example.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private long Id;
	
	@Column(nullable = false)
	private String itemname;

	
	public Item() {
		super();
	}

	

	public Item(String itemname) {
		this.itemname = itemname;
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}



	public String getItemname() {
		return itemname;
	}



	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	
	
	

}
