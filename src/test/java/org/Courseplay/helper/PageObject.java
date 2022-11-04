package org.Courseplay.helper;

import org.openqa.selenium.WebDriver;

import org.Courseplay.pom.SkillsPage;
import org.Courseplay.pom.SlideShow;
import org.Courseplay.pom.Text;
import org.Courseplay.pom.CourseAuthoring;
import org.Courseplay.pom.Event;
import org.Courseplay.pom.Image;
import org.Courseplay.pom.LearnerLogin;
import org.Courseplay.pom.SignOut;
import org.Courseplay.pom.Users;
import org.Courseplay.pom.Video;
import org.Courseplay.pom.Webcontent;
import org.Courseplay.pom.Webinar;
import org.Courseplay.pom.Assignment;
import org.Courseplay.pom.Categories;
import org.Courseplay.pom.LoginPage;
import org.Courseplay.pom.Quiz;
import org.Courseplay.pom.ScormModule;



public class PageObject {
	

	public WebDriver driver;
	
	private LoginPage lp;
	private Categories cg;
	private SignOut so;
	private Users us;
	private ScormModule sm;
	private CourseAuthoring ca;
	private LearnerLogin ll;
	private SkillsPage sp;
	private Assignment Am;
	private SlideShow SS;
	private Event Ev;
	private Quiz Qz;
	private Text tx;
	private Video vi;
	private Webcontent co;
	private Image im;
	private Webinar we;
	
	
	
	
	public PageObject(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	
	public LoginPage getLoginPage() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	public Categories getCategories() {
		if (cg == null) {
			cg = new Categories(driver);
		}
		return cg;
	
	}
	
	public Users getUsers() {
		if (us == null) {
			us = new Users(driver);
		}
		return us;
	
	}
	public SignOut getSignOut() {
		if (so == null) {
			so = new SignOut(driver);
		}
		return so;
	
	}
	public ScormModule getScormModule() {
		if (sm == null) {
			sm = new ScormModule(driver);
		}
		return sm;
	
	}
	public CourseAuthoring getCourseAuthoring() {
		if (ca == null) {
			ca = new CourseAuthoring(driver);
		}
		return ca;
	
	}
	public LearnerLogin getLearnerLogin() {
		if (ll == null) {
			ll = new LearnerLogin(driver);
		}
		return ll;
	
	}
	
	public SkillsPage getSkillsPage() {
		if (sp == null) {
			sp = new SkillsPage(driver);
		}
		return sp;
	
	}
	
	public Assignment getAssignment() {
		if (Am == null) {
			Am = new Assignment(driver);
		}
		return Am;
	
	}
	
	public SlideShow getSlideShow() {
		if (SS == null) {
			SS = new SlideShow(driver);
		}
		return SS;
	
	}
	
	public Event getEvent() {
		if (Ev == null) {
			Ev = new Event(driver);
			
		}
		return Ev;
	}
	
	public Quiz getQuiz() {
		if (Qz == null) {
			Qz = new Quiz(driver);
			
		}
		return Qz;
	}

	public Text getText() {
		if (tx == null) {
			tx = new Text(driver);
			
		}
		return tx;
	}
	
	public Video getVideo() {
		if (vi == null) {
			vi = new Video(driver);
		}
		return vi;
	
	}
	
	public Webcontent getWebcontent() {
		if (co == null) {
			co = new Webcontent(driver);
		}
		return co;
	
	}
	
	public Image getImage() {
		if (im == null) {
			im = new Image(driver);
		}
		return im;
	
	}
	
	public Webinar getWebinar() {
		if (we == null) {
			we = new Webinar(driver);
		}
		return we;
	
	}
	

	
	

	}


