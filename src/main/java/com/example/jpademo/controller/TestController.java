package com.example.jpademo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.entity.Restaurant;
import com.example.jpademo.repository.RestaurantRepository;

@RestController
public class TestController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	
	@GetMapping("/restaurants/{id}")
	public Optional<Restaurant> getRestaurant(@PathVariable Long id) {
		return restaurantRepository.findById(id);
	}

}
