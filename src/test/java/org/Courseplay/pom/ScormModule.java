package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScormModule {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Module Authoring')]")
	private WebElement ModuleAuthoring;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	private WebElement CreateModule;

	@FindBy(xpath="//a[contains(text(),'SCORM')]")
	private WebElement Scrom;
	
	@FindBy(xpath="//input[@name='module_code']")
	private WebElement ModuleCode;
	
	@FindBy(xpath ="//input[@id='module_title']")
	private WebElement ModuleTitle;
	
	@FindBy(id="thumbnail")
	private WebElement ModuleThumbnail;
	
	@FindBy(xpath="//a[@id='btnUploadThumb']")
	private WebElement ModuleThumbnailUpload;
	
	@FindBy(id="upload_media")
	private WebElement UploadScrom;
	
	@FindBy(xpath="//a[@id='btnUploadScorm']")
	private WebElement UploadScromUp;
	
	@FindBy(xpath="//input[@id='downloadable_media']")
	private WebElement DownloadableMedia;
	
	@FindBy(xpath="//a[@id='btnDownloadableMedia']")
	private WebElement DownloadableMediaUpload;
	
	@FindBy(xpath="//button[@id='skip_close']")
	private WebElement Original;
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement ShortDescription;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[4]/div[1]/div[2]/div[1]/div[1]/div[2]")
	private WebElement LongDescription;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
	private WebElement SkillDrop ;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement SearchSkill;
	
	@FindBy(xpath="//a[contains(text(),'Automation01')]")
	private WebElement SkillsSelect;
	
	@FindBy(xpath="//input[@name='max_user_enrollment']")
	private WebElement MaximumUserEnrollment;
	
	@FindBy(xpath="//input[@id='expiration_date']")
	private WebElement ExpirationDate;
	
	@FindBy(xpath="//input[@name='max_no_attempts']")
	private WebElement MaxNoOfAttempts;
	
	@FindBy(xpath="//input[@id='btnSubmitLms']")
	private WebElement Save;
	
	@FindBy(xpath="//div[@class='alert alert-success']")  
	private WebElement ScromAddedSuccessfully;
	
	@FindBy(xpath="(//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')])[1]")
	private WebElement SaveAndPublish;
	
	@FindBy(xpath="//label[@id='module_code-error']")
	private WebElement ModuleCodeError;
	
	@FindBy(xpath="//label[@id='module_title-error']")
	private WebElement ModuleTitleError;
	
	@FindBy(xpath="//li[contains(text(),'SCORM file cannot be empty')]")
	private WebElement ScormError;
	
	@FindBy(xpath ="//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement ModuleCodeSymbol;
	
	@FindBy(xpath="//li[contains(text(),'Module title cannot have symbols')]")
	private WebElement ModuleTitleSymbol;
	
	
	public ScormModule(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getModuleTitleSymbol() {
		return ModuleTitleSymbol;
	}
	
	public WebElement getModuleCodeSymbol() {
		return ModuleCodeSymbol;
	}
	
	public WebElement getSearchSkill() {
		return SearchSkill;
	}
	
	

	public WebElement getScormError() {
		return ScormError;
	}
	
	public WebElement getModuleTitleError() {
		return ModuleTitleError;
	}
	
	public WebElement getModuleCodeError() {
		return ModuleCodeError;
	}
	public WebElement getOriginal() {
		return Original;
	}
	
	public WebElement getSaveAndPublish() {
		return SaveAndPublish;
	}
	
	
	
	public WebElement getModuleAuthoring() {
		return ModuleAuthoring;
	}
	
	public WebElement getScromAddedSuccessfully() {
		return ScromAddedSuccessfully;
	}


	public WebElement getCreateModule() {
		return CreateModule;
	}

	public WebElement getScrom() {
		return Scrom;
	}

	public WebElement getModuleCode() {
		return ModuleCode;
	}

	public WebElement getModuleTitle() {
		return ModuleTitle;
	}

	public WebElement getModuleThumbnail() {
		return ModuleThumbnail;
	}

	public WebElement getModuleThumbnailUpload() {
		return ModuleThumbnailUpload;
	}

	public WebElement getUploadScrom() {
		return UploadScrom;
	}

	public WebElement getUploadScromUp() {
		return UploadScromUp;
	}

	public WebElement getDownloadableMedia() {
		return DownloadableMedia;
	}

	public WebElement getDownloadableMediaUpload() {
		return DownloadableMediaUpload;
	}

	public WebElement getShortDescription() {
		return ShortDescription;
	}

	public WebElement getLongDescription() {
		return LongDescription;
	}

	public WebElement getSkillDrop() {
		return SkillDrop;
	}

	public WebElement getSkillsSelect() {
		return SkillsSelect;
	}

	public WebElement getMaximumUserEnrollment() {
		return MaximumUserEnrollment;
	}

	public WebElement getExpirationDate() {
		return ExpirationDate;
	}

	public WebElement getMaxNoOfAttempts() {
		return MaxNoOfAttempts;
	}

	public WebElement getSave() {
		return Save;
	}
	
}
