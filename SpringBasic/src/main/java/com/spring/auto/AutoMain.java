package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto");
		ShapeFactory shapeFactory = context.getBean("shapeFactory",ShapeFactory.class);
		shapeFactory.printArea("t",10,20);

	}

}
