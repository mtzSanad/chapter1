package com.mtz.sprininaction.soundsystem;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("dev")
public class BlueRay implements CompactDisc {
	

	@Override
	public void play() {
		System.out.println("This is my blue Ray !!!");
		
	}

}
