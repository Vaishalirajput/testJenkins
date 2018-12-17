package webAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://nhtesting.mphrx.com";
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	    WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("+915758585866");
		
		WebElement password = driver.findElement(By.id("userPassword"));
		password.sendKeys("test");	
		
		wrappera elementi = new wrappera();
		wrappera.click(driver, By.id("loginButton"));
		/* WebElement doci = driver.findElement(By.linkText("Documents"));
		doci.click();
		
		WebElement poci = driver.findElement(By.id("uploadedD_uploadBtn1"));
		poci.click();
		*/
		//WebElement roci = driver.findElement(By.id("uploadMR_fr_uploadFileBtn")).sendKeys("");
		
		
	}
	


}


