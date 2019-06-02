package org.miage.service;

import org.miage.dao.LogicAppAzureDAO;
import org.miage.model.Classement;
import org.miage.model.Commune;
import org.miage.model.Formulaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author uzanl
 * Service construisant le classement de villes en fonction du formulaire 
 */
@Service
public class MatcherService {
	
	@Autowired
	private LogicAppAzureDAO logicApp;
	
	public List<Classement> construireClassementVilles(Formulaire formulaire){
		
		System.out.println("YOLOLO");
		
		return null;
		
	}
	
	public void updateDetailsCommunes() {
		List<Commune> communes = logicApp.getCommunes();
		
		
	}

}
