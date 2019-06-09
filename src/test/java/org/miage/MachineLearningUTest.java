package org.miage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.miage.dao.MachineLearningAzureDAO;
import org.miage.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MachineLearningUTest {

	@Autowired
	private MachineLearningAzureDAO machineLearningAzureDAO;
	
	@Test
	public void testNewProfile() {
		Utilisateur utilisateur = new Utilisateur(999, true, true, true, true, true);
		machineLearningAzureDAO.getRecommandations(utilisateur);
	}
	
}
