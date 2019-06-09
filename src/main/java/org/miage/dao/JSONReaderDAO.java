package org.miage.dao;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.miage.model.Commune;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class JSONReaderDAO {
	
	public void loadCommunes() {
		ObjectMapper mapper = new ObjectMapper();
        try {
        	File jsonFile = new ClassPathResource("static/communes.json").getFile();
        	String json = FileUtils.readFileToString(jsonFile, StandardCharsets.UTF_8);
			Commune.communes = mapper.readValue(json, new TypeReference<List<Commune>>(){});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
