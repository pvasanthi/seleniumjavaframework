package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgMultiBrowserDemo {
	WebDriver driver=null;
	String projectpath=System.getProperty("user.dir");
@Parameters("browserName")	
@BeforeTest
public void setUp(String browserName){
	System.out.println(browserName);
	if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\FirefoxDriver\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver",projectpath+"\\drivers\\IntenetExplorer\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
	}
}
@Test
public void test1() throws InterruptedException{
	driver.get("https://google.com");
	Thread.sleep(4000);
}
@AfterTest
public void tearDown(){
driver.close();
System.out.println("done");
}
}
