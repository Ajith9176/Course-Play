package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnerLogin {
	
	public static WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement emailId;

	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement SignIn;
	
	@FindBy(xpath="//div[@class='main-container clearfix nav-expand']//li[4]//a[1]")
	private WebElement Assessment;
	
	
	@FindBy(xpath="//h1[@class='mb15']")
	private WebElement userHeader;
	
	@FindBy(xpath="//a[contains(text(),'Courseplay06')]")
	private WebElement CourseAuthoring;
	
	@FindBy(xpath ="//span[@class='user']")
	private WebElement VerifyAuthor;
	
	@FindBy(xpath="//a[@id='ui-id-2']")
	private WebElement Announcement;
	
	@FindBy(xpath="//span[contains(text(),'modules')]")
	private WebElement Module;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement Scorm;
	
	@FindBy(xpath="//button[@class='btn-primary btn mt10 right module-go']")
	private WebElement Go;
	
	@FindBy(xpath="//input[@name='Enroll']")
	private WebElement AgreeAndStart;
	
	@FindBy(xpath="//i[@class='fas fa-play-circle']")
	private WebElement Start;
	
	@FindBy(xpath="//div[@class='play-and-pause']//img[1]")
	private WebElement Play;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[7]/div[1]/div[3]/div[1]/div[4]/img[1]")
	private WebElement Next;
	
	@FindBy(xpath="//div[@class='portlet-header incompleted-module panel-heading ui-sortable-handle ui-widget-header ui-corner-all']")
	private WebElement Scormtwo;
	
	@FindBy(xpath="//span[contains(text(),'discussions')]")
	private WebElement Discussions;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
	private WebElement AddDiscussion;
	
	@FindBy(xpath="//textarea[@id='commentPost']")
	private WebElement Questions;
	
	@FindBy(xpath="//button[@id='addComment']")
	private WebElement Answer;
	
	@FindBy(xpath="//a[@class='btn mb20 mt0 btn-primary']")
	private WebElement BackToDiscussion;
	
	@FindBy(xpath="//span[@class='mr10']")
	private WebElement Leadership;
	
	@FindBy(xpath="//li[@class='profile-drop dropdown']")
	private WebElement profile;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement logOut;
	
	@FindBy(xpath="(//a[@class='btn btn-primary perv-module mdbtn'][contains(text(),'Back to Modules')])[1]")
	private WebElement backtoModule;

	public LearnerLogin(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getbacktoModule() {
		return backtoModule;
	}
	
	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
	public WebElement getDiscussions() {
		return Discussions;
	}
	
	public WebElement getAddDiscussion() {
		return AddDiscussion;
	}
	
	public WebElement getQuestions() {
		return  Questions;
	}
	public WebElement getAnswer() {
		return Answer ;
	}
	public WebElement getBackToDiscussion() {
		return BackToDiscussion;
	}
	public WebElement getLeadership() {
		return Leadership;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailId() {
		return emailId;
	}
	
	public WebElement getNext() {
		return Next;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getAssessment() {
		return Assessment;
	}

	public WebElement getUserHeader() {
		return userHeader;
	}

	public WebElement getCourseAuthoring() {
		return CourseAuthoring;
	}

	public WebElement getVerifyAuthor() {
		return VerifyAuthor;
	}

	public WebElement getAnnouncement() {
		return Announcement;
	}

	public WebElement getModule() {
		return Module;
	}

	public WebElement getScorm() {
		return Scorm;
	}

	public WebElement getGo() {
		return Go;
	}

	public WebElement getAgreeAndStart() {
		return AgreeAndStart;
	}

	public WebElement getStart() {
		return Start;
	}

	public WebElement getPlay() {
		return Play;
	}
	public WebElement getScormtwo() {
		return Scormtwo;
	}
	
	
	
	
	
	

}
