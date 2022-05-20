package com.resonance.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {

	public static RemoteWebDriver driver = null;

	public static void openBrowser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else {
			System.err.println("Invalid Browser Name " + BrowserName);
		}
	}

	public static void launchUrl(String Url) {
		driver.get(Url);
		System.out.println("Url is launched");
	}

	public static String getTitle() {
		System.out.println("Title of page:" + driver.getTitle());
		return driver.getTitle();
	}

	/**
	 * This method can be use to provide text in specified {@code WebElement}
	 * 
	 * @param element     in which you want to enter text
	 * @param textToEnter this is the text that you want to enter
	 */
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);
	}

	public static void enterText(By by, String textToEnter) {
		driver.findElement(by).sendKeys(textToEnter);
	}

	public static void enterText(String locatorValue, String textToEnter) {
		driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}

	public static void quiteBrowser() {
		driver.quit();
		System.out.println("Browser windows are quite");
	}

	public static void click(String locator) {
		String locatorType = locator.split("##")[0];
		String locatorValue = locator.split("##")[1];
		
		switch (locatorType) {
		case "XPATH":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "CSS":
			driver.findElement(By.cssSelector(locatorValue)).click();
			break;
		case "ID":
			driver.findElement(By.id(locatorValue)).click();
		default:
			System.err.println("Invalid locator type: "+locatorType);
			break;
		}
		
	}
	
}
