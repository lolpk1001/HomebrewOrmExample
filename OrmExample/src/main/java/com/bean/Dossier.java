package com.bean;

import com.orm.HomebrewOrmObject;

public class Dossier implements HomebrewOrmObject {

	private String nom;
	private String infos;
	
	
	public Dossier(String nom, String infos) {
		super();
		this.nom = nom;
		this.infos = infos;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getInfos() {
		return infos;
	}

	public void setInfos(String infos) {
		this.infos = infos;
	}

	public String toHomebrewOrmData() {
		return "nom:"+nom+",infos:"+infos;
	}
}
