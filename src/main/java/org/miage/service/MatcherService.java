package org.miage.service;

import org.miage.dao.CSVReaderDAO;
import org.miage.dao.LogicAppAzureDAO;
import org.miage.model.Classement;
import org.miage.model.Commune;
import org.miage.model.Formulaire;
import org.miage.model.ProfilCSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author uzanl
 * Service construisant le classement de villes en fonction du formulaire 
 */
@Service
public class MatcherService {
	
	@Autowired
	private LogicAppAzureDAO logicApp;
	
	@Autowired
	private CSVReaderDAO csvReader;
	
	public List<Classement> construireClassementVilles(Formulaire formulaire){
		ProfilCSV profilEnCours = getProfilFromFormulaire(formulaire);
		
		return null;
	}
	
	public void updateDetailsCommunes() {
		List<Commune> communes = logicApp.getCommunes();
		
		
	}
	
	public ProfilCSV getProfilFromFormulaire(Formulaire formulaire) {
		List<ProfilCSV> profils = csvReader.loadProfils();
		
		ArrayList<Predicate<ProfilCSV>> listePredicats = new ArrayList<Predicate<ProfilCSV>>();
		
		Predicate<ProfilCSV> isEcolesActive;
		switch (formulaire.getEcoles()) {
			case "oui":
			case "yes":
				isEcolesActive = p -> p.isPresence_ecoles() == true;
				listePredicats.add(isEcolesActive);
				break;
			case "no":
			case "non":
				isEcolesActive = p -> p.isPresence_ecoles() == false;
				listePredicats.add(isEcolesActive);
				break;
			default:
				System.out.println("Présence des écoles indifférent");
				break;
		}
		
		Predicate<ProfilCSV> isCollegesActive;
		switch (formulaire.getColleges()) {
			case "oui":
			case "yes":
				isCollegesActive = p -> p.isPresence_colleges() == true;
				listePredicats.add(isCollegesActive);
				break;
			case "no":
			case "non":
				isCollegesActive = p -> p.isPresence_colleges() == false;
				listePredicats.add(isCollegesActive);
				break;
			default:
				System.out.println("Présence des collèges indifférent");
				break;
		}
		
		Predicate<ProfilCSV> isEntreprisesActive;
		switch (formulaire.getEntreprises()) {
			case "oui":
			case "yes":
				isEntreprisesActive = p -> p.isNb_entreprises_fort() == true;
				listePredicats.add(isEntreprisesActive);
				break;
			case "no":
			case "non":
				isEntreprisesActive = p -> p.isNb_entreprises_fort() == false;
				listePredicats.add(isEntreprisesActive);
				break;
			default:
				System.out.println("Présence des entreprises indifférent");
				break;
		}
		
		Predicate<ProfilCSV> isSportifsActive;
		switch (formulaire.getSportifs()) {
			case "oui":
			case "yes":
				isSportifsActive = p -> p.isPresence_equipements() == true;
				listePredicats.add(isSportifsActive);
				break;
			case "no":
			case "non":
				isSportifsActive = p -> p.isPresence_equipements() == false;
				listePredicats.add(isSportifsActive);
				break;
			default:
				System.out.println("Présence des équipements sportifs indifférent");
				break;
		}
		
		Predicate<ProfilCSV> isDensiteActive;
		switch (formulaire.getDensite()) {
			case "forte":
			case "fort":
				isDensiteActive = p -> p.isDensite_forte() == true;
				listePredicats.add(isDensiteActive);
				break;
			case "faible":
			case "non":
				isDensiteActive = p -> p.isDensite_forte() == false;
				listePredicats.add(isDensiteActive);
				break;
			default:
				System.out.println("Dentsité de population indifférent");
				break;
		}
	
		Predicate<ProfilCSV> pred = listePredicats.stream().reduce(Predicate::and).orElse(x->true);
		return profils.stream().filter(pred).findAny().orElse(null);
	}

}
