package org.miage.model;

/**
 * @author uzanl
 * Représente le contenu d'une ligne du fichier profils.csv
 */
public class ProfilCSV {
	
	public long id_user;
	
	private boolean presence_ecoles;
	
	private boolean presence_colleges;
	
	private boolean nb_entreprises_fort;
	
	private boolean presence_equipements;
	
	private boolean densite_forte;

	public ProfilCSV(long id_user, boolean presence_ecoles, boolean presence_colleges, boolean nb_entreprises_fort,
			boolean presence_equipements, boolean densite_forte) {
		super();
		this.id_user = id_user;
		this.presence_ecoles = presence_ecoles;
		this.presence_colleges = presence_colleges;
		this.nb_entreprises_fort = nb_entreprises_fort;
		this.presence_equipements = presence_equipements;
		this.densite_forte = densite_forte;
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
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

}
