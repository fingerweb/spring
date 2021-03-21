package com.yuyz.tools.intf;


/**
 * 服务注册接口，通过{@link ServiceLoader} 注册服务
 * @author yuyz
 *
 */
public interface IExtServiceRegister {
	
	/**
	 *  相似的服务，用同一个服务前缀
	 * @return 服务前缀
	 */
	String getServicePrefix();
	
	/**
	 *  一组服务
	 * @return
	 */
	Class<? extends IExtServiceWrapper>[] getService();
}
