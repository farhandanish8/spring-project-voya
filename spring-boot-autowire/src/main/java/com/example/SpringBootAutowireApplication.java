package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.javabased.Waiter;
import com.spring.auto.ShapeFactory;

@SpringBootApplication
@ComponentScan({"com"})
public class SpringBootAutowireApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
	@Autowired
	Waiter waiter;
	@Override
	public void run(String... args) throws Exception {
		List<String> menu = waiter.viewMenu("Indian");
		for (String menus : menu) {
		System.out.println(menu);
	}

}
}
