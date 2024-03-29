package com.spring.auto;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{

	@Override
	public void area(int x, int y) {
		System.out.println("area of triangle "+(x*y)/2);
		// TODO Auto-generated method stub
		
	}


}
