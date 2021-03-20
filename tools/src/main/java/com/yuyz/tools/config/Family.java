package com.yuyz.tools.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.yuyz.tools.data.Member;
import com.yuyz.tools.data.Pet;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="spring.family")
public class Family{
	/** 地址 */
	private String address;
	/** 家庭成员 */
	private List<Member> familyMember;
	/** 宠物 */
	private Map<String, Pet> pets;
}
