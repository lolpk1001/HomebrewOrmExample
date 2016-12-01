package com.bean;

import com.orm.HomebrewOrmObject;

public class Copine implements HomebrewOrmObject{
	private String nom;
	
	public Copine(String nom){
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String toHomebrewOrmData() {
		return "nom"+nom;
	}
}
