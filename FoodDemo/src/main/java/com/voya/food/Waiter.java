package com.voya.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	
	private IFoodMenu indianMenu;
	@Autowired
	public Waiter(@Qualifier("indian") IFoodMenu indianMenu) {
		super();
		this.indianMenu = indianMenu;
	}
	public List<String> viewMenu(String choice){
		if("indian".equals(choice)) {
		return indianMenu.showMenu();
	}else {
		System.out.println("invalid");
	}
	return null;
}
}

