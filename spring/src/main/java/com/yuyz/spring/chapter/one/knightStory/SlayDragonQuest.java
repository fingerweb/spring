package com.yuyz.spring.chapter.one.knightStory;

import java.io.PrintStream;

import com.yuyz.spring.chapter.one.knightStory.interf.Quest;

public class SlayDragonQuest implements Quest{
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}
	
	@Override
	public void embark() {
		stream.println("Embarking on quest to slay the dragon");
	}

}
