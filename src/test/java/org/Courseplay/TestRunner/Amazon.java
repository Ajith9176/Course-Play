package org.Courseplay.TestRunner;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.Courseplay.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Amazon extends BaseClass {
	
	public static WebDriver driver;
	
	public static WebElement element;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resource\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		WebElement webElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		WebDriverWait wb = new WebDriverWait(driver, 50);
		wb.until(ExpectedConditions.visibilityOf(webElement));
		
		webElement.sendKeys("Realme Mobiles");
		
		Thread.sleep(1000);
		
		
		WebElement clickElement = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		wb.until(ExpectedConditions.visibilityOf(clickElement));
		
		
		clickElement.click();
		
		
		Thread.sleep(1000);
		
		//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]
		
		WebElement getText = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]"));
		String text = getText.getText();
		
		System.out.println(text);
		
		
		List<WebElement> size = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int s = size.size();
		
		System.out.println(s);
		
		
		for (int i = 1; i<=s; i++) {
			
			String t = "(//span[@class='a-size-medium a-color-base a-text-normal'])["+i+"]";
			
			WebElement st = driver.findElement(By.xpath(t));
			String tex = st.getText();
			
			System.out.println(tex);
			
		}
		
		
		driver.quit();

		
		
		
		
		
		

		
		
	}
	
	

}
