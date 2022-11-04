package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
	public WebDriver driver;
	
	
	@FindBy(xpath ="//div[@class='col-sm-12']/div/table/tbody/tr[1]/td[6]")
	private WebElement status;
	
	@FindBy(xpath ="//div[@class='col-sm-12']/div/table/tbody/tr[1]/td[5]")
	private WebElement userRole;
	
	
	@FindBy(xpath ="//li[@alt='user']")
	private WebElement Users;
	
	@FindBy(xpath="//div[@class='btn-group']")
	private WebElement Actions;
	
	@FindBy(xpath= "//ul[@class='dropdown-menu']//a[contains(text(),'Create User')]")
	private WebElement CreateUser;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement FirstName;
	
	@FindBy(id ="last_name")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailUser;
	
	@FindBy(xpath= "//input[@id='contact_no']")
	private WebElement ContactNo;
	
	@FindBy(xpath ="//input[@id='address_line_1']")
	private WebElement AddressLine1;

	@FindBy(xpath ="//input[@id='address_line_2']")
	private WebElement AddressLine2;
	
	@FindBy(id = "city")
	private WebElement City;
	
	@FindBy(xpath= "//input[@id='state']")
	private WebElement State;
	
	@FindBy(xpath="//li[7]//div[1]//div[1]//div[1]//button[1]")
	private WebElement CountryCode;
	
	@FindBy(xpath="//li[@class='selected active']//a")
	private WebElement India;
	
	@FindBy(xpath ="//input[@id='mobile_no']")
	private WebElement MobileNumber;
	
	@FindBy(xpath ="//li[8]//div[1]//div[1]//div[1]//button[1]")
	private WebElement Role;
	
	@FindBy(xpath ="//div[@id='content']//li[4]//a[1]")
	private WebElement ScrollRole;
	
	@FindBy(xpath ="//div[@id='content']//li[4]//a[1]")
	private WebElement Learner;
	
@FindBy(xpath="//span[@class='text'][contains(text(),'Course Author')]")
private WebElement CourseAuthor;

@FindBy(xpath="//span[contains(text(),'Client Sub Admin')]")
private WebElement SubAdmin;
	
	@FindBy(xpath ="//textarea[@id='introduction']")
	private WebElement Biography;
	
	@FindBy(xpath ="//input[@id='dob']")
	private WebElement DOB;
	
	@FindBy(xpath = "//li[12]//div[1]//div[1]//div[1]//button[1]")
	private WebElement Designation;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select show-tick open']//a" )
	private WebElement SelectCategory;
	
	
	@FindBy(xpath ="//span[contains(text(),'Allow to Edit Profile')]")
	private WebElement ProfileCheck;
	
	
	@FindBy(xpath ="//span[contains(text(),'Allow to Change Password')]")
	private WebElement Passwordcheck;
	
	@FindBy(xpath ="//a[@id='688_anchor']")
	private WebElement PasswordUpdate;
	
	@FindBy(xpath ="//span[contains(text(),'Send Emails')]")
	private WebElement SendUncheck;
	
	@FindBy(xpath ="//span[contains(text(),'Send Emails')]")
	private WebElement Sendcheck;
	
	@FindBy(xpath ="//li[17]//div[1]//div[2]//div[1]//button[1]")
	private WebElement Language;
	
	@FindBy(xpath = "//li[@class='selected active']//a")
	private WebElement English;
	
	@FindBy(xpath ="//input[@id='expiry_date']")
	private WebElement ExpiryDate;
	
	@FindBy(id = "submitbutton")
	private WebElement Save;
	
	@FindBy(xpath="//a[@class='import']")
	private WebElement Import;
	
	@FindBy(xpath ="//input[@id='import_csv']")
	private WebElement ChoosefileImport;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement ImportPassword;
	
	@FindBy(xpath ="//button[@id='btnUpload']")
	private WebElement ImportSubmit;
	

	@FindBy(xpath="//button[@class='close btnClose']")
	private WebElement CloseImport;
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement SearchLearner;
	
	@FindBy(xpath="//div[@class='action-icon']//a[1]")
	private WebElement EditImportLearner;
	
	@FindBy(xpath="//a[@id='setting-tab']")
	private WebElement Settings;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick open']")
	private WebElement DesignationSettings;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick open']//a")
	private WebElement GeometryDes;
	
	@FindBy(xpath="(//button[@class='btn dropdown-toggle btn-default'])[11]")
	private WebElement LearnerSettings;	
	
	@FindBy(xpath="//span[contains(text(),'Art')]")
	private WebElement ArtLearner;
	
	@FindBy(id="save")
	private WebElement SaveSettings;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement goalsImport;
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement Searchgoals;
	
	@FindBy(xpath="//input[@name='check_courses']")
	private WebElement SelectGoal;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	private WebElement GoalAction;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Assign Goals')]")
	private WebElement GoalBulkAdd;
	
	@FindBy(xpath="(//div//strong[contains(text(),'User edited Successfully')])[1]")
	private WebElement SettingsSuccessfully;
	
	@FindBy(xpath="//strong[contains(text(),'Goal assigned to 1 courses successfully')]")
	private WebElement GoalsSuccessfully;
	
	@FindBy(xpath ="//div[@class='main-container clearfix nav-expand']//strong[1]")
	private WebElement Nousers;
	
	@FindBy(xpath="//a[@class='importStatus']")
	private WebElement SuspendDelete;
	
	@FindBy(xpath ="//div[@id='importUserStatus']//label[2]")
	private WebElement ChoosefileSuspend;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//button[@class='btn dropdown-toggle btn-default']")
	private WebElement SelectSuspendDelete;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[@class='selected']//a")
	private WebElement SelectSuspend;
	
	@FindBy(xpath ="//div[@id='importUserStatus']//li[3]//a[1]")
	private WebElement SelectDelete;
	
	@FindBy(xpath="//button[@id='btnEditUserStatus']")
	private WebElement SumbitSuspendDelete;
	
	
	@FindBy(xpath ="//a[contains(text(),'Export All')]")
	private WebElement ExportAll;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")
	private WebElement SearchUsers;
	
	@FindBy(xpath = "//button[@id='button-go']")
	private WebElement Go;
		
	@FindBy(xpath="//a[contains(text(),'Bulk Suspend Users')]")
	private WebElement BulkSuspendUsers ;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Unsuspend Users')]")
	private WebElement BulkUnsuspendUsers;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Enable change Password')]")
	private WebElement BulkChangePassword;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Disable change Password')]")
	private WebElement BulkDisableChangePassword;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Enable Force Change Password')]")
	private WebElement BulkEnableForcePassword;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Disable Force Change Password')]")
	private WebElement BulkDisableForcePassword;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Enable change Profile')]")
	private WebElement BulkEnableChangeProfile;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Disable change Profile')]")
	private WebElement BulkDisableChangeProfile;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Verification Email')]")
	private WebElement BulkVerificationEmail;
	
	@FindBy(xpath ="//a[contains(text(),'Bulk Enable Send Emails')]")
	private WebElement BulkEnableSendEmails;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Disable Send Emails')]")
	private WebElement BulkDisableSendEmails;
	
	@FindBy(xpath ="//li[contains(text(),'Email is already used by other user in the Applica')]")
	private WebElement EmailAlreadyUsed;
	
	@FindBy(xpath ="//button[@class='btn btn-default ml10']")
	private WebElement Back;
	

	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/a[1]")
	private WebElement Edit; 
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement LastLogin;
	
	@FindBy(xpath ="//div[@class='dataTables_wrapper no-footer']//div[3]//div[1]//div[1]//button[1]")
	private WebElement DesignationSearch;
	
	@FindBy(xpath ="//span[@class='text'][contains(text(),'Geometry')]")
	private WebElement Descheckbox;
	
	@FindBy(xpath ="//button[@id='button-go']")
	private WebElement GoSearch;
	
	@FindBy(xpath="//i[@id='searchBtn']")
	private WebElement SearchIcon;
	
	@FindBy(xpath="//h3[contains(text(),'User Settings')]")
	private WebElement UserSettings;
	
	@FindBy(xpath="//input[@id='pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='user_code']")
	private WebElement UserCode;

	@FindBy(tagName="html")
	private WebElement Scrolldown;
	
	@FindBy(xpath="//strong[contains(text(),'User added successfully')]")
	private WebElement UserAdded;
	
	@FindBy(xpath="//strong[contains(text(),'User edited Successfully')]")
	private WebElement UserEditedVerify;
	
	@FindBy(xpath ="//i[@class='far fa-eye fa-lg']")
	private WebElement Preview;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement PasswordChange;
	
	@FindBy(xpath="//i[@id='btnSave']")
	private WebElement passwordsave;
	
	@FindBy(xpath="//strong[contains(text(),'Password should contain atleast 6 characters, 1 up')]")
	private WebElement PasswordCheckStatus;
	
	@FindBy(xpath="(//i[@class=\"fas fa-check-circle fa-lg assigned-goal\"])[1]")
	private WebElement Suspend;

	@FindBy(xpath="(//i[@class=\"far fa-envelope fa-lg\"])[1]")
	private WebElement Envelope;

	@FindBy(xpath="(//i[@class=\"fas fa-bullseye fa-lg\"])[1]")
	private WebElement Goals;

	@FindBy(xpath="(//div[@class='col-sm-12'])/div/table/tbody/tr[1]/td[1]")
	private WebElement GoalsAssign;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	private WebElement actionsGoal;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Assign Goals')]")
	private WebElement bulkGoals;
	
	@FindBy(xpath="(//i[@class=\"far fa-trash-alt fa-lg\"])[1]")
	private WebElement UserDelete;
	
	@FindBy(xpath="//li[@class='selected']//a")
	private WebElement Twoentries;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select open']//button[@class='btn dropdown-toggle btn-default']")
	private WebElement selectEntries;
	
	@FindBy(id="joining_date")
	private WebElement joiningDate;
	
	@FindBy(xpath="//span[contains(text(),'Force User to Change Password')]")
	private WebElement ForceUser;
	
	@FindBy(xpath="//span[contains(text(),'Suspend User')]")
	private WebElement SuspendUser;
	

	
	public Users(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTwoentries() {
		return Twoentries;
	}
	public WebElement getSuspendUser() {
		return SuspendUser;
	}
	
	public WebElement getForceUser() {
		return ForceUser;
	}
	
	public WebElement getjoiningDate() {
		return joiningDate;
	}
	
	public WebElement getselectEntries() {
		return selectEntries;
	}
	
	
	public WebElement getActionsGoal() {
		return actionsGoal;
	}
	
	public WebElement getUserDelete() {
		return UserDelete;
	}
	
	public WebElement getBulkGoals() {
		return bulkGoals;
	}
	
	public WebElement getUserEditedVerify() {
		return UserEditedVerify;
	}
	
	public WebElement getEnvelope() {
		return Envelope;
	}
	
	public WebElement getGoals() {
		return Goals;
	}
	
	public WebElement getGoalsAssign() {
		return GoalsAssign;
	}
	
	public WebElement getPasswordCheckStatus() {
		return PasswordCheckStatus;
	}
	
	public WebElement getUserSettings() {
		return UserSettings;
	}
	
	public WebElement getsuspend() {
		return Suspend;
	}
	
	public WebElement getUserAdded() {
		return UserAdded;
	}
	public WebElement getUserCode() {
		return UserCode;
	}
	
	public WebElement getGoSearch() {
		return GoSearch;
	}
	
	public WebElement getpasswordsave() {
		return passwordsave;
	}
	
	public WebElement getpreview() {
		return Preview;
	}
	
	public WebElement getSearchIcon() {
		return SearchIcon;
	}
	
	public WebElement getpincode() {
		return pincode;
	}
	
	
	public WebElement getDescheckbox() {
		return Descheckbox;
	}
	public WebElement getDesignationSearch() {
		return DesignationSearch;
	}
	
	public WebElement getStatus() {
		return status;
	}
	public WebElement getScrolldown() {
		return Scrolldown;
	}

	public WebElement getUserRole() {
		return userRole;
	}


	public WebElement getUsers() {
		return Users;
	}


	public WebElement getActions() {
		return Actions;
	}


	public WebElement getCreateUser() {
		return CreateUser;
	}


	public WebElement getFirstName() {
		return FirstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getEmailUser() {
		return EmailUser;
	}


	public WebElement getContactNo() {
		return ContactNo;
	}


	public WebElement getAddressLine1() {
		return AddressLine1;
	}


	public WebElement getAddressLine2() {
		return AddressLine2;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getState() {
		return State;
	}


	public WebElement getCountryCode() {
		return CountryCode;
	}


	public WebElement getIndia() {
		return India;
	}


	public WebElement getMobileNumber() {
		return MobileNumber;
	}


	public WebElement getRole() {
		return Role;
	}


	public WebElement getLearner() {
		return Learner;
	}
	
	public WebElement getCourseAuthor() {
		return CourseAuthor;
	}
	
	public WebElement getSubAdmin() {
		return SubAdmin;
	}

	public WebElement getBiography() {
		return Biography;
	}


	public WebElement getDOB() {
		return DOB;
	}


	public WebElement getDesignation() {
		return Designation;
	}


	public WebElement getSelectCategory() {
		return SelectCategory;
	}


	public WebElement getProfileCheck() {
		return ProfileCheck;
	}



	public WebElement getPasswordcheck() {
		return Passwordcheck;
	}

	public WebElement getPasswordUpdate() {
		return PasswordUpdate;
	}

	public WebElement getPasswordChange() {
		return PasswordChange;
	}

	
	public WebElement getSendUncheck() {
		return SendUncheck;
	}


	public WebElement getSendcheck() {
		return Sendcheck;
	}


	public WebElement getLanguage() {
		return Language;
	}


	public WebElement getEnglish() {
		return English;
	}


	public WebElement getExpiryDate() {
		return ExpiryDate;
	}


	public WebElement getSave() {
		return Save;
	}


	public WebElement getImport() {
		return Import;
	}


	public WebElement getChoosefileImport() {
		return ChoosefileImport;
	}


	public WebElement getImportPassword() {
		return ImportPassword;
	}


	public WebElement getImportSubmit() {
		return ImportSubmit;
	}


	public WebElement getCloseImport() {
		return CloseImport;
	}


	public WebElement getSearchLearner() {
		return SearchLearner;
	}


	public WebElement getEditImportLearner() {
		return EditImportLearner;
	}


	public WebElement getSettings() {
		return Settings;
	}


	public WebElement getDesignationSettings() {
		return DesignationSettings;
	}


	public WebElement getGeometryDes() {
		return GeometryDes;
	}


	public WebElement getLearnerSettings() {
		return LearnerSettings;
	}


	public WebElement getArtLearner() {
		return ArtLearner;
	}


	public WebElement getSaveSettings() {
		return SaveSettings;
	}


	public WebElement getGoalsImport() {
		return goalsImport;
	}


	public WebElement getSearchgoals() {
		return Searchgoals;
	}


	public WebElement getSelectGoal() {
		return SelectGoal;
	}


	public WebElement getGoalAction() {
		return GoalAction;
	}


	public WebElement getGoalBulkAdd() {
		return GoalBulkAdd;
	}


	public WebElement getSettingsSuccessfully() {
		return SettingsSuccessfully;
	}


	public WebElement getGoalsSuccessfully() {
		return GoalsSuccessfully;
	}


	public WebElement getNousers() {
		return Nousers;
	}


	public WebElement getSuspendDelete() {
		return SuspendDelete;
	}


	public WebElement getChoosefileSuspend() {
		return ChoosefileSuspend;
	}


	public WebElement getSelectSuspendDelete() {
		return SelectSuspendDelete;
	}


	public WebElement getSelectSuspend() {
		return SelectSuspend;
	}


	public WebElement getSelectDelete() {
		return SelectDelete;
	}


	public WebElement getSumbitSuspendDelete() {
		return SumbitSuspendDelete;
	}


	public WebElement getExportAll() {
		return ExportAll;
	}


	public WebElement getSearchUsers() {
		return SearchUsers;
	}


	public WebElement getGo() {
		return Go;
	}


	public WebElement getBulkSuspendUsers() {
		return BulkSuspendUsers;
	}


	public WebElement getBulkUnsuspendUsers() {
		return BulkUnsuspendUsers;
	}


	public WebElement getBulkChangePassword() {
		return BulkChangePassword;
	}


	public WebElement getBulkDisableChangePassword() {
		return BulkDisableChangePassword;
	}


	public WebElement getBulkEnableForcePassword() {
		return BulkEnableForcePassword;
	}


	public WebElement getBulkDisableForcePassword() {
		return BulkDisableForcePassword;
	}


	public WebElement getBulkEnableChangeProfile() {
		return BulkEnableChangeProfile;
	}


	public WebElement getBulkDisableChangeProfile() {
		return BulkDisableChangeProfile;
	}


	public WebElement getBulkVerificationEmail() {
		return BulkVerificationEmail;
	}


	public WebElement getBulkEnableSendEmails() {
		return BulkEnableSendEmails;
	}


	public WebElement getBulkDisableSendEmails() {
		return BulkDisableSendEmails;
	}


	public WebElement getEmailAlreadyUsed() {
		return EmailAlreadyUsed;
	}


	public WebElement getBack() {
		return Back;
	}


	public WebElement getEdit() {
		return Edit;
	}


	public WebElement getLastLogin() {
		return LastLogin;
	}
	
	public WebDriver getDriver() {
		return driver;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
