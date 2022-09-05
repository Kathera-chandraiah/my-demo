package com.spotify.page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
public WebDriver driver=null;
public BasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//public void mouseHoverActions(WebElement webElement) {
//
//
//	Actions action = new Actions(driver);
//	action.moveToElement(webElement).build().perform();
//
//	
//}

public void mouseHover(WebElement element) {
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();

}

public void clickOnWebElement(WebElement element) {
	WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(element));
	element.click();
}



}
