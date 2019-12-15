import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
 public static void main(String[] args) {
	 String projectpath=System.getProperty("user.dir");
	// System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\FirefoxDriver\\geckodriver.exe");
	// WebDriver driver=new FirefoxDriver();
	// System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\ChromeDriver\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
	 System.setProperty("webdriver.ie.driver",projectpath+"\\drivers\\IntenetExplorer\\IEDriverServer.exe");
	 WebDriver driver=new InternetExplorerDriver();
	 
		driver.get("https://selenium.dev/");
		driver.close();
//		driver.quit();
	
}
}