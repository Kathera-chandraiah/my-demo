package com.spotify.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.spotify.page.LoginPage;

public class LoginTest extends BaseTest {
	private WebDriver driver = null;
	LoginPage loginpage = null;

	@BeforeClass
	@Parameters({ "URL","browser"})
	public void initmethod(String URL, String browser) {
		driver = getWebDriver(browser);
		loginpage = new LoginPage(driver);
		driver.get(URL);
	}

	@Test(priority = 1, description = "login to spotify")
	public void loginToSpotify() {
		
loginpage.mouseOverOnSign();
	}

}
