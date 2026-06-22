package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {
	
	@Test
	
	public void a()
	{
		WebDriverManager.chromedriver()	.setup();	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    //Webdrivv manager. dependency gone and upgraded vers. of Java
        driver.get("https://paytm.com");
	    
	}

}
