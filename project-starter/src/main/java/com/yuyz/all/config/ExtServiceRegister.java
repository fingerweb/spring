package com.yuyz.all.config;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.yuyz.all.service.MetaService;
import com.yuyz.tools.intf.IExtServiceRegister;
import com.yuyz.tools.intf.IExtServiceWrapper;

@Component
public class ExtServiceRegister {

	@Bean
	public Map<String, MetaService> initMetaService() throws InstantiationException, IllegalAccessException{
		Map<String, MetaService> metaServices = new HashMap<>();
		
		ServiceLoader<IExtServiceRegister> services = ServiceLoader.load(IExtServiceRegister.class);
		for(IExtServiceRegister service :  services) {
			String servicePrefix = service.getServicePrefix();
			Class<? extends IExtServiceWrapper>[] wrapper = service.getService();
			for(Class<? extends IExtServiceWrapper> clazz : wrapper) {
				IExtServiceWrapper esw = clazz.newInstance();
				
				MetaService metaService = new MetaService();
				String serviceName = servicePrefix + "_" + esw.getName();
				metaService.setName(serviceName);
				metaService.setImpl(esw.getImpl());
				metaService.setDescription(esw.getDescripton());
				
				metaServices.put(serviceName, metaService);
			}
		}
		
		return metaServices;
	}
}
