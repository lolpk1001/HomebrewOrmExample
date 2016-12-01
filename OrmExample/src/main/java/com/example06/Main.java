package com.example06;

import java.util.HashMap;

import com.orm.HomebrewOrm;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		HashMap<String, String> where = new HashMap<String, String>();
		where.put("firstName", "Cristian");
		
		homebrewOrm.removeValue("tableUser", where);
		homebrewOrm.commit();
	}
}
