package com.yuyz.spring.chapter.one.knightStory;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	public void singBeforeQuest(String singBefore) {
		stream.println(singBefore);
	}
	
	public void singAfterQuest(String singAfter) {
		stream.println(singAfter);
		
	}
}
