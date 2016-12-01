package com.example07;

import java.util.HashMap;

import com.bean.User;
import com.orm.HomebrewOrm;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		User user = new User("Christian", "Suciu", 911);
		homebrewOrm.insert(user, "tableUser");
		User user2 = new User("jean-daniel", "rondeau", 51656);
		homebrewOrm.insert(user2, "tableUser");
		User user3 = new User("kevin", "caro silva", 9819081);
		homebrewOrm.insert(user3, "tableUser");
		User user4 = new User("adam", "jimenez", 18108028);
		homebrewOrm.insert(user4, "tableUser");
		User user5 = new User("nimajneb", "lirab", 189180);
		homebrewOrm.insert(user5, "tableUser");
		User user6 = new User("ben", "isArockStar", 1809810);
		homebrewOrm.insert(user6, "tableUser");
		User user7 = new User("yoda", "yoda", 190869);
		homebrewOrm.insert(user7, "tableUser");
		User user8 = new User("Reda", "Hamza", 88109);
		homebrewOrm.insert(user8, "tableUser");
		
		homebrewOrm.commit();
		
		HashMap<String, String> where = null;
		System.out.println(homebrewOrm.select("tableUser", where));
		
		where= new HashMap<String, String>();
		where.put("firstName", "Reda");
		System.out.println(homebrewOrm.select("tableUser", where));
	}
}
