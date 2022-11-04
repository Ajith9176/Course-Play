package org.Courseplay.TestRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.Courseplay.baseclass.BaseClass;
import org.Courseplay.helper.DataDriven;
import org.Courseplay.reports.DateAndTime;
import org.Courseplay.reports.JSONExpression;
import org.joda.time.LocalTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\Courseplay\\Feature", 
glue = "org.Courseplay.StepDefinition",
tags = {"@Url,@TC-001_logindashboardAdmin,@TC-001_Users,@TC-002_Signout"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports\\report.html",	"pretty",
		"html:src\\test\\resource\\Library" , "json:src\\test\\resource\\Library\\cucumber.json","junit:src\\test\\resource\\Library\\cucumber.xml"},monochrome=true,strict=true) 
public class CoursePlayTest {

	public static WebDriver driver;
	

	@BeforeClass
	public static void setUp() throws Throwable {
			String configDatas = DataDriven.getConfigDatas("AppBrowser");
			driver = BaseClass.browerLaunch(configDatas);
			
	}
	

	@AfterClass
	public static void tearDown() throws Throwable {
		driver.quit();
		
		

	}


}
