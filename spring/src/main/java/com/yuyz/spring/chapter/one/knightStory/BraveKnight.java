package com.yuyz.spring.chapter.one.knightStory;

import com.yuyz.spring.chapter.one.knightStory.interf.Knight;
import com.yuyz.spring.chapter.one.knightStory.interf.Quest;

public class BraveKnight implements Knight{
	private Quest quest;
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
