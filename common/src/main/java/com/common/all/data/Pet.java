package com.common.all.data;

import lombok.Data;

@Data
public class Pet {
	private String name;
	private String call;
	private Type species;
	
	enum Type{
		CAT, DOG
	}
}
