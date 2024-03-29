package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("chinese")
public class Chinese implements IFoodMenu {
	
	public List<String> showMenu(){
		return Arrays.asList("Schezwan","rice","sushi");
	}

}
