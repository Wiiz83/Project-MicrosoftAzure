package org.miage.dao;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.miage.model.ProfilCSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

/**
 * @author uzanl
 * Classe permettant de lire les fichiers CSV
 */
@Repository
public class CSVReaderDAO {
	
	//https://www.extendoffice.com/fr/documents/excel/3097-excel-list-all-possible-combinations.html#a1
	
	private static final Logger logger = LoggerFactory.getLogger(CSVReaderDAO.class);
	
	public <T> List<T> loadObjectList(Class<T> type, String fileName) {
	    try {
	        CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
	        CsvMapper mapper = new CsvMapper();
	        File file = new ClassPathResource(fileName).getFile();
	        MappingIterator<T> readValues = 
	          mapper.reader(type).with(bootstrapSchema).readValues(file);
	        return readValues.readAll();
	    } catch (Exception e) {
	        logger.error("Error occurred while loading object list from file " + fileName, e);
	        return Collections.emptyList();
	    }
	}
	
	
	public List<ProfilCSV> loadProfils() {
		MappingIterator<ProfilCSV> personIter = null;
		try {
			File csvFile = new ClassPathResource("static/profils.csv").getFile();
			personIter = new CsvMapper().readerWithTypedSchemaFor(ProfilCSV.class).readValues(csvFile);
			return personIter.readAll();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}