package org.miage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.miage.dao.LogicAppAzureDAO;
import org.miage.model.Commune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogicAppAzureUTest {

	@Autowired
	private LogicAppAzureDAO logicAppAzureDAO;
	
	@Test
	public void testEntrepriseByDepartment() {
		logicAppAzureDAO.loadCommunes();
		System.out.println(Commune.communes.size());
	}
}
