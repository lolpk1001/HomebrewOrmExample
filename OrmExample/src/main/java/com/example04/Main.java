package com.example04;

import java.util.HashMap;

import com.orm.HomebrewOrm;
import com.orm.HomebrewOrmTableValue;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		HashMap<String, String> collumnsToUpdate = new HashMap<String, String>();
		collumnsToUpdate.put("firstName", "Cristian");
		
		HashMap<String, String> where = new HashMap<String, String>();
		where.put("firstName", "Christian");
		
		homebrewOrm.updateData("tableUser", collumnsToUpdate, where);
		homebrewOrm.commit();
	}
}
