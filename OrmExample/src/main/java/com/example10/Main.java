package com.example10;

import com.orm.HomebrewOrm;
import com.orm.HomebrewOrmDataTypes;
import com.orm.HomebrewOrmTable;
import com.orm.HomebrewOrmTableValue;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		HomebrewOrmTable tableBanque = new HomebrewOrmTable();
		tableBanque.setTableName("tableBanque");
		
		HomebrewOrmTableValue valueNom = new HomebrewOrmTableValue("nom", HomebrewOrmDataTypes.stringType.getValueString());
		
		tableBanque.addValue(valueNom);
		
		homebrewOrm.createTable(tableBanque);
		
		homebrewOrm.oneToMany("tableBanque", "tableUser");
	}
}
