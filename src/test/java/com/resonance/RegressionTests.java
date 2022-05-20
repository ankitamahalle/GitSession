package com.resonance;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.config.BaseTest;
import com.resonance.keywords.UIKeywords;
import com.resonance.pages.HomePage;
import com.resonance.util.EnvironmentFile;
import com.resonance.util.PropertiesFile;

public class RegressionTests extends BaseTest {

	 UIKeywords keyword = new UIKeywords();
	 
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {

		String actualTitle = UIKeywords.getTitle();
		WebElement element = null;
		// WebElement element= UIKeywords.driver.findElement(By.xpath(""));
		// By by = By.xpath("");

		// UIKeywords.enterText("//input[@id=123]", "hello");
		// Assert.assertEquals("Home Page", actualTitle);

	}

	@Test
	public void verfifyConfirmationAlertIsOpened() {
		PropertiesFile prop = new PropertiesFile();
		//String assignment =prop.getValue("/src/main/resources/OR.properties", "assignment");
		//UIKeywords.click(repo.AssignmentLocator()); for keywordDriven framework
		//String confAlert =prop.getValue("/src/main/resources/OR.properties", "confirmation_alert");
		//UIKeywords.click(repo.confirmationAlertLocator());
		
//		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class); // using findby annotation
		HomePage home = new HomePage();// for constructor use 
		home.clickOnAssignment();
	}

}
