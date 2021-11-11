package com.example.jpademo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jpademo.entity.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
