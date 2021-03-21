package com.yuyz.all.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.reflect.MethodUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuyz.all.service.MatchMetaService;
import com.yuyz.all.service.MetaService;

@RestController
@RequestMapping("/monitor")
public class MonitorController {
	
	@Autowired
	private MatchMetaService matchMetaService;
	
	@GetMapping("/redis")
	public String getHost(String serviceName) throws Exception {
		List<String> args = new ArrayList<>();
		args.add("getRedisHost");
		MetaService metaService = matchMetaService.match(serviceName);
		String clazzName = metaService.getImpl();
		Class clazz = Class.forName(clazzName);
		Object obj = clazz.newInstance();
		Object result = MethodUtils.invokeMethod(obj, "doCmd", args);
		return result.toString();
		
		
	}
}
