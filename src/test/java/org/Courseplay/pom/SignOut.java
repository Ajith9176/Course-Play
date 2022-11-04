package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	
public static WebDriver driver;


	@FindBy(xpath="//li[@class='profile-drop dropdown']")
	private WebElement profile;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logOut;
	
	public SignOut(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

}
	


	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
	
	
}
