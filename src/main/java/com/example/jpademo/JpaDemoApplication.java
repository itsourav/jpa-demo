package com.example.jpademo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpademo.entity.Item;
import com.example.jpademo.entity.Menu;
import com.example.jpademo.entity.Restaurant;
import com.example.jpademo.repository.MenuRepository;
import com.example.jpademo.repository.RestaurantRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private MenuRepository menuRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		List<Item> vegItems = new ArrayList<>();
		
		vegItems.add(new Item("Dosa"));
		vegItems.add(new Item("Idli"));
		
		
		List<Menu> menus = new ArrayList<>();
		
		menus.add(new Menu("Veg",vegItems));	
//		menus.add(new Menu("Non-Veg"));
		
		Restaurant res = new Restaurant();
		res.setName("Maharaja");
		res.setMenus(menus);
		
		
		restaurantRepository.save(res);

	}	
	
	
}
