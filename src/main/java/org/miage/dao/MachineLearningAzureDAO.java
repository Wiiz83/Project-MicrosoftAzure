package org.miage.dao;

import java.util.ArrayList;

import org.miage.model.Commune;
import org.miage.model.Recommandation;
import org.miage.model.Utilisateur;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Repository
public class MachineLearningAzureDAO {
	
	public Recommandation getRecommandations(Utilisateur utilisateur) {
		try {
			HttpResponse<String> response = Unirest.post("https://europewest.services.azureml.net/workspaces/c7c9b9ec6de7407da9515ede99998a09/services/5031634e902e44278148141f34b0496c/execute?api-version=2.0&format=swagger")
					  .header("Authorization", "Bearer mf+ecyRpizkN9U/Cf1h6JFb2MxCFknq+8bre7mTYNyW7LiTxSS9Z9woBzPuwoULZunrSipIEXCOPYAvJyLCSkw==")
					  .header("Accept", "application/json")
					  .header("Content-Type", "application/json")
					  .header("User-Agent", "PostmanRuntime/7.13.0")
					  .header("Cache-Control", "no-cache")
					  .header("Postman-Token", "489ec2ec-88f4-44c9-90f1-5338bad2f604,029a268a-acc3-4566-9253-7f96cb101bdc")
					  .header("Host", "europewest.services.azureml.net")
					  .header("accept-encoding", "gzip, deflate")
					  .header("Connection", "keep-alive")
					  .header("cache-control", "no-cache")
					  .body("{\r\n    \"Inputs\": {\r\n        \"newuser_if\": [\r\n            {\r\n                \"id_user\": "+utilisateur.getId_user()+",\r\n                \"densite_forte\": "+utilisateur.isDensite_forte()+",\r\n                \"nb_entreprises_fort\": "+utilisateur.isNb_entreprises_fort()+",\r\n                \"presence_colleges\": "+utilisateur.isPresence_colleges()+",\r\n                \"presence_ecoles\": "+utilisateur.isPresence_ecoles()+",\r\n                \"presence_equipements\": "+utilisateur.isPresence_equipements()+"\r\n            }\r\n        ],\r\n        \"predict\": [\r\n            {\r\n                \"id_user\": "+utilisateur.getId_user()+",\r\n                \"code_ville\": null,\r\n                \"note\": null\r\n            }\r\n        ]\r\n    },\r\n    \"GlobalParameters\": {}\r\n}")
					  .asString();
			System.out.println(response.getBody().toString());

			  	
	    	ObjectMapper mapper = new ObjectMapper();
	    	JsonNode root = mapper.readTree(response.getBody());
	    	JsonNode results = root.get("Results");
	    	ArrayNode output = (ArrayNode) results.get("output1");
	    	JsonNode result = output.get(0);
	    	Recommandation recommandation = new Recommandation(Integer.parseInt(result.get("User").asText()));
	    	Commune commune1 = Commune.communes.stream().filter((c) -> c.getCode() == Integer.parseInt(result.get("Item 1").asText())).findAny().orElse(null);
	    	System.out.println(commune1.toString());
	    	Commune commune2 = Commune.communes.stream().filter((c) -> c.getCode() == Integer.parseInt(result.get("Item 2").asText())).findAny().orElse(null);
	    	System.out.println(commune2.toString());
	    	Commune commune3 = Commune.communes.stream().filter((c) -> c.getCode() == Integer.parseInt(result.get("Item 3").asText())).findAny().orElse(null);
	    	System.out.println(commune3.toString());
	    	Commune commune4 = Commune.communes.stream().filter((c) -> c.getCode() == Integer.parseInt(result.get("Item 4").asText())).findAny().orElse(null);
	    	System.out.println(commune4.toString());
	    	Commune commune5 = Commune.communes.stream().filter((c) -> c.getCode() == Integer.parseInt(result.get("Item 5").asText())).findAny().orElse(null);
	    	System.out.println(commune5.toString());
	    	recommandation.addCommune(1, commune1);
			recommandation.addCommune(2, commune2);
			recommandation.addCommune(3, commune3);
			recommandation.addCommune(4, commune4);
			recommandation.addCommune(5, commune5);
			System.out.println(recommandation);
			return recommandation;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}

}
