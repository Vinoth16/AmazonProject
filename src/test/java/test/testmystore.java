package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.objectmystore;

public class testmystore {

	objectmystore ms = new objectmystore();
	
	
	//1st test
	@Test
	public void womentabs(){
		Assert.assertTrue(ms.women().isDisplayed());
		System.out.println(ms.women().getText());
	}
	@Test
	public void dresstabs(){
		Assert.assertTrue(ms.dress().isDisplayed());
	
	}
	@Test
	public void tshirts(){
		Assert.assertTrue(ms.tshirts().isDisplayed());
	}
	
	
	
	
	
	//2nd test
	
	
	
	@Test
	public void navigatetabs(){
		ms.women().click();
		System.out.println(ms.gettitle());
		Assert.assertTrue(ms.gettitle().contains("Women"));
		ms.navigateback();
		ms.dress().click();
		Assert.assertTrue(ms.gettitle().contains("Dresses"));
		ms.navigateback();
		ms.tshirts().click();
		Assert.assertTrue(ms.gettitle().contains("T-shirts"));
		ms.navigateback();
	}
	
	//3rd test
	
	@Test
	public void newsletter(){
		ms.newsletter().sendKeys("sha.vinoth99@gmail.com");
		ms.btn().click();
		Assert.assertTrue(ms.getattribute(ms.newsletter()).contains("You have successfully subscribed to this newsletter."));
		
		
		
		
	}
	
	
	
}
