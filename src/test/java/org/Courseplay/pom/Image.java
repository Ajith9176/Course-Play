package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Image {
public static WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
	private WebElement Module;
	
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
	private WebElement Createmodule;
	
	@FindBy(tagName="html")
	private WebElement Scrolldown;
	
	@FindBy(tagName="html")
	private WebElement Scrollup;
	
	
	@FindBy(xpath = "//a[contains(text(),'Image')]")
	private WebElement image;
	
	@FindBy(xpath = "//input[@name='module_code']")
	private WebElement modulecode;
	
	@FindBy(xpath = "//input[@id='module_title']")
	private WebElement moduletitle;
	
	@FindBy(id = "thumbnail")
	private WebElement thumbnail;
	
	@FindBy(xpath = "//a[@id='btnUploadThumb']")
	private WebElement thumbnailuploadbutton;
	
	@FindBy(xpath = "//button[@id='save_close']")
	private WebElement popup1;
	
	@FindBy(id = "downloadable_media")
	private WebElement downloadablemedia;
	
	@FindBy(xpath = "//a[@id='btnDownloadableMedia']")
	private WebElement downloadablemediabutton;
	
	@FindBy(xpath = "//textarea[@id='short_description']")
	private WebElement shortdescription;
	
	@FindBy(xpath = "//div[@id='mceu_12']")
	private WebElement longdescription;
	
	
	@FindBy(id = "web_image")
	private WebElement webimageupload;
	
	@FindBy(xpath = "//a[@id='btnUploadImage']")
	private WebElement webimageuploadbutton;
	
	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-default']")
	private WebElement skilltab;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[4]")
	private WebElement skillselect ;
	
	@FindBy(xpath = "//div[@class='bs-searchbox']//input[@class='form-control']")
	private WebElement skillsearch;
	
	@FindBy(xpath = "//input[@name='max_user_enrollment']")
	private WebElement maximumenroll;
	
	@FindBy(xpath = "//input[@id='expiration_date']")
	private WebElement expirationdate ;
	
	@FindBy(xpath = "//input[@name='min_time_limit']")
	private WebElement minimumtime;
	
	@FindBy(xpath = "//input[@name='max_no_attempts']")
	private WebElement maximumattempt;
	
	@FindBy(xpath = "//input[@id='submitbutton']")
	private WebElement save;
	
	@FindBy(xpath = "//input[@id='save']")
	private WebElement savesuccess;
	
	@FindBy(xpath = "//div[@class='clearfix']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement savepublish;
	
	@FindBy(xpath = "//label[@id='module_code-error']")
	private WebElement modulecodeerror;
	
	@FindBy(xpath = "//label[@id='module_title-error']")
	private WebElement  moduletitleerror ;
	
	@FindBy(xpath = "//label[@id='short_description-error']")
	private WebElement shortdescriptionerror ;
	
	@FindBy(xpath = "//label[@id='long_description-error']")
	private WebElement longdescriptionerror ;
	
	@FindBy(xpath = "//label[@id='web_image-error']")
	private WebElement webpageerror;
	
	@FindBy(xpath = "//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement modulecodesymbolerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Moule title cannot have symbols')]")
	private WebElement moduletitlesymbolerror;
	
	@FindBy(xpath = "//a[@class='clspublish btn btn-primary ml10']")
	private WebElement savepublish1 ;
	
	@FindBy(xpath = "//input[@id='save']")
	private WebElement save1 ;
	
	public WebElement getSavepublish1() {
		return savepublish1;
	}


	public WebElement getSave1() {
		return save1;
	}


	public Image(WebDriver ldriver) {
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


	public WebElement getScrolldown() {
		return Scrolldown;
	}


	public WebElement getScrollup() {
		return Scrollup;
	}


	public WebElement getImage() {
		return image;
	}


	public WebElement getModulecode() {
		return modulecode;
	}


	public WebElement getModuletitle() {
		return moduletitle;
	}


	public WebElement getThumbnail() {
		return thumbnail;
	}


	public WebElement getThumbnailuploadbutton() {
		return thumbnailuploadbutton;
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


	public WebElement getShortdescription() {
		return shortdescription;
	}


	public WebElement getLongdescription() {
		return longdescription;
	}


	public WebElement getWebimageupload() {
		return webimageupload;
	}


	public WebElement getWebimageuploadbutton() {
		return webimageuploadbutton;
	}


	public WebElement getSkilltab() {
		return skilltab;
	}


	public WebElement getSkillselect() {
		return skillselect;
	}


	public WebElement getSkillsearch() {
		return skillsearch;
	}


	public WebElement getMaximumenroll() {
		return maximumenroll;
	}


	public WebElement getExpirationdate() {
		return expirationdate;
	}


	public WebElement getMinimumtime() {
		return minimumtime;
	}


	public WebElement getMaximumattempt() {
		return maximumattempt;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getSavesuccess() {
		return savesuccess;
	}


	public WebElement getSavepublish() {
		return savepublish;
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


	public WebElement getWebpageerror() {
		return webpageerror;
	}


	public WebElement getModulecodesymbolerror() {
		return modulecodesymbolerror;
	}


	public WebElement getModuletitlesymbolerror() {
		return moduletitlesymbolerror;
	}
	
	
	//@FindBy(xpath = "")
	//private WebElement ;
	
	//@FindBy(xpath = "")
	//private WebElement ;
	
	//@FindBy(xpath = "")
	//private WebElement ;
	
}


