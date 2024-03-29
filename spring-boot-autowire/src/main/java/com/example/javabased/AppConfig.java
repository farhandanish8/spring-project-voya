package com.example.javabased;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public Chinese getChinese() {
		return new Chinese();
		
	}
	@Bean
	public Indian getIndian() {
		return new Indian();
		
	}
	@Bean
	public Italian getItalian() {
		return new Italian();
	}
	@Bean
	public Waiter getWaiter() {
		Waiter waiter = new Waiter();
		waiter.setMenu(getChinese());
		return waiter;
	}

}
