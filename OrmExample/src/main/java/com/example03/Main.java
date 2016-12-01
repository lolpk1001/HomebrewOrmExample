package com.example03;

import com.bean.Dossier;
import com.bean.User;
import com.orm.HomebrewOrm;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		User user = new User("Christian", "Suciu", 911);
		homebrewOrm.insert(user, "tableUser");
		//homebrewOrm.commit();
	}
}
