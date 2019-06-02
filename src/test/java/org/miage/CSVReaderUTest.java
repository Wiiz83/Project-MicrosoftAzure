package org.miage;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.miage.dao.CSVReaderDAO;
import org.miage.model.ProfilCSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CSVReaderUTest {
	
	@Autowired
	private CSVReaderDAO csvReader;
	
	@Test
	public void testProfilsReader() {
		List<ProfilCSV> listProfil = csvReader.loadProfils();
		System.out.println(listProfil.size());
	}

}