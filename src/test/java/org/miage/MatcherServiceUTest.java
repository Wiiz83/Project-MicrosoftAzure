package org.miage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.miage.model.Formulaire;
import org.miage.model.ProfilCSV;
import org.miage.service.MatcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatcherServiceUTest {
	
	@Autowired
	private MatcherService matcherService;
	
	@Test
	public void testGetProfilFromFormulaire() {
		Formulaire formulaire = new Formulaire("yes", "yes", "yes", "yes", "forte");
		ProfilCSV profil = matcherService.getProfilFromFormulaire(formulaire);
		System.out.println(profil.toString());
	}

}
