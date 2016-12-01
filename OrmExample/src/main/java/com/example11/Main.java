package com.example11;

import com.orm.HomebrewOrm;
import com.orm.HomebrewOrmDataTypes;
import com.orm.HomebrewOrmTable;
import com.orm.HomebrewOrmTableValue;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		HomebrewOrmTable tableCopine = new HomebrewOrmTable();
		tableCopine.setTableName("tableCopine");
		
		HomebrewOrmTableValue valueNom = new HomebrewOrmTableValue("nom", HomebrewOrmDataTypes.stringType.getValueString());
		
		tableCopine.addValue(valueNom);
		
		homebrewOrm.createTable(tableCopine);
		
		homebrewOrm.manyToMany("tableCopine", "tableUser");
	}
}
