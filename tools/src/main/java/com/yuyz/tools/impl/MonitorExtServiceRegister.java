package com.yuyz.tools.impl;

import com.yuyz.tools.extService.RedisMonitorExtServiceWrapper;
import com.yuyz.tools.intf.IExtServiceRegister;
import com.yuyz.tools.intf.IExtServiceWrapper;

public class MonitorExtServiceRegister implements IExtServiceRegister{

	public String getServicePrefix() {
		return "Monitor";
	}

	@SuppressWarnings("unchecked")
	public Class<? extends IExtServiceWrapper>[] getService() {
		return new Class[] {
				RedisMonitorExtServiceWrapper.class
		};
	}

}
