package pkg_orange_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login_Before_and_After{
	WebDriver driver = null;
	@Test
	public void login_Successful(){
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		try {
		    Thread.sleep(10*1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//fail("Not yet implemented");
	}

	@BeforeTest
	public void launchBrowser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@AfterTest	
	public void closeBrowser(){
	driver.quit();
	}
}
