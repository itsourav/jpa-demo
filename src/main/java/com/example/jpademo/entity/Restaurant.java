package com.example.jpademo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="restaurant_id")
	private long Id;
	
	@Column(nullable = false)
	private String name;
	
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name = "restaurant_id")
	private List<Menu> menus = new ArrayList<>();
	

	public Restaurant() {
		super();
	}

	
	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<Menu> getMenus() {
		return menus;
	}



	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}



	

}
