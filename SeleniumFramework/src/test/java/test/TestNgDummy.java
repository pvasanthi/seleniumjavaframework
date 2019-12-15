package test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNgDummy {
	public static String browserName=null;
	  WebDriver driver=null;
		
	  @BeforeTest
	  public void setupTest(){
		  String projectpath=System.getProperty("user.dir");
		  PropertiesFile.getproperties();
		  if(browserName.equalsIgnoreCase("chrome")){
			  System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
			  	 driver=new ChromeDriver();
  
		  }else if (browserName.equalsIgnoreCase("firefox")){
			  
				  System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\FirefoxDriver\\geckodriver.exe");
				  	 driver=new FirefoxDriver();
	  
		  }
	  	}

	  @Test
	  public  void googlesearch2(){ 
	  	driver.get("https://google.com");
	  	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
	  	WebDriverWait wait=new WebDriverWait(driver, 20);														//	explicitwait					
	  	WebElement textelement=wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));			
	  	try{
	  	driver.findElement(By.name("btnK")).click();
	  	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	  	
	  	}catch(Exception e){
	  		System.out.println("exception handled");
	  	}}
/*	  @Test
	  public  void googlesearch3(){ 
	  	driver.get("https://google.com");
	  	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
	  	WebDriverWait wait=new WebDriverWait(driver, 20);														//	explicitwait					
	  	WebElement textelement=wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));			
	  	
	  	driver.findElement(By.name("btnK")).click();
	  	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	  	
	  	}
*/	  
	  @AfterTest
	  public void teardownTest(){
	  	driver.close();
	  	driver.quit();
	  	System.out.println("done");

	  }

}
