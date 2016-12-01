package com.example09;

import com.orm.HomebrewOrm;
import com.orm.HomebrewOrmDataTypes;
import com.orm.HomebrewOrmTable;
import com.orm.HomebrewOrmTableValue;

public class Main {
	public static void main(String[] args) {
		HomebrewOrm homebrewOrm = HomebrewOrm.getInstance();
		
		HomebrewOrmTable tableDossier = new HomebrewOrmTable();
		tableDossier.setTableName("tableDossier");
		
		HomebrewOrmTableValue valueNom = new HomebrewOrmTableValue("nom", HomebrewOrmDataTypes.stringType.getValueString());
		HomebrewOrmTableValue valueInfos = new HomebrewOrmTableValue("infos", HomebrewOrmDataTypes.stringType.getValueString());
		
		tableDossier.addValue(valueNom);
		tableDossier.addValue(valueInfos);
		
		homebrewOrm.createTable(tableDossier);
		
		homebrewOrm.oneToOne("tableUser", "tableDossier");
	}
}
