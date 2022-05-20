package com.resonance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.keywords.UIKeywords;

public class HomePage {
	UIKeywords keyword = new UIKeywords();
	
	@FindBy(css="a[href=\"/assignments\"]")
	WebElement assignmentsLnk;
	@FindBy(css="")
	WebElement coursesLnk;
	@FindBy(css="")
	WebElement videosLnk;
	
	WebElement NotesLnk;
	WebElement recentPlacementsLnk;
	
	//without pageFactory and @findBy "by class ka instance bnaya hai yaha"
	public By assignmentLink = By.cssSelector("a[href=\\\"/assignments\\\"]");
	
	//using Constructor
	public HomePage() {
		UIKeywords keyword = new UIKeywords();
		PageFactory.initElements(keyword.driver, this);
	}

	public void clickOnAssignment() {
		assignmentsLnk.click();
	}
	
	//for without pageFactory and @findBy
	public void clickOnAssignmentMenue() {
		keyword.driver.findElement(assignmentLink).click();
	}

	public String getTitle() {
		return keyword.driver.getTitle();
	
	}

}
