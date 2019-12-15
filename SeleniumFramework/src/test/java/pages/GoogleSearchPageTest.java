package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchpageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchTest();

	}
	public static void googleSearchTest(){
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		GoogleSearchpageObjects Search=new GoogleSearchpageObjects(driver);
		driver.get("https://google.com");
		Search.enterText("A B C D");
		Search.click_button();
		driver.close();
		
	}
}
