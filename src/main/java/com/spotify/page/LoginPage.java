package com.spotify.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



 


public class LoginPage extends BasePage {
	@FindBy(xpath="/span[text()='Sign In']")
	private WebElement btnSignin;
	 

	public LoginPage(WebDriver driver) {
		super(driver);
		
	
	}
	public void mouseOverOnSign() {

this.mouseHover(btnSignin);
	}
	


}
