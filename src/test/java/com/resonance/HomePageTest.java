package com.resonance;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.pages.HomePage;

public class HomePageTest {
	
	@Test
	public void verifyTitleHomePage() {
		HomePage home = new HomePage();
		String title = home.getTitle();
		Assert.assertEquals("Home page", title);
	}

}
