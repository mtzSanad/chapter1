package com.mtz.sprininaction.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class DependanceImplementation implements DependancyInterface{

	@Override
	public void doSomthing() {
		System.out.print("Calling a dependancy!!!");
	}

}
