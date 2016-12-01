package com.bean;

import com.orm.HomebrewOrmObject;

public class Banque implements HomebrewOrmObject{

	private String name;
	
	
	
	public Banque(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String toHomebrewOrmData() {
		return "name:"+name;
	}
}
