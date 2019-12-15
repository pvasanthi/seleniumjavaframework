package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpageObjects {
	WebDriver driver=null;
	By googletextbox_Search=By.name("q");
 	By googlebutton_clicking=By.name("btnK");
 	public GoogleSearchpageObjects(WebDriver driver){
 		this.driver=driver;
 }
 	public void enterText(String text){
 		driver.findElement(googletextbox_Search).sendKeys(text);
 		
 	}
 	public void click_button(){
 		driver.findElement(googlebutton_clicking).sendKeys(Keys.RETURN);
 	}
}
