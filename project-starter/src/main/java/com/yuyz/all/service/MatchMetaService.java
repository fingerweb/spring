package com.yuyz.all.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchMetaService {

	@Autowired
	private Map<String, MetaService> metaServices;
	
	public MetaService match(String serviceName) throws Exception {
		if(!metaServices.containsKey(serviceName)) {
			throw new Exception("服务不存在");
		}
		
		return metaServices.get(serviceName);
	}
	
}
