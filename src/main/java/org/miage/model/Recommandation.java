package org.miage.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author uzanl
 * Classe représentant l'objet retourné à l'utilisateur avec le classement des villes
 */
public class Recommandation {
	
	public static ArrayList<Recommandation> recommandations = new ArrayList<Recommandation>();
	
	public int userId;
	
	public HashMap<Integer, Commune> communes;
	
	public Recommandation(int userId) {
		this.userId = userId;
		this.communes = new HashMap<Integer, Commune>();
		recommandations.add(this);
	}

	public void addCommune(Integer rank, Commune commune) {
		this.communes.put(rank, commune);
	}

	public int getId() {
		return userId;
	}

	public void setId(int userId) {
		this.userId = userId;
	}
	
	public HashMap<Integer, Commune> getCommunes() {
		return communes;
	}

	public void setCommunes(HashMap<Integer, Commune> communes) {
		this.communes = communes;
	}

	@Override
	public String toString() {
		return "Recommandation [userId=" + userId + ", communes=" + communes.toString() + "]";
	}
	
	
}
