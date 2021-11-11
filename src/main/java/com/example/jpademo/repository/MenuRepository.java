package com.example.jpademo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jpademo.entity.Menu;

public interface MenuRepository extends CrudRepository<Menu, Long>{

}
