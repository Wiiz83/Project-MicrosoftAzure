package org.miage.dao;

import java.net.URI;
import java.util.List;

import org.miage.model.Commune;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class LogicAppAzureDAO {
	
	public List<Commune> getCommunes() {
		
		URI monUri = URI.create("https://prod-46.northeurope.logic.azure.com:443/workflows/4a0a60d815374a5da2a7a64061923da2/triggers/manual/paths/invoke?api-version=2016-10-01&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=vrAGnbLIKHkCs4vS06YF2d7zmNpBqxXiSFC01DdvWzU");
		RestTemplate restTemplate = new RestTemplate();
	    try {
	    	ResponseEntity<String> response = restTemplate.getForEntity(monUri, String.class);	 
	    	System.out.println(response);
	    }  catch(Exception e) {
	    	e.printStackTrace();
	    }
		return null;
	}

}
