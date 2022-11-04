package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment {
	
public static WebDriver driver;

@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
private WebElement module;

@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
private WebElement createModule;

@FindBy(xpath = "//a[contains(text(),'Assignment')]")
private WebElement assignment;

@FindBy(xpath="//input[@name='module_code']")
private WebElement moduleCode;

@FindBy(xpath="//input[@name='module_title']")
private WebElement moduleName;

@FindBy(xpath="//div[@class='form-group bottom-space']//span[contains(text(),'None')]")
private WebElement questions;

@FindBy(xpath="//li[@class='quiz-navigation-section']//div[@class='form-group']//span[contains(text(),'None')]")
private WebElement answers;


@FindBy(xpath="//input[@name='max_user_enrollment']")
private WebElement maximumUser;

@FindBy(id="expiration_date")
private WebElement expdate;
	
@FindBy(xpath="//input[@id='submitbutton']")
private WebElement save;	

@FindBy(xpath="//div[@class='alert alert-success']")
private WebElement saveSuccess;	

@FindBy(xpath = "//div[@class=\"col-md-12 mb15 searchbtn-group\"]/div/a")
private WebElement savePublish;

@FindBy(id="thumbnail")
private WebElement ModuleThumbnail;

@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
private WebElement Skills;

@FindBy(xpath="(//input[@type='text'])[4]")
private WebElement SearchSkills;

@FindBy(xpath="//a[@id='btnUploadThumb']")
private WebElement ModuleThumbnailUpload;

@FindBy(xpath="//textarea[@id='short_description']")
private WebElement shortDescription;

@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[3]/div/div[2]/div/div/div[2]")
private WebElement LongDescription;

@FindBy(xpath="//span[contains(text(),'Downloadable Media')]")
private WebElement DownloadableMedia;

@FindBy(xpath="//span[contains(text(),'Playable Audio')]")
private WebElement PlayableAudio;

@FindBy(xpath="(//span[contains(text(),'None')])[1]")
private WebElement None;

@FindBy(id="downloadable_media")
private WebElement contentUpload;

@FindBy(xpath="//a[@id='btnDownloadableMedia']")
private WebElement Upload;

@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[6]/div/div/div/div/div[3]")
private WebElement instructions;

@FindBy(xpath="//span[contains(text(),'Upload Media')]")
private WebElement UploadMedia;

@FindBy(xpath="//span[contains(text(),'Audio MP3')]")
private WebElement AudioMp;

@FindBy(xpath="(//span[contains(text(),'None')])[2]")
private WebElement AnsNone;

@FindBy(xpath="//span[contains(text(),'Answer Duration')]")
private WebElement AnswerDuration;

@FindBy(xpath="//span[contains(text(),'Mandatory Upload')]")
private WebElement MandatoryUpload;

@FindBy(xpath="(//span[contains(text(),'None')])[3]")
private WebElement AnsNonetwo;

@FindBy(id="answer_duration")
private WebElement Anstime;


@FindBy(xpath="//input[@id='preparation_time']")
private WebElement Preparationtime;

@FindBy(xpath="//input[@name='max_no_attempts']")
private WebElement maximumAttempts;

@FindBy(xpath="//span[contains(text(),'Completion on Submit')]")
private WebElement Completion;

@FindBy(xpath="//label[@id='module_code-error']")
private WebElement Modulecodeerror;

@FindBy(xpath="//label[@id='module_title-error']")
private WebElement Moduletitleerror;

@FindBy(xpath="//label[@id='short_description-error']")
private WebElement ShortDescriptionError;

@FindBy(xpath="//label[@id='long_description-error']")
private WebElement LongDescriptionError;

@FindBy(xpath="//li[contains(text(),'Module Code cannot have symbols')]")
private WebElement ModuleCodesymbol;

@FindBy(xpath="//li[contains(text(),'Moule title cannot have symbols')]")
private WebElement ModuleTitlesymbol;

@FindBy(xpath="//li[contains(text(),'Max Enrollments should always be a numeric value')]")
private WebElement Maximumusersymbol;

@FindBy(xpath="//li[contains(text(),'Max number of Attempts should always be a numeric ')]")
private WebElement MaxAttemptsymbol;

@FindBy(xpath="//li[contains(text(),'Please upload a valid jpg/png/gif file')]")
private WebElement InvalidUpload;

@FindBy(xpath ="//input[@placeholder='Search...']")
private WebElement ModuleSearch;

@FindBy(id="searchBtn")
private WebElement Search;

@FindBy(xpath="//i[@class='far fa-eye fa-lg']")
private WebElement preview;

@FindBy(xpath="//a[@id='btn_back']")
private WebElement BackToModule;


@FindBy(xpath="//a[@id='sessionstab']")
private WebElement Grading;

@FindBy(xpath="//div[@class='action-icon']//a[1]")
private WebElement Edit;

@FindBy(xpath="//div[@class='action-icon']//a[3]")
private WebElement Delete;

@FindBy(xpath="//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Unpublish')]")
private WebElement UnPublish;



public Assignment(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
}

public WebElement getModuleSearch() {
	return ModuleSearch;
}

public WebElement getDelete() {
	return Delete;
}

public WebElement getUnPublish() {
	return UnPublish;
}

public WebElement getPreview() {
	return preview;
}

public WebElement getEdit() {
	return Edit;
}


public WebElement getGrading() {
	return Grading;
}


public WebElement getSearch() {
	return Search;
}

public WebElement getBackToModule() {
	return BackToModule;
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

public WebElement getInvalidUpload() {
	return InvalidUpload;
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

public WebElement getDownloadableMedia() {
	return DownloadableMedia;
}

public WebElement getmaximumAttempts() {
	return maximumAttempts;
}

public WebElement getcontentUpload() {
	return contentUpload;
}


public WebElement getCompletion() {
	return Completion;
}
public WebElement getinstructions() {
	return instructions;
}

public WebElement getUpload() {
	return Upload;
}

public WebElement getPreparationtime() {
	return Preparationtime;
}

public WebElement getPlayableAudio() {
	return PlayableAudio;
}

public WebElement getNone() {
	return None;
}

public WebElement getexpdate() {
	return expdate;
}


public WebElement getModule() {
	return module;
}

public WebElement getSkills() {
	return Skills;
}

public WebElement getModuleThumbnailUpload() {
	return ModuleThumbnailUpload;
}


public WebElement getSearchSkills() {
	return SearchSkills;
}

public WebElement getShortDescription() {
	return shortDescription;
}

public WebElement getLongDescription() {
	return LongDescription;
}


public WebElement getModuleThumbnail() {
	return ModuleThumbnail;
}

public WebElement getQuestions() {
	return questions;
}

public WebElement getAnswers() {
	return answers;
}

public WebElement getCreateModule() {
	return createModule;
}

public WebElement getAssignment() {
	return assignment;
}

public WebElement getModuleCode() {
	return moduleCode;
}

public WebElement getModuleName() {
	return moduleName;
}


public WebElement getMaximumUser() {
	return maximumUser;
}

public WebElement getSave() {
	return save;
}

public WebElement getSaveSuccess() {
	return saveSuccess;
}

public WebElement getSavePublish() {
	return savePublish;
}

public WebElement getAudioMp() {
	return AudioMp;
}

public WebElement getUploadMedia () {
	return UploadMedia ;
}

public WebElement getAnsNone() {
	return AnsNone;
}

public WebElement getAnswerDuration() {
	return AnswerDuration;
}

public WebElement getMandatoryUpload() {
	return MandatoryUpload;
}

public WebElement getAnsNonetwo() {
	return AnsNonetwo;
}

public WebElement getAnstime() {
	return Anstime;
}


}
