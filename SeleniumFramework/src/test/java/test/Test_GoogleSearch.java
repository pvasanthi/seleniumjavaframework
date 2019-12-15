package test;

import java.awt.dnd.DragGestureEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_GoogleSearch {

	public static void main(String[] args) {
		googlesearch();

	}
	public static void googlesearch(){ 
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		WebDriverWait wait=new WebDriverWait(driver, 20);														//	explicitwait					
		WebElement textelement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("btnK")));			
		
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("done");
	}

}
