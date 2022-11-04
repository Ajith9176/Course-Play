package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.es.Y;

public class Text {
public static WebDriver driver;
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
	private WebElement Module;
	
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
	private WebElement Createmodule;
	
	@FindBy(xpath = "//a[contains(text(),'Text')]")
	private WebElement Text;
	
	@FindBy(xpath = "//input[@name='module_code']")
	private WebElement Modulecode;
	
	@FindBy(xpath = "//input[@id='module_title']")
	private WebElement Moduletitle ;
	
	@FindBy(id = "thumbnail")
	private WebElement ModuleThumbnail;
	
	@FindBy(xpath = "//a[@id='btnUploadThumb']")
	private WebElement ModuleUpload ;
	
	
	@FindBy(id = "downloadable_media")
	private WebElement downloadablemedia ;
	
	@FindBy(xpath = "//a[@id='btnDownloadableMedia']")
	private WebElement Downloadbutton ;
	
	@FindBy(xpath = "//textarea[@id='short_description']")
	private WebElement Shortdescription;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[2]")
	private WebElement Longdescription ;
	
	@FindBy(id = "audio_link")
	private WebElement Audiomedia;
	
	@FindBy(xpath = "//a[@id='btnAudioLink']")
	private WebElement UploadAudioMedia;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[3]")
	private WebElement ModuleContent;
	
	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-default']") 
	private WebElement skillstab;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement skillselect;
	
	
	@FindBy(xpath = "//input[@name='max_user_enrollment']")
	private WebElement MaximumUser ;
	
	
	@FindBy(xpath = "//input[@id='expiration_date']")
	private WebElement ExpirationDate ;
	
	@FindBy(xpath = "//input[@name='time_limit']")
	private WebElement Timelimit;
	
	@FindBy(xpath = "//input[@name='max_no_attempts']")
	private WebElement MaximumAttempts;
	
	@FindBy(xpath = "//input[@id='submitbutton']")
	private WebElement save ;
	
	@FindBy(xpath = "//input[@id='save']")
	private WebElement savesuccess ;
	


	@FindBy(tagName="html")
	private WebElement Scrolldown;
	
	@FindBy(tagName="html")
	private WebElement Scrollup;
	
	@FindBy(xpath = "//button[@id='save_close']")
	private WebElement popup1 ;
	
	@FindBy(xpath = "//a[@class='clspublish btn btn-primary ml10']")
	private WebElement publish ;
	
	@FindBy(xpath = "	//input[@class='form-control valid']")
	private WebElement skillsearch;

	@FindBy(xpath = "//a[@id='btnAudioLink']")
	private WebElement audioupload;
	
	
	@FindBy(xpath = "//label[@id='module_code-error']")
	private WebElement modulecodeerror;
	
	@FindBy(xpath = "//label[@id='module_title-error']")
	private WebElement moduletitleerror;
	
	@FindBy(xpath = "//label[@id='short_description-error']")
	private WebElement shortdescriptionerror;
	
	@FindBy(xpath = "//label[@id='long_description-error']")
	private WebElement longdescriptionerror;
	
	@FindBy(xpath = "//label[@id='content-error']")
	private WebElement contenterror;
	
	@FindBy(xpath = "//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement ModuleCodeSymbolError;
	
	@FindBy(xpath = "	//li[contains(text(),'Moule title cannot have symbols')]")
	private WebElement ModuleCodeTitleError;
	

	
	@FindBy(xpath = "//a[@class='clspublish btn btn-primary ml10']")
	private WebElement savepublish1 ;
	
	@FindBy(xpath = "//input[@id='save']")
	private WebElement save1 ;
	
	@FindBy(xpath="//a[@class='clspublish btn btn-primary ml10']")
	private WebElement Unpublish;
	
	
	
	public WebElement getSavepublish1() {
		return savepublish1;
	}
	
	public WebElement getUnpublish() {
		return Unpublish;
	}


	public WebElement getSave1() {
		return save1;
	}

	public WebElement getModuleCodeSymbolError() {
		return ModuleCodeSymbolError;
	}

	public WebElement getModuleCodeTitleError() {
		return ModuleCodeTitleError;
	}

	public WebElement getModulecodeerror() {
		return modulecodeerror;
	}

	public WebElement getModuletitleerror() {
		return moduletitleerror;
	}

	public WebElement getShortdescriptionerror() {
		return shortdescriptionerror;
	}

	public WebElement getLongdescriptionerror() {
		return longdescriptionerror;
	}

	public WebElement getContenterror() {
		return contenterror;
	}

	public WebElement getAudioupload() {
		return audioupload;
	}

	public WebElement getSavesuccess() {
		return savesuccess;
	}
	
	public WebElement getSkillsearch() {
		return skillsearch;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getPopup1() {
		return popup1;
	}

	public WebElement getScrolldown() {
		return Scrolldown;
	}

	public WebElement getScrollup() {
		return Scrollup;
	}

	public Text(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getModule() {
		return Module;
	}

	public WebElement getCreatemodule() {
		return Createmodule;
	}

	public WebElement getText() {
		return Text;
	}

	public WebElement getModulecode() {
		return Modulecode;
	}

	public WebElement getModuletitle() {
		return Moduletitle;
	}

	public WebElement getModuleThumbnail() {
		return ModuleThumbnail;
	}

	public WebElement getModuleUpload() {
		return ModuleUpload;
	}

	public WebElement getDownloadablemedia() {
		return downloadablemedia;
	}

	public WebElement getDownloadbutton() {
		return Downloadbutton;
	}

	public WebElement getShortdescription() {
		return Shortdescription;
	}

	public WebElement getLongdescription() {
		return Longdescription;
	}

	public WebElement getAudiomedia() {
		return Audiomedia;
	}

	public WebElement getUploadAudioMedia() {
		return UploadAudioMedia;
	}

	public WebElement getModuleContent() {
		return ModuleContent;
	}

	public WebElement getSkillstab() {
		return skillstab;
	}

	public WebElement getSkillselect() {
		return skillselect;
	}

	public WebElement getMaximumUser() {
		return MaximumUser;
	}

	public WebElement getExpirationDate() {
		return ExpirationDate;
	}

	public WebElement getTimelimit() {
		return Timelimit;
	}

	public WebElement getMaximumAttempts() {
		return MaximumAttempts;
	}

	public WebElement getSave() {
		return save;
	}
	

}
