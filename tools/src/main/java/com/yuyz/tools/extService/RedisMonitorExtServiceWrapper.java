package com.yuyz.tools.extService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.yuyz.tools.intf.IExtServiceWrapper;

public class RedisMonitorExtServiceWrapper extends IExtServiceWrapper{
	
	/**
	 * 模拟redis数据
	 */
	private static final Map<String, String> SIMULATE_REDIS_DATA;
	static {
		SIMULATE_REDIS_DATA = new ConcurrentHashMap<>();
		for(int i = 0; i < 10; i++) {
			SIMULATE_REDIS_DATA.put("user" + i, "name"+i);
		}
	}
	
	@Override
	public String getDescripton() {
		return "Monitor 扩展服务";
	}
	
	public static String getRedisHost() {
		return "redis: 127.0.0.1";
	}
	
	public static String getRedisData(String redisKey) {
		return SIMULATE_REDIS_DATA.containsKey(redisKey) ? 
			SIMULATE_REDIS_DATA.get(redisKey) : "redis中不存在相关数据";
	}
	
	
	
}
