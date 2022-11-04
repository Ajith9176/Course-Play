package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quiz {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Module Authoring')]")
	private WebElement module;

	@FindBy(xpath = "//button[contains(text(),'Create Module')]")
	private WebElement createModule;

	@FindBy(xpath = "//a[contains(text(),'Quiz')]")
	private WebElement quiz;
	
	
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
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement shortDescription;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/form/div[2]/ul/li[3]/div/div[2]/div[1]/div/div[2]")
	private WebElement longDescription;
	
	@FindBy(xpath="//input[@id='ask_question_number']")
	private WebElement ManyQuestionAsk;
	
	@FindBy(xpath="//input[@name='pass_percentage']")
	private WebElement passPercentage;
	
	//input[@id='quiz_duration']
	
	@FindBy(xpath="//input[@id='quiz_duration']")
	private WebElement quizDuration;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
	private WebElement Skills;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement SearchSkills;
	
	@FindBy(xpath="//input[@id='max_user_enrollment']")
	private WebElement maxuserenroll;
	
	@FindBy(xpath="//input[@id='expiration_date']")
	private WebElement expirationDate;
	
	@FindBy(xpath="//span[contains(text(),'Randomize Question Order')]")
	private WebElement RandomizeQuestion;
	
	@FindBy(xpath="//span[contains(text(),'Review Questions Before Submitting')]")
	private WebElement ReviewQuestion;
	
	@FindBy(xpath="//span[contains(text(),'Show Answers After Submit')]")
	private WebElement ShowAns;
	
	
	@FindBy(xpath="//span[contains(text(),'Randomize Options')]")
	private WebElement Randomizeoptions;
	
	@FindBy(xpath="//span[contains(text(),'None')]")
	private WebElement None;
	
	@FindBy(xpath="//span[contains(text(),'Mark For Later')]")
	private WebElement MarkForlater;
	
	@FindBy(xpath="//span[contains(text(),'Previous Question')]")
	private WebElement PreviouQuestions;
	
	@FindBy(xpath="//input[@id='max_no_attempts']")
	private WebElement MaxnoAttempts;
	
	@FindBy(xpath="//span[contains(text(),'Completion on Pass')]")
	private WebElement Completiononpass;
	
	@FindBy(xpath="//input[@id='submitbutton']")
	private WebElement save;
	
	@FindBy(xpath="//a[@class='btn btn-primary ml10']")
	private WebElement back;
	
	@FindBy(xpath="//label[@id='module_code-error']")
	private WebElement Modulecodeerror;

	@FindBy(xpath="//label[@id='module_title-error']")
	private WebElement Moduletitleerror;

	@FindBy(xpath="//label[@id='short_description-error']")
	private WebElement ShortDescriptionError;

	@FindBy(xpath="//label[@id='long_description-error']")
	private WebElement LongDescriptionError;
	
	@FindBy(xpath="//label[@id='ask_question_number-error']")
	private WebElement askQuestionerror;
	
	
	@FindBy(xpath="//label[@id='pass_percentage-error']")
	private WebElement passerror;

	@FindBy(xpath="//label[@id='quiz_duration-error']")
	private WebElement quizError;
	
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement Sucess;
	
	@FindBy(xpath="//a[@id='questionstab']")
	private WebElement Questiontab;	
	
	@FindBy(xpath="//a[@class='btn btn-primary ml15']")
	private WebElement downloadTemplate;
	
	@FindBy(id="import_csv")
	private WebElement Import;
	
	@FindBy(xpath="//button[@id='btnUpload']")
	private WebElement Sumbit;
	
	@FindBy(xpath="//div[@id=\"tabs-2\"]/div[2]/div/div/form/div[1]/a/div/button")
	private WebElement pickQuestion;
	
	
	
	@FindBy(xpath="//span[@class='text'][contains(text(),'One word/ Short')]")
	private WebElement oneword;
	

	
	@FindBy(xpath="//textarea[@id='question_title']")
	private WebElement Questions;
	
	@FindBy(xpath="//textarea[@id='correct_answer']")
	private WebElement Correctans;
	
	@FindBy(xpath="//textarea[@name='question_description']")
	private WebElement questiondescription;
	
	@FindBy(xpath="//textarea[@name='answer_description']")
	private WebElement correctansdescription;
	
	@FindBy(id="question_image")
	private WebElement QuestionImage;
	
	@FindBy(xpath="//a[@id='btnQuestionImage']")
	private WebElement QuestionImageUpload;
	
	@FindBy(id="downloadable_media_ques")
	private WebElement downloadablemediaques;
	
	@FindBy(xpath="//form[@id='frmquestion']//a[@id='btnDownloadableMedia']")
	private WebElement questionupload;
	
	@FindBy(xpath ="//a[@id='submitbutton']")
	private WebElement saveModule;
	
	
	@FindBy(xpath="//span[contains(text(),'Multiple Choice')]")
	private WebElement MultipleChoice;
	
	
	@FindBy(xpath="//li[@id='questionform2']//li//li[1]//textarea[1]")
	private WebElement Optionone;
	
	@FindBy(xpath="//li[@id='questionform2']//li//li[2]//textarea[1]")
	private WebElement Optiontwo;
	
	@FindBy(xpath="(//div[@class=\"ui-checkbox ui-checkbox-primary\"])[1]")
	private WebElement correctone;

	@FindBy(xpath="(//div[@class=\"ui-checkbox ui-checkbox-primary\"])[2]")
	private WebElement correcttwo;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Pick One')]")
	private WebElement pickone;
	
	@FindBy(xpath="//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary ml10'][contains(text(),'Save and Publish')]")
	private WebElement saveandpublish;
	
	@FindBy(xpath="//li[contains(text(),'Question can not be empty')]")
	private WebElement questionempty;
	
	@FindBy(xpath="//li[contains(text(),'Correct Answer can not be empty')]")
	private WebElement ansempty;
	
	@FindBy(xpath="//div[@id='slider']")
	private WebElement Slider;
	
	@FindBy(xpath="//label[@id='ask_question_number-error']")
	private WebElement Questionspecial;
	
	@FindBy(xpath="//label[@id='pass_percentage-error']")
	private WebElement passSpecial;
	
	@FindBy(xpath="//label[@id='quiz_duration-error']")
	private WebElement quizSpecial;
	
	
	
	
	public Quiz(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getQuestionspecial() {
		return Questionspecial;
	}
	
	public WebElement getpassSpecial() {
		return passSpecial;
	}
	
	public WebElement getquizSpecial() {
		return quizSpecial;
	}
	

	public WebElement getSlider() {
		return Slider;
	}


	public WebElement getModule() {
		return module;
	}

	public WebElement getCreateModule() {
		return createModule;
	}

	public WebElement getQuiz() {
		return quiz;
	}
	
	public WebElement getNone() {
		return None;
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

	public WebElement getShortDescription() {
		return shortDescription;
	}

	public WebElement getLongDescription() {
		return longDescription;
	}

	public WebElement getManyQuestionAsk() {
		return ManyQuestionAsk;
	}

	public WebElement getPassPercentage() {
		return passPercentage;
	}

	public WebElement getQuizDuration() {
		return quizDuration;
	}

	public WebElement getSkills() {
		return Skills;
	}

	public WebElement getSearchSkills() {
		return SearchSkills;
	}

	public WebElement getMaxuserenroll() {
		return maxuserenroll;
	}

	public WebElement getExpirationDate() {
		return expirationDate;
	}

	public WebElement getRandomizeQuestion() {
		return RandomizeQuestion;
	}

	public WebElement getReviewQuestion() {
		return ReviewQuestion;
	}

	public WebElement getShowAns() {
		return ShowAns;
	}

	public WebElement getRandomizeoptions() {
		return Randomizeoptions;
	}

	public WebElement getMarkForlater() {
		return MarkForlater;
	}

	public WebElement getPreviouQuestions() {
		return PreviouQuestions;
	}

	public WebElement getMaxnoAttempts() {
		return MaxnoAttempts;
	}

	public WebElement getCompletiononpass() {
		return Completiononpass;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getBack() {
		return back;
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

	public WebElement getAskQuestionerror() {
		return askQuestionerror;
	}

	public WebElement getPasserror() {
		return passerror;
	}

	public WebElement getQuizError() {
		return quizError;
	}

	public WebElement getSucess() {
		return Sucess;
	}

	public WebElement getQuestiontab() {
		return Questiontab;
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

	public WebElement getPickQuestion() {
		return pickQuestion;
	}

	public WebElement getOneword() {
		return oneword;
	}

	public WebElement getQuestions() {
		return Questions;
	}

	public WebElement getCorrectans() {
		return Correctans;
	}

	public WebElement getQuestiondescription() {
		return questiondescription;
	}

	public WebElement getCorrectansdescription() {
		return correctansdescription;
	}

	public WebElement getQuestionImage() {
		return QuestionImage;
	}

	public WebElement getQuestionImageUpload() {
		return QuestionImageUpload;
	}

	public WebElement getDownloadablemediaques() {
		return downloadablemediaques;
	}

	public WebElement getQuestionupload() {
		return questionupload;
	}

	public WebElement getSaveModule() {
		return saveModule;
	}

	public WebElement getMultipleChoice() {
		return MultipleChoice;
	}

	public WebElement getOptionone() {
		return Optionone;
	}

	public WebElement getOptiontwo() {
		return Optiontwo;
	}

	public WebElement getCorrectone() {
		return correctone;
	}

	public WebElement getCorrecttwo() {
		return correcttwo;
	}

	public WebElement getPickone() {
		return pickone;
	}

	public WebElement getSaveandpublish() {
		return saveandpublish;
	}

	public WebElement getQuestionempty() {
		return questionempty;
	}

	public WebElement getAnsempty() {
		return ansempty;
	}
	
	
	
}
