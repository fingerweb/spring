package com.yuyz.spring.chapter.one.knightStory;

import com.yuyz.spring.chapter.one.knightStory.interf.AOPUtils;
import com.yuyz.spring.chapter.one.knightStory.interf.Quest;

public class Main {

	public static void main(String[] args) {
		String singBefore = "Fa la la, the Knight is so barve!";
		String singAfter = "Tee hee hee, the brave knight did embark on a quest!";
		
		AOPUtils.processWithSing(singBefore, singAfter, ()-> {
			Quest quest = new SlayDragonQuest(System.out);
			new BraveKnight(quest).embarkOnQuest();
			return null;
		});
	}

}
