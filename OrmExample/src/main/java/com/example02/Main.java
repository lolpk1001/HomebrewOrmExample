package com.example02;

import com.orm.HomebrewOrm;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		homebrewOrm.removeTable("tableDossier");
	}
}
