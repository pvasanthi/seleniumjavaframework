package test;
import java.awt.dnd.DragGestureEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchpage;

public class GoogleSearchpages {
private	static WebDriver driver=null;
	public static void main(String[] args) {
		googlesearch();

	}
	public static void googlesearch(){ 
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		
		//GoogleSearchpage.textbox_search(driver).sendKeys("Automation step by step");
		WebDriverWait wait=new WebDriverWait(driver, 20);														//	explicitwait					
		WebElement textelement=wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));			
		
		driver.findElement(By.xpath("//*[@name='btnK']")).click();
		driver.findElement(By.xpath("//*[@name='btnK']")).sendKeys(Keys.RETURN);
	//	GoogleSearchpage.button_clicking(driver).sendKeys(Keys.RETURN);
		
		
		driver.close();
		System.out.println("done");
	}

}


