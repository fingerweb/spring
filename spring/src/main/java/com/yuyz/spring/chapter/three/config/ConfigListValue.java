package com.yuyz.spring.chapter.three.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

@Configuration
public class ConfigListValue {
	
	private static List<String> configListValue;
	private static int configIntegerValue;
	
	
	@Autowired
	public void setConfigValue(Environment env) {
		configIntegerValue = env.getProperty("application.default.integer", Integer.class);
		
		for(int i=0; i < 1000;i++) {
			String defaultValue = env.getProperty("application.default.list.value[" + i +"]");
			if(StringUtils.isEmpty(defaultValue)) {
				break;
			}
			if(null == configListValue) {
				configListValue = new ArrayList<>();
			}
			configListValue.add(defaultValue);
		}
	}
	
}
