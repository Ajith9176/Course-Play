package org.Courseplay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories {
	
	private WebDriver driver;
	
	@FindBy(xpath= "//li[@alt='category']")
	private WebElement categories;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	private WebElement categoriesAction;
	
	@FindBy(xpath ="//ul[@class='dropdown-menu']//a[contains(text(),'Create Category')]")
	private WebElement createcategory;
	
	@FindBy(xpath="//a[@class='import']")
	private WebElement Import;
	
	@FindBy(xpath ="//input[@name='category_code']")
	private WebElement categoryCode;
	
	@FindBy(xpath ="//input[@name='category_name']")
	private WebElement categoryName;
	
	@FindBy(xpath="//div[@class='col-md-4 col-sm-6']//div[1]//button[1]")
	private WebElement categoryType;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[2]//a[1]")
	private WebElement designation;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[4]//a[1]")
	private WebElement Batch;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[8]//a[1]")
	private WebElement Others;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[6]//a[1]")
	private WebElement Level;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[7]//a[1]")
	private WebElement Divison;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[5]//a[1]")
	private WebElement Department;
	
	@FindBy(xpath ="//div[@class='btn-group bootstrap-select open']//li[3]//a[1]")
	private WebElement Location;
	
	
	@FindBy(xpath ="//textarea[@name='category_description']")
	private WebElement categoryDescription;
	
	@FindBy(xpath="//input[@id='submitbutton']")
	private WebElement saveCategory;
	
	@FindBy(xpath="//div[@class='alert alert-success']/div")
	private WebElement saveSuccessCategory;
	
	@FindBy(xpath="//a[@id='ui-id-2']")
	private WebElement users;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")
	private WebElement Search;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[1]/td[1]")
	private WebElement LearnerVijay;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[2]/td[1]")
	private WebElement LearnerOne;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[3]/td[1]")
	private WebElement LearnerTwo;

	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[4]/td[1]")
	private WebElement LearnerThree;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[5]/td[1]")
	private WebElement LearnerFour;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[6]/td[1]")
	private WebElement LearnerFive;
	
	@FindBy(xpath="(//div[@class='col-sm-12'])[2]/div/table/tbody/tr[7]/td[1]")
	private WebElement LearnerSix;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	private WebElement actionCategory;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Add Users')]")
	private WebElement bulkUsers;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement verifyCourse;
	
	@FindBy(xpath="//a[@id='ui-id-3']") 
	private WebElement clickCourse;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[1]/td[1]")
	private WebElement Maths;

	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[2]/td[1]")
	private WebElement Biology;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[3]/td[1]")
	private WebElement SocialHistory;
	
	@FindBy(xpath="//input[@id='import_csv']") 
	private WebElement ImportCategories;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[4]/td[1]")
	private WebElement Automation;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[5]/td[1]")
	private WebElement Slide;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[6]/td[1]")
	private WebElement Chemistry;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[7]/td[1]")
	private WebElement Technical;
	
	@FindBy(xpath="(//div[@class=\"col-sm-12\"])[4]/div/table/tbody/tr[8]/td[1]")
	private WebElement General;
	
	@FindBy(xpath="//div[@class='dataTables_buttons_courses dataTables_buttons action_btn']//button[@type='button'][contains(text(),'Action')]")
	private WebElement courseActions;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Add Courses')]")
	private WebElement BulkAddCourses;
	
	@FindBy(xpath="//div[@id='tabs-3']//div[@class='alert alert-success']")
	private WebElement courseVerify;
	
	@FindBy(xpath ="//li[contains(text(),'Category Name already exists')]")
	private WebElement CategoryNameAlready;
	
	@FindBy(xpath = "//div[@class='row']//div[2]//button[1]")
	private WebElement ParentCategory;
	
	@FindBy(xpath ="//span[@class='text'][contains(text(),'None')]" )
	private WebElement None;
	
	@FindBy(xpath ="//i[@id='searchBtn']")
	private WebElement SearchLearner;
	
	@FindBy(xpath="(//input[@type=\"search\"])[2]")
	private WebElement SearchCourse;
	

	
	@FindBy(xpath="//button[@id='btnUpload']")
	private WebElement SubmitImport;	
	
	@FindBy(xpath="//button[@class='close btnClose']")
	private WebElement CloseImport;
	
	@FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/a[1]/i[1]")
	private WebElement Edit;
	
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement CourseSearch;
	
	@FindBy(xpath="(//input[@type=\"search\"])[2]")
	private WebElement SearchCo;
	
	@FindBy(xpath="//i[@id='searchBtn']")
	private WebElement SearchCourses;
	
	
	
	@FindBy(xpath="//div[@class='table-responsive table-scroll-datatable']//a[1]")
	private WebElement CategoryMaths;
	
	@FindBy(xpath ="(//div[@id='content']//a[2])[1]")	
	private WebElement Delete;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick']//button[@class='btn dropdown-toggle btn-default']")
	private WebElement Selectcategories;
	
	@FindBy(xpath="//div[contains(@class,'dataTables_customfilter select_filter gobtn')]//li[4]//a[1]")
	private WebElement BusinessStudies;
	
	@FindBy(xpath="//button[@id='button-go']")
	private WebElement Go;
	
	@FindBy(xpath="//button[@id='button-reset']")
	private WebElement Reset;
	
	@FindBy(xpath ="//input[@id='import_csv']")
	private WebElement ChoosefileImport;
	
	public WebElement getReset() {
		return Reset;
	}
	
	public WebElement getGo() {
		return Go;
	}
	
	public WebElement getSelectcategories() {
		return Selectcategories;
	}
	
	public WebElement getSearchCourse() {
		return SearchCourse;
	}
	
	public WebElement getBusinessStudies() {
		return BusinessStudies;
	}
	
	public WebElement getDelete() {
		return Delete;
	}
	public WebElement getCategoryMaths() {
		return CategoryMaths;
	}
	
	public WebElement getCourseSearch() {
		return CourseSearch;
	}
	
	public WebElement getChoosefileImport() {
		return ChoosefileImport;
	}
	
	public WebElement getSearchco() {
		return SearchCo;
	}
	
	public WebElement getSearchCourses() {
		return SearchCourses;
		
	}
		
	
	public WebElement getEdit() {
		return Edit;
	}
	
	public WebElement getSubmitImport() {
		return SubmitImport;
	}
	
	public WebElement getCloseImport() {
		return CloseImport;
	}
	
	public WebElement getParentCategory() {
		return ParentCategory;
	}

	public WebElement getNone() {
		return None;
	}

	public Categories(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getCategoriesAction() {
		return categoriesAction;
	}
	
	public WebElement getImport() {
		return Import;
	}

	public WebElement getCreatecategory() {
		return createcategory;
	}

	public WebElement getCategoryCode() {
		return categoryCode;
	}

	public WebElement getCategoryName() {
		return categoryName;
	}

	public WebElement getCategoryType() {
		return categoryType;
	}

	public WebElement getDesignation() {
		return designation;
	}
	
	public WebElement getBatch() {
		return Batch;
	}
	
	public WebElement getOthers() {
		return Others;
	}
	
	public WebElement getLevel() {
		return Level;
	}
	
	public WebElement getDepartment() {
		return Department;
		
	}
	
	public WebElement getDivision() {
		return Divison;
	}
	
	public WebElement getImportCategories() {
		return ImportCategories;
	}

	public WebElement getLocation() {
		return Location;
	}
	public WebElement getCategoryDescription() {
		return categoryDescription;
	}

	public WebElement getSaveCategory() {
		return saveCategory;
	}

	public WebElement getSaveSuccessCategory() {
		return saveSuccessCategory;
	}

	public WebElement getUsers() {
		return users;
	}

	

	public WebElement getActionCategory() {
		return actionCategory;
	}

	public WebElement getBulkUsers() {
		return bulkUsers;
	}

	public WebElement getVerifyCourse() {
		return verifyCourse;
	}

	public WebElement getClickCourse() {
		return clickCourse;
	}

	public WebElement getmaths() {
		return Maths;
	}

	public WebElement getCourseActions() {
		return courseActions;
	}

	public WebElement getBulkAddCourses() {
		return BulkAddCourses;
	}

	public WebElement getCourseVerify() {
		return courseVerify;
	}
	
	public WebElement getCategoryNameAlready() {
		return CategoryNameAlready;
	}
	
	
	public WebElement getSearch() {
		return Search;
	}
	
	public WebElement getSearchLearner() {
		return SearchLearner;
	}
	public WebElement getLearnerVijay() {
		return LearnerVijay;
		
	}
	
	public WebElement getLearnerOne() {
		return LearnerOne;
		
	}
	
	public WebElement getLearnerTwo() {
		return LearnerTwo;
		
	}
	public WebElement getLearnerThree() {
		return LearnerThree;
		
	}
	
	public WebElement getLearnerFour() {
		return LearnerFour;
		
	}
	public WebElement getLearnerFive() {
		return LearnerFive;
		
	}
	public WebElement getLearnerSix() {
		return LearnerSix;
		
	}
	
	public WebElement getAutomation() {
		return Automation;
		
	}
	
	public WebElement getBiology() {
		return Biology;
		
	}
	public WebElement getTechnical() {
		return Technical;
		
	}
	public WebElement getGeneral(){
		return General;
		
	}
	public WebElement getSlide() {
		return Slide;
		
	}
	
	public WebElement getChemistry() {
		return Chemistry;
		
	}
}
