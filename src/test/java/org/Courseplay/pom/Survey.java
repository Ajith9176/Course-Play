package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Survey {

	public static WebDriver driver;
	
	
	
	@FindBy(xpath = "//li[@alt=\"modules\"]")
	private WebElement module;

	@FindBy(xpath = "//button[contains(text(),'Create Module')]")
	private WebElement createModule;

	@FindBy(xpath="//a[contains(text(),'Survey')]")
	private WebElement Survey;
	
	@FindBy(xpath="//input[@name='module_code']")
	private WebElement moduleCode;
	
	@FindBy(xpath="//input[@id='module_title']")
	private WebElement moduleTitle;
	
	@FindBy(xpath="//input[@name='friendly_name']")
	private WebElement FriendlyName;
	
	
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
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/form/div/ul/li[4]/div/div[2]/div[1]/div/div[2]")
	private WebElement longDescription;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
	private WebElement skillstab;
	
	@FindBy(xpath="(//input[@type=\"text\"])[5]")
	private WebElement skillSearch;
	
	@FindBy(xpath="//input[@name='max_user_enrollment']")
	private WebElement maximumUser;
	
	@FindBy(xpath="//input[@id='expiration_date']")
	private WebElement expirationDate;
	
	@FindBy(xpath="//span[contains(text(),'Review Questions Before Submitting')]")
	private WebElement ReviewQuestions;
	
	@FindBy(xpath="//input[@name='max_no_attempts']")
	private WebElement maxNoOfAttempts;
	
	@FindBy(xpath="//span[contains(text(),'None')]")
	private WebElement None;
	
	@FindBy(xpath="//span[contains(text(),'Previous Question')]")
	private WebElement previouquestion;
	
	@FindBy(xpath="//input[@id='submitbutton']")
	private WebElement save;
	
	@FindBy(xpath="//a[@class='btn btn-primary ml10']")
	private WebElement back;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement success;
	
	@FindBy(xpath="//a[@id='questionstab']")
	private WebElement questionTab;
	
	@FindBy(xpath="//div[@id=\"tabs-2\"]/div[1]/div/div/form/div[1]/div")
	private WebElement selectQuestions;
	
	@FindBy(xpath="//span[contains(text(),'Numeric')]")
	private WebElement Numeric;
	
	@FindBy(xpath="//input[@id='question_title']")
	private WebElement questiontitle;
	
	@FindBy(xpath="//textarea[@name='question_description']")
	private WebElement questiondescription;
	
	@FindBy(xpath="//input[@id='min_value']")
	private WebElement minacceptable;
	
	@FindBy(xpath="//input[@id='max_value']")
	private WebElement maxacceptable;
	
	@FindBy(id="downloadable_media_ques")
	private WebElement downloadablemediaques;
	
	@FindBy(xpath="//form[@id='frmquestion']//a[@id='btnDownloadableMedia']")
	private WebElement questionupload;
	
	@FindBy(xpath="(//label[@class='ui-checkbox-inline'])[2]")
	private WebElement mandatory;
	
	
	@FindBy(xpath="(//label[@class='ui-checkbox-inline'])[3]")
	private WebElement enablecomment;
	
	@FindBy(xpath ="//a[@id='submitbutton']")
	private WebElement saveModule;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Short Answer')]")
	private WebElement ShortAnswer;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement anscontains;
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement ansnotcontains;
	
	
	@FindBy(xpath="//span[contains(text(),'Phone Number')]")
	private WebElement PhoneNumber;
	
	

	@FindBy(xpath="//span[contains(text(),'Email')]")
	private WebElement Email;
	
	@FindBy(xpath="//span[contains(text(),'URL')]")
	private WebElement URL;
	
	@FindBy(xpath="//span[contains(text(),'Date')]")
	private WebElement Date;
	
	@FindBy(xpath="//span[contains(text(),'Pick One')]")
	private WebElement pickone;
	
	@FindBy(xpath="//span[contains(text(),'Pick Many')]")
	private WebElement pickmany;
	
	@FindBy(xpath="//span[contains(text(),'Long Answer')]")
	private WebElement LongAns;
	
	
	@FindBy(xpath="//span[contains(text(),'Dropdown')]")
	private WebElement dropdown;
	
	
	@FindBy(xpath="//a[@id='section']")
	private WebElement Section;
	
	@FindBy(xpath="//i[@class='far fa-edit mr5']")
	private WebElement sectionedit;
	
	@FindBy(xpath="//input[@id='section_title']")
	private WebElement SectionTitle;
	
	@FindBy(xpath="//div[@class='clearfix mt10']//input[@name='submit']")
	private WebElement sectionsave;
	
	
	@FindBy(xpath="//button[@id='btnImport']")
	private WebElement Importoption;
	
	@FindBy(xpath="//a[@class='btn btn-primary ml15']")
	private WebElement downloadTemplate;
	
	@FindBy(id="import_csv")
	private WebElement Import;
	
	@FindBy(xpath="//button[@id='btnUpload']")
	private WebElement Sumbit;
	
	
	public Survey(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getModule() {
		return module;
	}


	public WebElement getCreateModule() {
		return createModule;
	}


	public WebElement getSurvey() {
		return Survey;
	}


	public WebElement getModuleCode() {
		return moduleCode;
	}


	public WebElement getModuleTitle() {
		return moduleTitle;
	}


	public WebElement getFriendlyName() {
		return FriendlyName;
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


	public WebElement getReviewQuestions() {
		return ReviewQuestions;
	}


	public WebElement getMaxNoOfAttempts() {
		return maxNoOfAttempts;
	}


	public WebElement getNone() {
		return None;
	}


	public WebElement getPreviouquestion() {
		return previouquestion;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getBack() {
		return back;
	}


	public WebElement getSuccess() {
		return success;
	}


	public WebElement getQuestionTab() {
		return questionTab;
	}


	public WebElement getSelectQuestions() {
		return selectQuestions;
	}


	public WebElement getNumeric() {
		return Numeric;
	}


	public WebElement getQuestiontitle() {
		return questiontitle;
	}


	public WebElement getQuestiondescription() {
		return questiondescription;
	}


	public WebElement getMinacceptable() {
		return minacceptable;
	}


	public WebElement getMaxacceptable() {
		return maxacceptable;
	}


	public WebElement getDownloadablemediaques() {
		return downloadablemediaques;
	}


	public WebElement getQuestionupload() {
		return questionupload;
	}


	public WebElement getMandatory() {
		return mandatory;
	}


	public WebElement getEnablecomment() {
		return enablecomment;
	}


	public WebElement getSaveModule() {
		return saveModule;
	}


	public WebElement getShortAnswer() {
		return ShortAnswer;
	}


	public WebElement getAnscontains() {
		return anscontains;
	}


	public WebElement getAnsnotcontains() {
		return ansnotcontains;
	}


	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getURL() {
		return URL;
	}


	public WebElement getDate() {
		return Date;
	}


	public WebElement getPickone() {
		return pickone;
	}


	public WebElement getPickmany() {
		return pickmany;
	}


	public WebElement getLongAns() {
		return LongAns;
	}


	public WebElement getDropdown() {
		return dropdown;
	}


	public WebElement getSection() {
		return Section;
	}


	public WebElement getSectionedit() {
		return sectionedit;
	}


	public WebElement getSectionTitle() {
		return SectionTitle;
	}


	public WebElement getSectionsave() {
		return sectionsave;
	}


	public WebElement getImportoption() {
		return Importoption;
	}


	public WebElement getDownloadTemplate() {
		return downloadTemplate;
	}


	public WebElement getImport() {
		return Import;
	}


	public WebElement getSumbit() {
		return Sumbit;
	}

	

	
}
