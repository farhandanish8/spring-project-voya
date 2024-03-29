package com.voya.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	private IInstrument instrument;
	
	public Performer(@Qualifier("violin")IInstrument instrument) {
		super();
		this.instrument = instrument;
		
	}
	public void play(String type, String song) {
		if("violin".equals(type)) {
		instrument.play(song);
	}else {
		System.out.println("enter valid type");
	}

}
}
