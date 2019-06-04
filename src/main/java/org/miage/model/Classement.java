package org.miage.model;

import java.util.HashMap;

/**
 * @author uzanl
 * Classe représentant l'objet retourné à l'utilisateur avec le classement des villes
 */
public class Classement {
	
	private static int count = 0;
	
	private int id;
	
	private HashMap<Integer, Commune> communes;
	
	public Classement() {
		this.setId(count++);
		this.communes = new HashMap<Integer, Commune>();
	}

	public void addCommune(Integer rank, Commune commune) {
		this.communes.put(rank, commune);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public HashMap<Integer, Commune> getCommunes() {
		return communes;
	}

	public void setCommunes(HashMap<Integer, Commune> communes) {
		this.communes = communes;
	}
}
