package org.miage.dao;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.miage.model.Commune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class JSONReaderDAO {
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	public void loadCommunes() {
		ObjectMapper mapper = new ObjectMapper();
        try {
        	Resource resource = resourceLoader.getResource("classpath:static/communes.json");
        	InputStream dbAsStream = resource.getInputStream(); 
        	
        	//File jsonFile = new ClassPathResource("static/communes.json").getFile();
        	String json = IOUtils.toString(dbAsStream, StandardCharsets.UTF_8); //FileUtils.readFileToString(jsonFile, StandardCharsets.UTF_8);
			Commune.communes = mapper.readValue(json, new TypeReference<List<Commune>>(){});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
