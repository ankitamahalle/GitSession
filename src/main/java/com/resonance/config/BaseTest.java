package com.resonance.config;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.resonance.keywords.UIKeywords;
import com.resonance.util.EnvironmentFile;
import com.resonance.util.OR;

public class BaseTest {
	public EnvironmentFile env = new EnvironmentFile(); //if EnvironmentFile me getUrl method ko static kiya toh class ka 
	//object nhi bnana padega aur directly class ka naam likh ko uski method ko call kr sakte hai 
	public OR repo = new OR();
	@BeforeMethod
	public void setUp() throws FileNotFoundException {
		UIKeywords.openBrowser("chrome");
		UIKeywords.launchUrl(env.getAppUrl());
	}

	@AfterMethod
	public void tearDown() {
		//UIKeywords.closeBrowser();
	}
}
