package com.yuyz.all.service;

import lombok.Data;

/**
 * 元服务, 将通过{@link ServiceLoader}注册的服务，保存到MetaService中
 * @author yuyz
 *
 */
@Data
public class MetaService {
	private String name;
	private String impl;
	private String description;
}
