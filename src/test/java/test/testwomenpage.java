package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.objectmystore;
import object.objectwomenpage;

public class testwomenpage {

	objectmystore ms = new objectmystore();
	objectwomenpage wp= new objectwomenpage();
	
	
	
	@Test
	public void verifysize(){
		ms.women().click();
		Assert.assertTrue(wp.sizeS().isDisplayed());
		System.out.println(wp.gettext(wp.sizeS()));
		Assert.assertTrue(wp.sizeM().isDisplayed());
		Assert.assertTrue(wp.sizeL().isDisplayed());
	}
	
	
	
}
