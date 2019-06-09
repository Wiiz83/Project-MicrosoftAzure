package org.miage.model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	
	private static ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	
	private static int count = 0;
	
	private int id_user;
	
	private boolean presence_ecoles;
	
	private boolean presence_colleges;
	
	private boolean nb_entreprises_fort;
	
	private boolean presence_equipements;
	
	private boolean densite_forte;

	public Utilisateur() {
		this.setId_user(count++);
		utilisateurs.add(this);
	}

	public Utilisateur(int id_user, boolean densite_forte, boolean nb_entreprises_fort, boolean presence_colleges, boolean presence_ecoles, boolean presence_equipements) {
		super();
		this.id_user = id_user;
		this.presence_ecoles = presence_ecoles;
		this.presence_colleges = presence_colleges;
		this.nb_entreprises_fort = nb_entreprises_fort;
		this.presence_equipements = presence_equipements;
		this.densite_forte = densite_forte;
		utilisateurs.add(this);
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
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
		return "Utilisateur [id_user=" + id_user + ", presence_ecoles=" + presence_ecoles + ", presence_colleges="
				+ presence_colleges + ", nb_entreprises_fort=" + nb_entreprises_fort + ", presence_equipements="
				+ presence_equipements + ", densite_forte=" + densite_forte + "]";
	}
	
	public static List<Integer> getAllId(){
		List<Integer> list = new ArrayList<Integer>();
		for (Utilisateur utilisateur : utilisateurs) {
			list.add(utilisateur.getId_user());
		}
		return list;
	}
	
}
