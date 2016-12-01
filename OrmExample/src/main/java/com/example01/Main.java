package com.example01;

import com.orm.HomebrewOrm;
import com.orm.HomebrewOrmDataTypes;
import com.orm.HomebrewOrmTable;
import com.orm.HomebrewOrmTableValue;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		HomebrewOrmTable tableUser = new HomebrewOrmTable();
		tableUser.setTableName("tableUser");
		
		HomebrewOrmTableValue valueFirstName = new HomebrewOrmTableValue("firstName", HomebrewOrmDataTypes.stringType.getValueString());
		HomebrewOrmTableValue valueLastName = new HomebrewOrmTableValue("lastName", HomebrewOrmDataTypes.stringType.getValueString());
		HomebrewOrmTableValue valueTelephone = new HomebrewOrmTableValue("telephoneNumber", HomebrewOrmDataTypes.integerType.getValueString());
		
		tableUser.addValue(valueFirstName);
		tableUser.addValue(valueLastName);
		tableUser.addValue(valueTelephone);
		
		homebrewOrm.createTable(tableUser);
		
		
		HomebrewOrmTable tableDossier = new HomebrewOrmTable();
		tableDossier.setTableName("tableDossier");
		
		HomebrewOrmTableValue valueNom = new HomebrewOrmTableValue("nom", HomebrewOrmDataTypes.stringType.getValueString());
		HomebrewOrmTableValue valueInfos = new HomebrewOrmTableValue("infos", HomebrewOrmDataTypes.stringType.getValueString());
		
		tableDossier.addValue(valueNom);
		tableDossier.addValue(valueInfos);
		
		homebrewOrm.createTable(tableDossier);
	}
}
