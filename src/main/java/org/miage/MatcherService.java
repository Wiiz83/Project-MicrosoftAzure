package org.miage;

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
		List<Commune> communes = logicApp.getCommunes();
		
		
		System.out.println("YOLOLO");
		
		return null;
		
	}

}
