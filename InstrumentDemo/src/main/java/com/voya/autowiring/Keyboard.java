package com.voya.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements IInstrument{
	public void play(String song) {
		System.out.println(song+"play song using keyboard");
	}
	

}
