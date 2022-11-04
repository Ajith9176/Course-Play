package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseAuthoring {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Course Authoring')]")
	private WebElement course;
	

	@FindBy(xpath="//a[@class='dt-button btn btn-primary']")
	private WebElement createCourse;
	
	@FindBy(xpath="//input[@name='course_code']")
	private WebElement courseCode;
	
	@FindBy(xpath="//input[@name='course_title']")
	private WebElement courseTitle;
	
	@FindBy(xpath="//li[3]//div[1]//div[1]//div[1]//button[1]")
	private WebElement courseType;
	
	@FindBy(xpath="//span[@class='text'][contains(text(),'Loganathan')]")
	private WebElement courseAuthor;
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement shortDescription;
	
	@FindBy(xpath="//div[@id='mceu_56-body']/div[2]/iframe")
	private WebElement LongDescription;
	
	@FindBy(xpath ="//label[@class='control-label ui-radio-inline']//span[contains(text(),'Assessment')]" )
	private WebElement assessment;
	
	@FindBy(xpath="//label[@class='control-label ui-radio-inline']//span[contains(text(),'Learning')]")
	private WebElement Learning;
	
	@FindBy(xpath ="//span[contains(text(),'Free to access')]")
	private WebElement freeToAccess;
	
	@FindBy(xpath ="//span[contains(text(),'Standard')]")
	private WebElement Standard;
	
	
	@FindBy(xpath ="//input[@id='recommend_start_date']")
	private WebElement startDate;
	
	@FindBy(xpath ="//input[@id='recommend_end_date']")
	private WebElement endDate;
	
	@FindBy(xpath="//input[@id='activation_date']")
	private WebElement activationDate;
	
	@FindBy(xpath ="//input[@name='max_enrollments']")
	private WebElement maximumUser;
	
	@FindBy(xpath="//input[@id='submitbutton']") 
	private WebElement save;
	
	@FindBy(xpath="//li[@id='tab2']")
	private WebElement announcement;
	
	@FindBy(xpath="//button[@class='btn-click btn btn-primary']")
	private WebElement createPost;
	
	@FindBy(xpath= "//input[@name='announcement_title']")
	private WebElement announcementTitle;
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement shortDes;
	
	@FindBy(xpath= "//input[@id='published_date']")
	private WebElement publishday;
	
	@FindBy(xpath="//table//tbody/tr[3]/td[2]")
	private WebElement publishDate;
	
	@FindBy(xpath= "//input[@id='publish_time_bg']")
	private WebElement publishTimer;
	

	public WebElement getPublishTimer() {
		return publishTimer;
	}
	
	@FindBy(xpath="//div[@class=\"ui-timepicker-wrapper ui-timepicker-positioned-top\"]/ul/li[25]")
	private WebElement publishTime;
	
	@FindBy(xpath = "//div[@class=\"col-md-8\"]/div[1]/div/div[3]/iframe")
	private WebElement post;
	
	
	@FindBy(xpath="//input[@id='submitbutton']")
	private WebElement saveAnnouncement;
	
	@FindBy(xpath="//a[@class=\"clspublish btn btn-primary mr10\"]")
	private WebElement saveandpublishannoucement;
	
	@FindBy(xpath = "//div[@class=\"overview\"]/div/div/div/strong")
	private WebElement AnnouncementSuccess;
	
	
	@FindBy(xpath="//a[@id='modules-tab']")
	private WebElement modules;
	
	@FindBy(xpath="//div[@id='tabs-3']//div[@class='col-md-12']//div[1]//a[2]")
	private WebElement addModules;
	
	@FindBy(xpath="//div[@class=\"table-responsive table-scroll-datatable\"]/table/tbody/tr[1]/td[1]")
	private WebElement moduleCheckBox;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	private WebElement actions;
	
	@FindBy(xpath="//a[@id='bulk-add']")
	private WebElement bulkAdd;
	
	@FindBy(xpath="//span[contains(text(),'Back To Module List')]")
	private WebElement backToModule;
	
	@FindBy(xpath="//a[@id='discussion-tab']")
	private WebElement discussion;
	
	@FindBy(xpath="//button[contains(text(),'Add New Discussion')]")
	private WebElement adddiscussion;
	
	@FindBy(xpath="//input[@name='discussion_title']")
	private WebElement disscussionTitle;
	
	@FindBy(xpath="//textarea[@id='short_description']")
	private WebElement description;
	
	@FindBy(xpath="//input[@class=\"btn btn-primary mr10\"]")
	private WebElement saveDisucussion;
	
	@FindBy(xpath="//div[@class='col-md-12 mb15 searchbtn-group']//a[@class='clspublish btn btn-primary btn-w140 ml10'][contains(text(),'Publish')]")
	private WebElement publish;
	
	@FindBy(xpath="//a[@id='ui-id-3']")
	private WebElement goals;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])/div/table/tbody/tr[1]/td[1]")
	private WebElement learner;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])/div/table/tbody/tr[1]/td[1]")
	private WebElement subAdmin;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	private WebElement actionsGoal;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Assign Goals')]")
	private WebElement bulkGoals;
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement BulkSearch;
	
	
	public CourseAuthoring(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourse() {
		return course;
	}
	public WebElement getBulkSearch() {
		return BulkSearch;
	}
	
	public WebElement getAnnouncementSuccess() {
		return announcement;
	}
	
	public WebElement getStandard() {
		return Standard;
	}
	
	public WebElement getLearning() {
		return Learning;
	}
	
	

	public WebElement getSaveAndPublishAnnoucement() {
		return saveandpublishannoucement;
	}

	public WebElement getCreateCourse() {
		return createCourse;
	}

	public WebElement getCourseCode() {
		return courseCode;
	}

	public WebElement getCourseTitle() {
		return courseTitle;
	}

	public WebElement getCourseType() {
		return courseType;
	}

	public WebElement getCourseAuthor() {
		return courseAuthor;
	}

	public WebElement getShortDescription() {
		return shortDescription;
	}

	public WebElement getLongDescription() {
		return LongDescription;
	}

	public WebElement getAssessment() {
		return assessment;
	}

	public WebElement getFreeToAccess() {
		return freeToAccess;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getActivationDate() {
		return activationDate;
	}

	public WebElement getMaximumUser() {
		return maximumUser;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getAnnouncement() {
		return announcement;
	}

	public WebElement getCreatePost() {
		return createPost;
	}

	public WebElement getAnnouncementTitle() {
		return announcementTitle;
	}

	public WebElement getShortDes() {
		return shortDes;
	}

	public WebElement getPublishDate() {
		return publishDate;
	}

	public WebElement getPublishTime() {
		return publishTime;
	}

	public WebElement getPost() {
		return post;
	}

	public WebElement getSaveAnnouncement() {
		return saveAnnouncement;
	}

	public WebElement getModules() {
		return modules;
	}

	public WebElement getAddModules() {
		return addModules;
	}

	public WebElement getModuleCheckBox() {
		return moduleCheckBox;
	}

	public WebElement getActions() {
		return actions;
	}

	public WebElement getBulkAdd() {
		return bulkAdd;
	}

	public WebElement getBackToModule() {
		return backToModule;
	}

	public WebElement getDiscussion() {
		return discussion;
	}

	public WebElement getAdddiscussion() {
		return adddiscussion;
	}

	public WebElement getDisscussionTitle() {
		return disscussionTitle;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getSaveDisucussion() {
		return saveDisucussion;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getGoals() {
		return goals;
	}

	public WebElement getLearner() {
		return learner;
	}

	public WebElement getActionsGoal() {
		return actionsGoal;
	}

	public WebElement getBulkGoals() {
		return bulkGoals;
	}
	
	public WebElement getPublishday() {
		return publishday;
	}
	
	public WebElement getSubAdmin() {
		return subAdmin;
	}
	
	
	
	
	
}







