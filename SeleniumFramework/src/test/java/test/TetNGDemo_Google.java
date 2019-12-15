package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TetNGDemo_Google {
	  WebDriver driver=null;
	
@BeforeTest
public void setupTest(){
	String projectpath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
	 driver=new ChromeDriver();
}

@Test
public  void googlesearch(){ 
	driver.get("https://google.com");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
	WebDriverWait wait=new WebDriverWait(driver, 20);														//	explicitwait					
	WebElement textelement=wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));			
	
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	}
@AfterTest
public void teardownTest(){
	driver.close();
	driver.quit();
	System.out.println("done");

}
}

