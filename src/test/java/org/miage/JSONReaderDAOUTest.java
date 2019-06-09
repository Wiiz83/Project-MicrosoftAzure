package org.miage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JSONReaderDAOUTest {
	
	@Autowired
	private org.miage.dao.JSONReaderDAO JSONReaderDAO;
	
	@Test
	public void testProfilsReader() {
		JSONReaderDAO.loadCommunes();
	}

}
