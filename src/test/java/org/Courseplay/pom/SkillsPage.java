package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//span[contains(text(),'Skills')]")
	private WebElement skills;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	private WebElement actions;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']//a[contains(text(),'Create Skill')]")
	private WebElement createSkills;
	
	@FindBy(xpath ="//input[@name='skill_code']")
	private WebElement skillCode;
	
	@FindBy(xpath="//input[@name='skill_name']")
	private WebElement skillName;
	
	@FindBy(xpath = "//textarea[@name='skill_description']")
	private WebElement skillDescription;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement skillType;
	
	@FindBy(xpath="//span[contains(text(),'Behavioural')]")
	private WebElement behavioural;
	
	@FindBy(xpath="//span[contains(text(),'Functional')]")
	private WebElement Functional;
	
	@FindBy(xpath="//span[contains(text(),'Technical')]")
	private WebElement Technical;
	
	@FindBy(xpath="//span[contains(text(),'Process')]")
	private WebElement Process;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement save;
	
	@FindBy(xpath= "(//div[@class='col-md-12'])[3]/div/div/strong")
	private WebElement saveSuccess;
	
	@FindBy(xpath ="//a[@class='categoryUsers ui-tabs-anchor']")
	private WebElement skillLevels;
	
	@FindBy(xpath= "//a[@class='btn btn-primary right add-level']")
	private WebElement addSkill;
	
	@FindBy(xpath ="//table//tbody//tr/td[2]/input")
	private WebElement levelName;
	
	@FindBy(xpath = "//table//tbody//tr/td[3]/textarea")
	private WebElement levelDescription;
	
	@FindBy(xpath = "//table//tbody//tr/td[4]/input")
	private WebElement levelMag;
	
	@FindBy(xpath = "//table//tbody//tr/td[5]/button[1]")
	private WebElement saveSkill;
	
	@FindBy(xpath ="//a[@id='btn_finish']")
	private WebElement publish;
	
	@FindBy(xpath="//li[contains(text(),'Skill Code already exists')]")
	private WebElement SkillCodeExists;
	
	@FindBy(xpath="//li[contains(text(),'Skill Name already exists')]")
	private WebElement SkillNameExists;
	
	@FindBy(xpath="//a[@class='import']")
	private WebElement importskills;
	
	
	@FindBy(xpath ="//input[@id='import_csv']")
	private WebElement ChoosefileImport;
	
	@FindBy(xpath ="//button[@id='btnUpload']")
	private WebElement ImportSubmit;
	
	
	@FindBy(xpath="//button[@class='close btnClose']")
	private WebElement CloseImport;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")
	private WebElement SearchUsers;
	
	@FindBy(xpath = "//button[@id='button-go']")
	private WebElement Go;
	
	@FindBy(xpath="(//i[@class=\"far fa-edit fa-lg\"])[1]")
	private WebElement Edit;
	
	@FindBy(xpath="(//i[@class=\"far fa-clone fa-lg\"])[1]")
	private WebElement Clone;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement SkillClone;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement ManageCompenetencyGroups;
	
	@FindBy(xpath="//a[contains(text(),'Create Competency Group')]")
	private WebElement CreateCompetency;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement GroupCode;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement GroupName;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement GroupDescripition;
	
	@FindBy(xpath="//input[@id='submitbutton']")
	private WebElement GroupSave;
	
	
	@FindBy(xpath="//a[@id='ui-id-2']")
	private WebElement Skillslist;
	
	
	@FindBy(xpath="//li[@class='selected']//a")
	private WebElement Twoentries;
	
	
	
	@FindBy(xpath="//div[@class=\"btn-group bootstrap-select\"]")
	private WebElement selectEntries;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick']")
	private WebElement CompentencyGroups;
	
	@FindBy(xpath="//div[@class='bs-searchbox']//input[@class='form-control']")
	private WebElement SearchCompentency;
	
	@FindBy(xpath="//input[@id='skill_color']")
	private WebElement skillcolor;
	
	
	public WebElement getSearchCompentency() {
		return SearchCompentency;
	}
	
	public WebElement getskillcolor() {
		return skillcolor;
	}
	
	
	public WebElement getCompentencyGroups() {
		return CompentencyGroups;
	}
	
	
	
	public WebElement getTwoentries() {
		return Twoentries;
	}
	
	public WebElement getselectEntries() {
		return selectEntries;
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSkillNameExists() {
		return SkillNameExists;
	}
	
	public WebElement getSkillslist() {
		return Skillslist;
	}
	
	public WebElement getGroupCode() {
		return GroupCode;
	}
	
	public WebElement getGroupSave() {
		return GroupSave;
	}
	
	
	
	public WebElement getGroupName() {
		return GroupName;
	}
	
	
	public WebElement getGroupDescripition() {
		return GroupDescripition;
	}
	
	public WebElement getCreateCompetencys() {
		return CreateCompetency;
	}

	
	public WebElement getManageCompenetencyGroups() {
		return ManageCompenetencyGroups;
	}
	
	public WebElement getEdit() {
		return Edit;
	}
	
	public WebElement getClone() {
		return Clone;
	}
	
	public WebElement getSkillClone() {
		return SkillClone;
	}
	
	
	public WebElement getCloseImport() {
		return CloseImport;
	}
	
	public WebElement getImportSubmit() {
		return ImportSubmit;
	}
	
	public WebElement getChoosefileImport() {
		return ChoosefileImport;
	}
	
	public WebElement getImportskills() {
		return importskills;
	}
	
	public WebElement getSkillCodeExists() {
		return SkillCodeExists;
	}
	
	public WebElement getSearchUsers() {
		return SearchUsers;
	}


	public WebElement getGo() {
		return Go;
	}


	public WebElement getSaveSuccess() {
		return saveSuccess;
	}

	public WebElement getFunctional() {
		return Functional;
	}
	
	public WebElement getTechnical() {
		return Technical;
	}
	
	public WebElement getProcess() {
		return Process;
	}


	public WebElement getSkillLevels() {
		return skillLevels;
	}




	public WebElement getAddSkill() {
		return addSkill;
	}




	public WebElement getLevelName() {
		return levelName;
	}




	public WebElement getLevelDescription() {
		return levelDescription;
	}




	public WebElement getLevelMag() {
		return levelMag;
	}




	public WebElement getSaveSkill() {
		return saveSkill;
	}




	public WebElement getPublish() {
		return publish;
	}




	public WebElement getSaveSucess() {
		return saveSuccess;
	}




	public WebElement getSkills() {
		return skills;
	}



	public WebElement getActions() {
		return actions;
	}



	public WebElement getCreateSkills() {
		return createSkills;
	}



	public WebElement getSkillCode() {
		return skillCode;
	}



	public WebElement getSkillName() {
		return skillName;
	}



	public WebElement getSkillDescription() {
		return skillDescription;
	}



	public WebElement getSkillType() {
		return skillType;
	}



	public WebElement getBehavioural() {
		return behavioural;
	}



	public WebElement getSave() {
		return save;
	}

	public SkillsPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	

}
