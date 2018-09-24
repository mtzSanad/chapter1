package com.mtz.sprininaction;

import java.io.PrintStream;

public class SingForKnight {
	private PrintStream stream;
	public SingForKnight(PrintStream stream) {
		this.stream = stream;
	}
	public void singBefore() {
		stream.println("Singing before");
	}
	public void singAfter() {
		stream.println("Singing after");
	}
}
