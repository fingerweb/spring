package com.yuyz.spring.chapter.two;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;
import org.springframework.stereotype.Component;

/**
 * {@link ConditionalOnProperty} 是否匹配实际调用的是 {@link Condition}的matches()方法
 * name 表示application.properties中定义的变量名
 * havingValue 表示只有application.properties中定义的变量的值与havingValue的值相同是才为true
 * @author yuyz
 *
 */
@Component
@ConditionalOnProperty(name = "application.fmis.enabled", havingValue = "true")
public class FmisComponent {
	private String name;
	
	public FmisComponent() {}
}
