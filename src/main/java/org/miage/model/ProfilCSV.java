package org.miage.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author uzanl
 * Représente le contenu d'une ligne du fichier profils.csv
 */

@JsonPropertyOrder({ "id_user", "densite_forte", "nb_entreprises_fort", "presence_colleges", "presence_ecoles", "presence_equipements" })

public class ProfilCSV {
	
	public String id_user;
	
	private boolean presence_ecoles;
	
	private boolean presence_colleges;
	
	private boolean nb_entreprises_fort;
	
	private boolean presence_equipements;
	
	private boolean densite_forte;
	
	public ProfilCSV() {
		
	}

	public ProfilCSV(String id_user, boolean densite_forte, boolean nb_entreprises_fort, boolean presence_colleges, boolean presence_ecoles, boolean presence_equipements) {
		super();
		this.id_user = id_user;
		this.presence_ecoles = presence_ecoles;
		this.presence_colleges = presence_colleges;
		this.nb_entreprises_fort = nb_entreprises_fort;
		this.presence_equipements = presence_equipements;
		this.densite_forte = densite_forte;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public boolean isPresence_ecoles() {
		return presence_ecoles;
	}

	public void setPresence_ecoles(boolean presence_ecoles) {
		this.presence_ecoles = presence_ecoles;
	}

	public boolean isPresence_colleges() {
		return presence_colleges;
	}

	public void setPresence_colleges(boolean presence_colleges) {
		this.presence_colleges = presence_colleges;
	}

	public boolean isNb_entreprises_fort() {
		return nb_entreprises_fort;
	}

	public void setNb_entreprises_fort(boolean nb_entreprises_fort) {
		this.nb_entreprises_fort = nb_entreprises_fort;
	}

	public boolean isPresence_equipements() {
		return presence_equipements;
	}

	public void setPresence_equipements(boolean presence_equipements) {
		this.presence_equipements = presence_equipements;
	}

	public boolean isDensite_forte() {
		return densite_forte;
	}

	public void setDensite_forte(boolean densite_forte) {
		this.densite_forte = densite_forte;
	}

	@Override
	public String toString() {
		return "ProfilCSV [id_user=" + id_user + ", presence_ecoles=" + presence_ecoles + ", presence_colleges="
				+ presence_colleges + ", nb_entreprises_fort=" + nb_entreprises_fort + ", presence_equipements="
				+ presence_equipements + ", densite_forte=" + densite_forte + "]";
	}
	
	

}
