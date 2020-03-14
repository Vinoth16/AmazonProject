package object;

import java.awt.print.Pageable;
import java.security.PublicKey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectmystore extends baseclassautomation {
	
	public objectmystore() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath= "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women;
	
	public WebElement women(){
		return women;
	}
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement dress;
	
	public WebElement dress(){
		return dress;
	}
	
   @FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
   WebElement tshirts;

   public WebElement tshirts(){
	   return tshirts;
   }

   @FindBy(xpath="//*[@id='newsletter-input']")
   WebElement newsletter;

   public WebElement newsletter(){
	   return newsletter;
   }
	
   @FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
   WebElement btn;

   public WebElement btn(){
	   return btn;
   }
	
	
}
