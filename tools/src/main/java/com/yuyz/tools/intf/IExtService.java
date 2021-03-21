package com.yuyz.tools.intf;

/**
 * 扩展服务
 * @author yuyz
 *
 */
public interface IExtService {
	
	default String getName() {
		return this.getClass().getSimpleName();
	}
	
	default String getImpl() {
		return this.getClass().getName();
	}
	
	String getDescripton();
	
}
