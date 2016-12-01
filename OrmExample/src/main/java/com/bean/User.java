package com.bean;

import com.orm.HomebrewOrmObject;

public class User implements HomebrewOrmObject{

	private String firstName;
	private String lastName;
	private int telephoneNumber;
	
	public User(String firstName, String lastName, int telephoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
	}
	
	public String toHomebrewOrmData() {
		return "firstName:"+firstName+",lastName:"+lastName+
				",telephoneNumber:"+telephoneNumber;
	}
}
