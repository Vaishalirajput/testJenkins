package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testt {

	//public static void main(String[] args)
	
    @Test
	public void retret()
	{
  		System.setProperty("webdriver.chrome.driver","C:/Users/Vaishali_Rajput/AppData/Roaming/npm/node_modules/chromedriver/lib/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://webqa1.mphrx.com";
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	    WebElement username = driver.findElement(By.id("lgnC_m_UncV"));
		username.sendKeys("sys_admin");
		
		WebElement password = driver.findElement(By.id("lgnC_m_PcV"));
		password.sendKeys("Test@123");
		
		WebElement logInButton = driver.findElement(By.id("lgnC_m_loginBtn"));
		logInButton.click();	
		Assert.assertEquals(true, true);
		
	}

}


