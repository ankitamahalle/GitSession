package com.resonance.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentFile {
	/**
	 * This method returns the app url present in environment.properties file
	 * @throws FileNotFoundException 
	 */
	public String getAppUrl() throws FileNotFoundException {
		String baseDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(baseDir+"/src/main/resources/environment.properties");
		Properties prop = new Properties();
		
		String value = "";
		try {
			prop.load(fis);
			value = prop.getProperty("app_url");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
