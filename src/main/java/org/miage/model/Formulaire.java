package org.miage.model;

public class Formulaire {

    private String ecoles;
    private String colleges;
    private String entreprises;
    private String sportifs;
    private String densite;

	public Formulaire() {
		
	}
	
	public Formulaire(String ecoles, String colleges, String entreprises, String sportifs, String densite) {
		super();
		this.ecoles = ecoles;
		this.colleges = colleges;
		this.entreprises = entreprises;
		this.sportifs = sportifs;
		this.densite = densite;
	}
	
	public String getEcoles() {
		return ecoles;
	}
	public void setEcoles(String ecoles) {
		this.ecoles = ecoles;
	}
	public String getColleges() {
		return colleges;
	}
	public void setColleges(String colleges) {
		this.colleges = colleges;
	}
	public String getEntreprises() {
		return entreprises;
	}
	public void setEntreprises(String entreprises) {
		this.entreprises = entreprises;
	}
	public String getSportifs() {
		return sportifs;
	}
	public void setSportifs(String sportifs) {
		this.sportifs = sportifs;
	}
	public String getDensite() {
		return densite;
	}
	public void setDensite(String densite) {
		this.densite = densite;
	}

    
}