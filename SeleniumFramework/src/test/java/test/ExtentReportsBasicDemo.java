package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	static WebDriver driver=null;
 public static void main(String[] args) throws InterruptedException {
	 ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");
	 ExtentReports extent = new ExtentReports();
     extent.attachReporter(htmlReporter);
     ExtentTest test1 = extent.createTest("google search test one", "this is a test to validate google search test one functionality");
     String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test1.log(Status.INFO, "starting testcase");
		
		driver.get("https://google.com");
		test1.pass("navigated to google search");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("entered text in search box");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);														//	explicitwait					
		WebElement textelement=wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));			
		try{
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		}catch(NoSuchElementException e){
			System.out.println("handled exception");
		}
		Thread.sleep(5000);
		test1.pass("pressed the enter key");
		driver.close();
		driver.quit();
		test1.pass("close the browser");
		test1.info("test completed");
		extent.flush();
		
}
}
