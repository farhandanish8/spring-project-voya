package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


@Component("italian")
public class Italian implements IFoodMenu{
	
	public List<String> showMenu(){
		
		return Arrays.asList("pizza","pasta");
	}

}
