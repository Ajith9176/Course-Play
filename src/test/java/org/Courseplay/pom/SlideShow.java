package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlideShow {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
	private WebElement module;

	@FindBy(xpath = "//button[contains(text(),'Create Module')]")
	private WebElement createModule;
	
	@FindBy(xpath="//a[contains(text(),'Slideshow')]")
	private WebElement Slideshow;
	
	@FindBy(xpath="//input[@name='module_code']")
	private WebElement moduleCode;

	@FindBy(xpath="//input[@name='module_title']")
	private WebElement moduleName;
	
	@FindBy(id="thumbnail")
	private WebElement ModuleThumbnail;
	
	@FindBy(xpath="//a[@id='btnUploadThumb']")
	private WebElement ModuleThumbnailUpload;
	
	@FindBy(xpath="//input[@id='downloadable_media']")
	private WebElement DownloadableMedia;
	
	@FindBy(xpath="//a[@id='btnDownloadableMedia']")
	private WebElement DownloadableMediaUpload;
	
	@FindBy(xpath="//span[contains(text(),'Fade')]")
	private WebElement Fade;
	
	@FindBy(xpath="//span[contains(text(),'Slide')]")
	private WebElement Slide;
	
	@FindBy(xpath="//span[contains(text(),'Landscape')]")
	private WebElement Landscape;
	
	@FindBy(xpath="//span[contains(text(),'Portrait')]")
	private WebElement portrait;
	
	@FindBy(id="upload_media")
	private WebElement Upload;
	
	@FindBy(id="btnUploadSlideshow")
	private WebElement UploadSlideshow;
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement shortDescription;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[5]/div/div[2]/div[1]/div/div[2]")
	private WebElement LongDescription;

	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
	private WebElement Skills;
	
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement SearchSkills;
	
	@FindBy(xpath="//input[@name='max_user_enrollment']")
	private WebElement MaximumUser;
	
	@FindBy(id="expiration_date")
	private WebElement expdate;
	
	@FindBy(xpath="//input[@name='max_no_attempts']")
	private WebElement maximumAttempts;
	
	@FindBy(xpath="//span[contains(text(),'No Timer')]")
	private WebElement NoTimer;
	
	@FindBy(xpath = "//div[@class='col-md-12 mb10 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement savePublish;
	
	@FindBy(xpath="//span[contains(text(),'Timer throughout the module')]")
	private WebElement TimerModule;
	
	@FindBy(xpath="//span[contains(text(),'Timer per slide')]")
	private WebElement TimerPerSide;
	
	@FindBy(xpath="//input[@id='btnSubmitSlideshow']")
	private WebElement Save;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement saveSuccess;
	
	@FindBy(xpath="//label[@id='module_code-error']")
	private WebElement Modulecodeerror;

	@FindBy(xpath="//label[@id='module_title-error']")
	private WebElement Moduletitleerror;

	@FindBy(xpath="//label[@id='short_description-error']")
	private WebElement ShortDescriptionError;

	@FindBy(xpath="//label[@id='long_description-error']")
	private WebElement LongDescriptionError;
	
	@FindBy(xpath="//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement codeSymbols;
	
	@FindBy(xpath="//li[contains(text(),'Module title cannot have symbols')]")
	private WebElement titleSymbols;
	
	@FindBy(xpath="//li[contains(text(),'Max Enrollments should always be a numeric value')]")
	private WebElement enrollmentSymbols;
	
	@FindBy(xpath="//li[contains(text(),'Max number of Attempts should always be a numeric ')]")
	private WebElement attemptsSymbols;
	
	@FindBy(xpath="//div[@class='col-md-12 mb10 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement SaveandPublish; 
	
	@FindBy(xpath="//div[@class='col-md-12 mb10 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Unpublish')]")
	private WebElement UnPublish;
	
	public SlideShow(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getModule() {
		return module;
	}
	public WebElement getUnPublish() {
		return UnPublish;
	}
	
	public WebElement getSaveandPublish() {
		return SaveandPublish;
	}

	public WebElement getCreateModule() {
		return createModule;
	}
	
	public WebElement getSaveSuccess() {
		return saveSuccess;
	}
	
	public WebElement getSlideShow() {
		return Slideshow;
	}

	public WebElement getModuleCode() {
		return moduleCode;
	}

	public WebElement getModuleName() {
		return moduleName;
	}

	public WebElement getModuleThumbnail() {
		return ModuleThumbnail;
	}

	public WebElement getModuleThumbnailUpload() {
		return ModuleThumbnailUpload;
	}

	public WebElement getDownloadableMedia() {
		return DownloadableMedia;
	}

	public WebElement getDownloadableMediaUpload() {
		return DownloadableMediaUpload;
	}

	public WebElement getFade() {
		return Fade;
	}

	public WebElement getSlide() {
		return Slide;
	}

	public WebElement getLandscape() {
		return Landscape;
	}

	public WebElement getPortrait() {
		return portrait;
	}

	public WebElement getUpload() {
		return Upload;
	}

	public WebElement getUploadSlideshow() {
		return UploadSlideshow;
	}

	public WebElement getShortDescription() {
		return shortDescription;
	}

	public WebElement getLongDescription() {
		return LongDescription;
	}

	public WebElement getSkills() {
		return Skills;
	}

	public WebElement getSearchSkills() {
		return SearchSkills;
	}

	public WebElement getMaximumUser() {
		return MaximumUser;
	}

	public WebElement getExpdate() {
		return expdate;
	}

	public WebElement getMaximumAttempts() {
		return maximumAttempts;
	}

	public WebElement getNoTimer() {
		return NoTimer;
	}

	public WebElement getTimerModule() {
		return TimerModule;
	}

	public WebElement getTimerPerSide() {
		return TimerPerSide;
	}

	public WebElement getSave() {
		return Save;
	}
	
	public WebElement getsavePublish() {
		return savePublish;
	}
	
	public WebElement getModulecodeerror() {
		return Modulecodeerror;
	}

	public WebElement getModuletitleerror() {
		return Moduletitleerror;
	}

	public WebElement getShortDescriptionError() {
		return ShortDescriptionError;
	}

	public WebElement getLongDescriptionError() {
		return LongDescriptionError;
	}
	
	public WebElement getcodeSymbols() {
		return codeSymbols;
	}
	
	public WebElement gettitleSymbols() {
		return titleSymbols;
	}
	
	public WebElement getattemptssymbol() {
		return attemptsSymbols;
	}
	
	public WebElement getenrollmentSymbols() {
		return enrollmentSymbols;
	}
}
