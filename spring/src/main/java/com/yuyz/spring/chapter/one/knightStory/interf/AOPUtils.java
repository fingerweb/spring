package com.yuyz.spring.chapter.one.knightStory.interf;

import com.yuyz.spring.chapter.one.knightStory.Minstrel;

public class AOPUtils {
	public static <T> T processWithSing(String singBefore, String singAfter, Runner<T> runner) {
		try {
			Minstrel minstrel = new Minstrel(System.out);
			minstrel.singBeforeQuest(singBefore);
			T result =  runner.run();
			minstrel.singAfterQuest(singAfter);
			return result;
		}catch(Throwable ex) {
			return null;
		}
	}
	
	public static interface Runner<T>{
		public T run() throws Throwable;
	}
}
