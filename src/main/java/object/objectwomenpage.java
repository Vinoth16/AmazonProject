package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectwomenpage extends baseclassautomation {

	public objectwomenpage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
	WebElement 	sizeS;
	
	public WebElement sizeS(){
		return sizeS;
	}
	
	
	@FindBy(xpath= "//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	WebElement 	sizeM;
	
	public WebElement sizeM(){
		return sizeM;
	}
	
	
	@FindBy(xpath= "//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
	WebElement 	sizeL;
	
	public WebElement sizeL(){
		return sizeL;
	}
	
	
}
