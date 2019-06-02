package org.miage;

import java.util.HashMap;
import java.util.List;

public class Commune {
	
	/*
    {
        "nom": "Aspret-Sarrat",
        "code": "31021",
        "codesPostaux": [
            "31800"
        ],
        "surface": 398.67,
        "codeDepartement": "31",
        "codeRegion": "76",
        "population": 139,
        "departement": {
            "code": "31",
            "nom": "Haute-Garonne"
        },
        "region": {
            "code": "76",
            "nom": "Occitanie"
        },
        "entreprises": 24,
        "ecoles": null,
        "colleges": null,
        "densite": 0.34865929214638675,
        "equipements": null
    }
	 */
	
	private String nom;
	private int code;
	private List<String> codesPostaux;
	private int surface;
	private String codeDepartement;
	private String codeRegion;
	private int population;
	private HashMap<String, String> departement;
	private HashMap<String, String> region;
	private int entreprises;
	private int ecoles;
	private int colleges;
	private float densite;
	private int equipements;

	public Commune() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<String> getCodesPostaux() {
		return codesPostaux;
	}

	public void setCodesPostaux(List<String> codesPostaux) {
		this.codesPostaux = codesPostaux;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public HashMap<String, String> getDepartement() {
		return departement;
	}

	public void setDepartement(HashMap<String, String> departement) {
		this.departement = departement;
	}

	public HashMap<String, String> getRegion() {
		return region;
	}

	public void setRegion(HashMap<String, String> region) {
		this.region = region;
	}

	public int getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(int entreprises) {
		this.entreprises = entreprises;
	}

	public int getEcoles() {
		return ecoles;
	}

	public void setEcoles(int ecoles) {
		this.ecoles = ecoles;
	}

	public int getColleges() {
		return colleges;
	}

	public void setColleges(int colleges) {
		this.colleges = colleges;
	}

	public float getDensite() {
		return densite;
	}

	public void setDensite(float densite) {
		this.densite = densite;
	}

	public int getEquipements() {
		return equipements;
	}

	public void setEquipements(int equipements) {
		this.equipements = equipements;
	}

	

}
