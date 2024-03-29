package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


public class Indian implements IFoodMenu {
	
	public List<String> showMenu(){
		return Arrays.asList("Biryani","rice","Hyderabadi");
	}
	

}
