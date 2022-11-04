package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webcontent {
public static WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
	private WebElement Module;
	
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
	private WebElement Createmodule;
	
	@FindBy(tagName="html")
	private WebElement Scrolldown;
	
	@FindBy(tagName="html")
	private WebElement Scrollup;
	
	
	@FindBy(xpath = "//a[contains(text(),'Web Content')]")
	private WebElement Webcontent;
	

	@FindBy(xpath = "//input[@name='module_code']")
	private WebElement modulecode;

	@FindBy(xpath = "//input[@id='module_title']")
	private WebElement moduletitle;
	

	@FindBy(id = "thumbnail")
	private WebElement imagethumnail;
	
    @FindBy(xpath = "//a[@id='btnUploadThumb']")
	private WebElement imagethumbnailbutton;

	@FindBy(xpath = "//button[@id='save_close']")
	private WebElement popup1;
	
	@FindBy(id = "downloadable_media")
	private WebElement downloadablemedia;
	
	@FindBy(xpath = "//a[@id='btnDownloadableMedia']")
	private WebElement downloadablemediabutton;
	
	@FindBy(xpath= "//input[@id='content_url']")
	private WebElement contentupload;
	
	@FindBy(xpath="//iframe[@id='embed_content_ifr']")
	private WebElement embedcontent;
	

	//@FindBy(xpath = "//a[@id='btnUploadVideo']")
	//private WebElement videouploadbutton;
	

	@FindBy(xpath = "//textarea[@id='short_description']")
	private WebElement shortdescription;
	

	@FindBy(xpath = "//iframe[@id='long_description_ifr']")
	private WebElement longdescription;
	

	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-default']")
	private WebElement skilltab;
	
	@FindBy(xpath = "//div[@class='bs-searchbox']//input[@class='form-control']")
	private WebElement skillsearch ;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[5]")
	private WebElement skillselect;
	
	@FindBy(xpath = "//input[@name='max_user_enrollment']")
	private WebElement maximumenroll;
	
	@FindBy(xpath = "//input[@id='expiration_date']")
	private WebElement expirationdate ;
	
	@FindBy(xpath = "//input[@name='max_no_attempts']")
	private WebElement maximumattempts ;
	
	@FindBy(xpath = "//input[@name='time_limit']")
	private WebElement timer;
	
	@FindBy(xpath = "//input[@id='submitbutton']")
	private WebElement  save;
	
	@FindBy(xpath = "//a[@class='clspublish btn btn-primary ml10']")
	private WebElement savepublish ;
	
	 
	
	

	@FindBy(xpath = "//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement modulecodesymbolerror ;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/span[1]/ul[1]")
	private WebElement modulecodetitlesymbolerror;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[10]/div[1]/input[2]")
	private WebElement savesuccess  ;
	
	@FindBy(xpath = "//input[@id='save']")
	private WebElement save1 ;
	
	@FindBy(xpath = "//label[@id='module_code-error']")
	private WebElement modulecodeerror ;
	
	@FindBy(xpath = "//label[@id='module_title-error']")
	private WebElement moduletitleerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Please enter a valid url')]")
	private WebElement webcontenterror ;
	
	@FindBy(xpath = "//label[@id='short_description-error']")
	private WebElement shortdescriptionerror;
	
	@FindBy(xpath = "//label[@id='long_description-error']")
	private WebElement longdescriptionerror ;
	
	


	
	public static WebDriver getDriver() {
		return driver;
	}





	public WebElement getModule() {
		return Module;
	}

	public WebElement getembedcontent() {
		return embedcontent;
	}



	public WebElement getCreatemodule() {
		return Createmodule;
	}





	public WebElement getScrolldown() {
		return Scrolldown;
	}





	public WebElement getScrollup() {
		return Scrollup;
	}





	public WebElement getWebcontent() {
		return Webcontent;
	}





	public WebElement getModulecode() {
		return modulecode;
	}





	public WebElement getModuletitle() {
		return moduletitle;
	}





	public WebElement getImagethumnail() {
		return imagethumnail;
	}





	public WebElement getImagethumbnailbutton() {
		return imagethumbnailbutton;
	}





	public WebElement getPopup1() {
		return popup1;
	}





	public WebElement getDownloadablemedia() {
		return downloadablemedia;
	}





	public WebElement getDownloadablemediabutton() {
		return downloadablemediabutton;
	}





	public WebElement getContentupload() {
		return contentupload;
	}





	public WebElement getShortdescription() {
		return shortdescription;
	}





	public WebElement getLongdescription() {
		return longdescription;
	}





	public WebElement getSkilltab() {
		return skilltab;
	}





	public WebElement getSkillsearch() {
		return skillsearch;
	}





	public WebElement getSkillselect() {
		return skillselect;
	}





	public WebElement getMaximumenroll() {
		return maximumenroll;
	}





	public WebElement getExpirationdate() {
		return expirationdate;
	}





	public WebElement getMaximumattempts() {
		return maximumattempts;
	}





	public WebElement getTimer() {
		return timer;
	}





	public WebElement getSave() {
		return save;
	}





	public WebElement getSavepublish() {
		return savepublish;
	}





	public WebElement getModulecodesymbolerror() {
		return modulecodesymbolerror;
	}





	public WebElement getModulecodetitlesymbolerror() {
		return modulecodetitlesymbolerror;
	}





	public WebElement getSavesuccess() {
		return savesuccess;
	}





	public WebElement getSave1() {
		return save1;
	}





	public WebElement getModulecodeerror() {
		return modulecodeerror;
	}





	public WebElement getModuletitleerror() {
		return moduletitleerror;
	}





	public WebElement getWebcontenterror() {
		return webcontenterror;
	}





	public WebElement getShortdescriptionerror() {
		return shortdescriptionerror;
	}





	public WebElement getLongdescriptionerror() {
		return longdescriptionerror;
	}





	public Webcontent(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
}
