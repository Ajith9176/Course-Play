package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webinar {
public static WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
	private WebElement Module;
	
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
	private WebElement Createmodule;
	
	@FindBy(tagName="html")
	private WebElement Scrolldown;
	
	@FindBy(tagName="html")
	private WebElement Scrollup;
	
	@FindBy(xpath = "//a[contains(text(),'Webinar')]")
	private WebElement Webinar;
	

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
	
	@FindBy(xpath="//a[contains(text(),'Back')]")
	private WebElement back;
	
	
	


	

	@FindBy(xpath = "//textarea[@id='short_description']")
	private WebElement shortdescription;
	

	@FindBy(xpath = "//iframe[@id='long_description_ifr']")
	private WebElement longdescription;
	

	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-default']")
	private WebElement skilltab;
	
	@FindBy(xpath = "//div[@class='bs-searchbox']//input[@class='form-control']")
	private WebElement skillsearch ;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement skillselect;
	
	@FindBy(xpath = "//input[@name='max_user_enrollment']")
	private WebElement maximumenroll;
	
	public WebElement getMaximumsessionuser() {
		return maximumsessionuser;
	}

	@FindBy(xpath = "//input[@name='max_user_capacity']")
	private WebElement maximumsessionuser;
	
	@FindBy(xpath = "//input[@id='expiration_date']")
	private WebElement expirationdate ;
	
	@FindBy(xpath = "//input[@name='max_no_attempts']")
	private WebElement maximumattempts ;
	
	@FindBy(xpath = "//span[contains(text(),'Non scorable module')]")
	private WebElement nonscorablemodule;
	
	@FindBy(xpath = "//input[@id='submitbutton']")//input[@id='submitbutton']
	private WebElement save;
	
	@FindBy(xpath = "//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement savepublish;
	
	//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]
	
	@FindBy(xpath = "//a[@class='clspublish btn btn-primary ml10']")
	private WebElement Sessionsavepublish ;
	
	public WebElement getSessionsavepublish() {
		return Sessionsavepublish;
	}

	@FindBy(xpath = "//label[@id='module_code-error']")
	private WebElement modulecodeerror ;
	
	@FindBy(xpath = "//label[@id='module_title-error']")
	private WebElement moduletitleerror ;
	
	
	@FindBy(xpath = "//label[@id='short_description-error']")
	private WebElement shortdescriptionerror;
	
	@FindBy(xpath = "//label[@id='long_description-error']")
	private WebElement longdescriptionerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Please select instructor')]")
	private WebElement instructorerror ;
	

	public WebElement getInstructorerror() {
		return instructorerror;
	}

	@FindBy(xpath = "//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement modulecodesymbolerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Moule title cannot have symbols')]")
	private WebElement modulecodetitlesymbolerror;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[10]/div[1]/input[2]")
	private WebElement savesuccess  ;
	
	@FindBy(xpath = "//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")//*[@id="submitbutton"]
	private WebElement savepublish1 ;
	
	@FindBy(xpath = "//input[@id='submitbutton']")
	private WebElement save1 ;
	
	@FindBy(xpath = "//a[@id='sessionstab']")//a[@id='sessionstab']
	private WebElement sessiontab;
	
	@FindBy(xpath = "//span[contains(text(),'Add Webinar Session')]")
	private WebElement addwebinar ;
	
	
	@FindBy(xpath="//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement saveandpublish;
	
	//@FindBy(xpath ="//a[@class='dt-button btn btn-primary left']")
	//private WebElement sessi;
	
	@FindBy(xpath = "//input[@name='session_code']")
	private WebElement sessioncode ;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getModule() {
		return Module;
	}
	
	public WebElement getback() {
		return back;
	}

	public WebElement getsaveandpublish() {
		return saveandpublish;
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

	public WebElement getWebinar() {
		return Webinar;
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

	public WebElement getNonscorablemodule() {
		return nonscorablemodule;
	}

	public WebElement getSave() {
		return save;
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

	public WebElement getModulecodesymbolerror() {
		return modulecodesymbolerror;
	}

	public WebElement getModulecodetitlesymbolerror() {
		return modulecodetitlesymbolerror;
	}

	public WebElement getSavesuccess() {
		return savesuccess;
	}

	public WebElement getSavepublish1() {
		return savepublish1;
	}

	public WebElement getSave1() {
		return save1;
	}

	public WebElement getSessiontab() {
		return sessiontab;
	}

	public WebElement getAddwebinar() {
		return addwebinar;
	}

	public WebElement getSessioncode() {
		return sessioncode;
	}

	public WebElement getSessiontitle() {
		return sessiontitle;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getStarttime() {
		return starttime;
	}

	public WebElement getEndtime() {
		return endtime;
	}

	public WebElement getWebinarurl() {
		return webinarurl;
	}

	public WebElement getSessionmaximumuser() {
		return sessionmaximumuser;
	}

	public WebElement getGuidelines() {
		return guidelines;
	}

	public WebElement getInstructortab() {
		return instructortab;
	}

	public WebElement getInstructorselect() {
		return instructorselect;
	}

	public WebElement getSessioncodeerror() {
		return sessioncodeerror;
	}

	public WebElement getSessiontitleerror() {
		return sessiontitleerror;
	}

	public WebElement getSessioninstructerror() {
		return sessioninstructerror;
	}

	public WebElement getWebinarurlerror() {
		return webinarurlerror;
	}

	public WebElement getSessioncodesymbolerror() {
		return sessioncodesymbolerror;
	}

	public WebElement getSessiontitlesymbolerror() {
		return sessiontitlesymbolerror;
	}

	public WebElement getWebinarsymbolerror() {
		return webinarsymbolerror;
	}

	@FindBy(xpath = "//input[@name='session_identifier']")
	private WebElement sessiontitle ;
	
	@FindBy(xpath = "//input[@id='session_start_date']")
	private WebElement startdate ;
	
	@FindBy(xpath = "//input[@id='session_end_date']")
	private WebElement enddate ;
	
	@FindBy(xpath = "//input[@id='starttime']")
	private WebElement starttime ;
	
	@FindBy(xpath = "//input[@id='endtime']")
	private WebElement endtime ;
	
	@FindBy(xpath = "//input[@name='webinar_url']")
	private WebElement webinarurl ;
	
	
	@FindBy(xpath = "//input[@name='max_user_capacity']")
	private WebElement sessionmaximumuser ;
	
	@FindBy(xpath = "//textarea[@id='session_guidelines']")
	private WebElement guidelines ;
	
	@FindBy(xpath = "//div[@class='btn-group bootstrap-select show-tick']")
	private WebElement instructortab ;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement instructorselect ;
	
	@FindBy(xpath = "//li[contains(text(),'Session Code can not be empty')]")
	private WebElement sessioncodeerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Session Title can not be empty')]")
	private WebElement sessiontitleerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Please select instructor')]")
	private WebElement sessioninstructerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Webinar URL can not be empty')]")
	private WebElement webinarurlerror ;
	
	@FindBy(xpath = "//li[contains(text(),'Module Code can only have alphabets numbers and hy')]")
	private WebElement sessioncodesymbolerror ;
	
	@FindBy(xpath = "//li[contains(text(),'? ! characters')]")
	private WebElement sessiontitlesymbolerror ;
	
	@FindBy(xpath = "//li[contains(text(),'The input does not appear to be a valid Uri')]")
	private WebElement webinarsymbolerror ;
	
	public Webinar(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	

}
