package com.yuyz.tools.intf;

import java.util.List;

import org.apache.commons.lang3.reflect.MethodUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class IExtServiceWrapper implements IExtService{
	public Object doCmd(List<String> args) {
		String methodName = args.get(0);
		args.remove(0);
		Object result;
		try {
			result = MethodUtils.invokeStaticMethod(this.getClass(), methodName, args.toArray());
			return result;
		} catch (Exception e) {
			log.error(e.toString() + "{服务调用异常: { ClassName:{}, args:{}}}",
					this.getClass(), args);
			return "服务调用异常";
		}
	}
}
