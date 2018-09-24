package com.mtz.sprininaction;

import java.io.PrintStream;

public class DragonQuest implements Quest {

	private PrintStream stream;
	
	public DragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void printQuest() {
		stream.println("I am the dragon Quest");
	}

}
