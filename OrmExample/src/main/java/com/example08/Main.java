package com.example08;

import com.orm.HomebrewOrm;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		homebrewOrm.pretty(homebrewOrm.select("tableUser", null));
	}
}
