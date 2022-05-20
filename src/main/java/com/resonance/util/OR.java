package com.resonance.util;

public class OR {
	
	String filePath = "/src/main/resources/OR.properties";
	PropertiesFile prop = new PropertiesFile();
	
	public String AssignmentLocator() {
		
		return prop.getValue(filePath, "assignment");
	}
	
	public String confirmationAlertLocator() {
		return prop.getValue(filePath, "confirmation_alert");
	}
	
}
