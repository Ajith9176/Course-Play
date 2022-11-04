package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver driver;

@FindBy(id = "email")
private WebElement emailId;

@FindBy(xpath="//input[@id='password']")
private WebElement password;

@FindBy(xpath = "//input[@value='Sign In']")
private WebElement SignIn;


@FindBy(xpath="//h1[@class='mb15']")
private WebElement userHeader;


@FindBy(xpath="//button[contains(text(),'×')]")
private WebElement ClosePop;


public LoginPage(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
}

public WebElement getEmailId() {
	return emailId;
}

public WebElement getClosePop() {
	return ClosePop;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSignIn() {
	return SignIn;
}

public WebElement getUserHeader() {
	return userHeader;
}



}
