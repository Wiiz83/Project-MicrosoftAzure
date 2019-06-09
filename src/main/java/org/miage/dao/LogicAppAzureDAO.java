package org.miage.dao;

import java.net.URI;
import java.util.ArrayList;
import org.miage.model.Commune;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

@Repository
public class LogicAppAzureDAO {
	
	public void loadCommunes() {
		URI monUri = URI.create("https://prod-46.northeurope.logic.azure.com:443/workflows/4a0a60d815374a5da2a7a64061923da2/triggers/manual/paths/invoke?api-version=2016-10-01&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=vrAGnbLIKHkCs4vS06YF2d7zmNpBqxXiSFC01DdvWzU");
		RestTemplate restTemplate = new RestTemplate();
		try {
	    	ResponseEntity<String> response = restTemplate.getForEntity(monUri, String.class);	    	
	    	ObjectMapper mapper = new ObjectMapper();
	    	ArrayNode communes = (ArrayNode) mapper.readTree(response.getBody());
	    	ArrayList<Commune> listeCommunes = new ArrayList<Commune>();
	    	if (communes.isArray()) {
	    	    for (final JsonNode commune : communes) {
	    	    	listeCommunes.add(mapper.treeToValue(commune, Commune.class));
	    	    }
	    	}
	    	Commune.communes = listeCommunes;
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
