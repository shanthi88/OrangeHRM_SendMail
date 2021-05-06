package pkg_orange_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Hdfc_Login_masking{
	ChromeDriver driver = null;
	@Test
	public void login_Successful(){
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		
		driver.findElementByXPath("//input[@name='fldLoginUserId']").sendKeys("1000");
		driver.findElementByXPath("//table[@class='lForm']//img").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElementByLinkText("Terms and Conditions").click();
		try {
		    Thread.sleep(10*1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
	}

	@BeforeTest
	public void launchBrowser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterTest	
	public void closeBrowser(){
	driver.quit();
	}
}
