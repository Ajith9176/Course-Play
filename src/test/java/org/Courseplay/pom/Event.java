package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Event {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//li[@alt=\"modules\"]")
	private WebElement module;

	@FindBy(xpath = "//button[contains(text(),'Create Module')]")
	private WebElement createModule;

	@FindBy(xpath="//a[contains(text(),'Event')]")
	private WebElement Event;
	
	@FindBy(xpath="//input[@name='module_code']")
	private WebElement moduleCode;
	
	@FindBy(xpath="//input[@id='module_title']")
	private WebElement moduleTitle;
	
	@FindBy(id="thumbnail")
	private WebElement ModuleThumbnail;
	
	
	@FindBy(xpath="//a[@id='btnUploadThumb']")
	private WebElement ModuleThumbnailUpload;
	
	@FindBy(xpath="//input[@id='downloadable_media']")
	private WebElement DownloadableMedia;
	
	@FindBy(xpath="//a[@id='btnDownloadableMedia']")
	private WebElement DownloadableMediaUpload;
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement shortDescription;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/div[1]/div/div[2]")
	private WebElement longDescription;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
	private WebElement skillstab;
	
	@FindBy(xpath="(//input[@type=\"text\"])[4]")
	private WebElement skillSearch;
	
	@FindBy(xpath="//input[@name='max_user_enrollment']")
	private WebElement maximumUser;
	
	@FindBy(xpath="//input[@id='expiration_date']")
	private WebElement expirationDate;
	
	@FindBy(xpath="//span[contains(text(),'Non scorable module')]")
	private WebElement noScorablemodule;
	
	@FindBy(xpath="//input[@name='max_no_attempts']")
	private WebElement maxNoOfAttempts;
	
	@FindBy(xpath="//input[@id='submitbutton']")
	private WebElement save;
	
	@FindBy(xpath="//a[@id='sessionstab']")
	private WebElement sessionTab;
	
	@FindBy(xpath="//a[@class='dt-button btn btn-primary left']")
	private WebElement addEventSession;
	
	@FindBy(xpath="//input[@name='session_code']")
	private WebElement sessionCode;
	
	@FindBy(xpath="//input[@name='session_identifier']")
	private WebElement sessionTitle;

	
	@FindBy(xpath="//input[@id='session_start_date']")
	private WebElement startDate;
	
	@FindBy(xpath="//input[@id='session_end_date']")
	private WebElement EndDate;

	
	@FindBy(xpath="//input[@id='starttime']")
	private WebElement startTime;

	
	@FindBy(xpath="//input[@id='endtime']")
	private WebElement endTime;
	
	@FindBy(xpath="//input[@name='map_url']")
	private WebElement mapUrl;
	
	@FindBy(xpath="//input[@name='max_user_capacity']")
	private WebElement maxUserCapacity;
	
	@FindBy(id="upload_support_media")
	private WebElement Uploadsupport;
	
	@FindBy(id="btnUploadSupportMedia")
	private WebElement supportUpload;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
	private WebElement instructor;
	
	@FindBy(xpath="//div[@class='bs-searchbox']//input[@class='form-control']")
	private WebElement instructorSelect;
	
	@FindBy(xpath="//textarea[@id='location']")
	private WebElement eventLocation;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successSession;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement lockandload;

	
	@FindBy(xpath="//a[@class='clspublish btn btn-primary ml10']")
	private WebElement saveAndPublish;
	
	
	@FindBy(xpath="//a[@id='sessionstab']")
	private WebElement attendance;
	
	@FindBy(xpath="//a[@class='import btn btn-default ml10 upload_attend_btn']")
	private WebElement uploadAttendanceSheet;
	
	@FindBy(xpath="//a[@class='btn btn-primary ml15']")
	private WebElement downloadTemplate;
	
	
	@FindBy(id="import_csv")
	private WebElement uploadAttendnce;
	
	@FindBy(xpath="//button[@id='btnUpload']")
	private WebElement Submit;
	
	@FindBy(xpath="//a[@id='btn_finish']")
	private WebElement saveAttendance;
	
	@FindBy(xpath="//a[@name='save_and_lock']")
	private WebElement saveAndLock;
	

	
	@FindBy(xpath="//label[@id='module_code-error']")
	private WebElement Modulecodeerror;

	@FindBy(xpath="//label[@id='module_title-error']")
	private WebElement Moduletitleerror;

	@FindBy(xpath="//label[@id='short_description-error']")
	private WebElement ShortDescriptionError;

	@FindBy(xpath="//label[@id='long_description-error']")
	private WebElement LongDescriptionError;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")
	private WebElement ModuleSearch;

	@FindBy(id="searchBtn")
	private WebElement Search;
	

	@FindBy(xpath="//i[@class='far fa-eye fa-lg']")
	private WebElement preview;
	
	@FindBy(xpath="//div[@class='action-icon']//a[1]")
	private WebElement Edit;
	
	@FindBy(xpath="(//a[@class=\"edit\"])[1]")
	private WebElement Editsesearch;
	
	
	@FindBy(xpath="//tr[@class='odd']//i[@class='far fa-edit fa-lg']")
	private WebElement EditSession;

	@FindBy(xpath="//div[@class='action-icon']//a[3]")
	private WebElement Delete;
	
	@FindBy(xpath="//tr[@class='odd']//a[2]//i[1]")
	private WebElement Deletesession;
	
	@FindBy(xpath="//li[contains(text(),'Module Code cannot have symbols')]")
	private WebElement ModuleCodesymbol;

	@FindBy(xpath="//li[contains(text(),'Moule title cannot have symbols')]")
	private WebElement ModuleTitlesymbol;

	@FindBy(xpath="//li[contains(text(),'Max Enrollments should always be a numeric value')]")
	private WebElement Maximumusersymbol;

	@FindBy(xpath="//li[contains(text(),'Max number of Attempts should always be a numeric ')]")
	private WebElement MaxAttemptsymbol;
	
	
	@FindBy(xpath="//li[contains(text(),'Session Code can not be empty')]")
	private WebElement codeempty;
	
	@FindBy(xpath="//li[contains(text(),'Session Title can not be empty')]")
	private WebElement Titleempty;
	
	@FindBy(xpath="//li[contains(text(),'Google Map URL can not be empty')]")
	private WebElement UrlEmpty;
	
	@FindBy(xpath="//li[contains(text(),'Please select instructor')]")
	private WebElement InstructorEmpty;
	
	
	@FindBy(xpath="//li[contains(text(),'Module Code can only have alphabets numbers and hy')]")
	private WebElement codeSymbol;
	
	@FindBy(xpath="//li[contains(text(),'? ! characters')]")
	private WebElement TitleSymbol;
	
	@FindBy(xpath="//li[contains(text(),'Please enter a valid Google map URL')]")
	private WebElement UrlSymbol;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement AccessFailure;
	
	@FindBy(xpath="//a[@class='clspublish btn btn-primary ml10']")
	private WebElement unpublish;
	
	
	
	@FindBy(xpath="//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Unpublish')]")
	private WebElement UnpublishSession;
	
	
	@FindBy(xpath="//li[contains(text(),'Session Start date should be greater than or equal')]")
	private WebElement delaydate;
	
	@FindBy(xpath="//a[contains(text(),'Back')]")
	private WebElement back;
	
	@FindBy(xpath="//a[@id='ui-id-1']")
	private WebElement OverView;
	
	@FindBy(xpath="//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement SaveandPublish;

	public Event(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSaveandPublish() {
		return SaveandPublish;
	}
	
	public WebElement getOverView() {
		return OverView;
	}
	
	public WebElement getAccessFailure() {
		return AccessFailure;
	}
	
	public WebElement getback() {
		return back;
	}
	
	public WebElement getdelaydate() {
		return delaydate;
	}
	
	public WebElement getlockandload() {
		return lockandload;
	}
	
	public WebElement getunpublish() {
		return unpublish;
	}

	public WebElement getunpublishSession() {
		return UnpublishSession;
	}
	
	
	public WebElement getdownloadTemplate() {
		return downloadTemplate;
	}
	
	public WebElement getcodeSymbol() {
		return codeSymbol;
	}
	public WebElement getTitleSymbol() {
		return TitleSymbol;
	}
	public WebElement getUrlSymbol() {
		return UrlSymbol;
	}
	
	
	
	public WebElement getInstructorEmpty() {
		return InstructorEmpty;
	}
	
	public WebElement getUrlEmpty() {
		return UrlEmpty;
	}
	
	public WebElement getTitleempty() {
		return Titleempty;
	}
	
	public WebElement getcodeempty() {
		return codeempty;
	}
	

	public WebElement getModule() {
		return module;
	}

	public WebElement getCreateModule() {
		return createModule;
	}

	public WebElement getEvent() {
		return Event;
	}

	public WebElement getModuleCode() {
		return moduleCode;
	}

	public WebElement getModuleTitle() {
		return moduleTitle;
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

	public WebElement getShortDescription() {
		return shortDescription;
	}

	public WebElement getLongDescription() {
		return longDescription;
	}

	public WebElement getSkillstab() {
		return skillstab;
	}

	public WebElement getSkillSearch() {
		return skillSearch;
	}

	public WebElement getMaximumUser() {
		return maximumUser;
	}

	public WebElement getExpirationDate() {
		return expirationDate;
	}

	public WebElement getNoScorablemodule() {
		return noScorablemodule;
	}

	public WebElement getMaxNoOfAttempts() {
		return maxNoOfAttempts;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getSessionTab() {
		return sessionTab;
	}

	public WebElement getAddEventSession() {
		return addEventSession;
	}

	public WebElement getSessionCode() {
		return sessionCode;
	}

	public WebElement getSessionTitle() {
		return sessionTitle;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getStartTime() {
		return startTime;
	}

	public WebElement getEndTime() {
		return endTime;
	}
	
	
	
	public WebElement getEndDate() {
		return EndDate;
	}

	public WebElement getMapUrl() {
		return mapUrl;
	}

	public WebElement getMaxUserCapacity() {
		return maxUserCapacity;
	}

	public WebElement getUploadsupport() {
		return Uploadsupport;
	}

	public WebElement getSupportUpload() {
		return supportUpload;
	}

	public WebElement getInstructor() {
		return instructor;
	}

	public WebElement getInstructorSelect() {
		return instructorSelect;
	}

	public WebElement getEventLocation() {
		return eventLocation;
	}

	public WebElement getSuccessSession() {
		return successSession;
	}

	public WebElement getSaveAndPublish() {
		return saveAndPublish;
	}

	public WebElement getAttendance() {
		return attendance;
	}

	public WebElement getUploadAttendanceSheet() {
		return uploadAttendanceSheet;
	}

	public WebElement getUploadAttendnce() {
		return uploadAttendnce;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getSaveAttendance() {
		return saveAttendance;
	}

	public WebElement getSaveAndLock() {
		return saveAndLock;
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

	public WebElement getModuleSearch() {
		return ModuleSearch;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getPreview() {
		return preview;
	}

	public WebElement getEdit() {
		return Edit;
	}
	
	public WebElement getEditSession() {
		return EditSession;
	}

	public WebElement getEditsesearch() {
		return Editsesearch;
	}

	public WebElement getDelete() {
		return Delete;
	}
	
	public WebElement getDeleteSession() {
		return Deletesession;
	}
	
	public WebElement getMaxAttemptsymbol() {
		return MaxAttemptsymbol;
	}

	public WebElement getMaximumusersymbol() {
		return Maximumusersymbol;
	}

	public WebElement getModuleTitlesymbol() {
		return ModuleTitlesymbol;
	}

	public WebElement getModuleCodesymbol() {
		return ModuleCodesymbol;
	}

	
	
	
}
