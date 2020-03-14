package object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclassautomation {

	public static WebDriver driver;
	public String browser = "chrome";
	
	 public baseclassautomation() {
		
		 if(driver==null){
			 if(browser.equals("chrome")){
				 System.setProperty("webdriver.chrome.driver", "D:\\testing\\chrome\\chromedriver.exe");
				 driver= new ChromeDriver();
			 }
			 else if(browser.equals("firefox")){
				 System.setProperty("webdriver.gecko.driver", "D:\\testing\\chrome\\chromedriver.exe");
				 driver= new ChromeDriver();
			 }
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get("http://automationpractice.com/index.php");
			 
			 
		 }
		 

		 
	}
	
	 public void navigateback(){
		 driver.navigate().back();
	 }
	 
	 public String gettitle(){
		 return driver.getTitle();
	 }
	 
	 public String getattribute(WebElement element){
		 return element.getAttribute("value");
	 }
	 
	 public String gettext(WebElement element){
		 return element.getText();
	 }
	 
	 
}
