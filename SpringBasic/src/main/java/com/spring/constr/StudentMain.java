package com.spring.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.constr");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
	}

}

