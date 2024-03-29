package com.spring.auto;

import org.springframework.stereotype.Component;

@Component("shaper")
public class Sqaure implements IShape{

	@Override
	public void area(int x, int y) {
		System.out.println("area of square "+(x*x));
		// TODO Auto-generated method stub
		
	}

}
