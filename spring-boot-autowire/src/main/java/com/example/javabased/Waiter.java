package com.example.javabased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu indianMenu;
	
	@Autowired
	IFoodMenu menu;
	
	IFoodMenu menuItems;
	public void setMenu(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}
	public List<String> viewMenu(String choice){
		List<String> menuList = new ArrayList<>();
		if(choice.equals("Indian")) {
			//menuList = IFoodMenu.menu();
		}
	return menuList;
}
}

