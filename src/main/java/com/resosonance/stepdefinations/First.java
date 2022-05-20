package com.resosonance.stepdefinations;

import org.testng.Assert;
import com.resonance.keywords.UIKeywords;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	UIKeywords keyword = new UIKeywords();
	String title = "";

	@Given("Chrome browser is opened and url is launched")
	public void m1() {
		keyword.openBrowser("chrome");
		keyword.launchUrl("https://testingshastra.com/");
	}

	@When("We get the title of homepage")
	public void m2() {
		String title = keyword.getTitle();
	}
	
	@Then("it must be equal to expected")
	public void m3() {
		Assert.assertEquals("Testing Shastra | Training | Placement", title);
	}

}
