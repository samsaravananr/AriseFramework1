package com.ind.arise.AriseFramework1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonTitleTest extends Base
{
	
	
	
	@Test
	public void TS002() throws Exception
	{
		myD=BrowserCall();
		myD.get(properties.getProperty("URL"));
		Assert.assertEquals(myD.getTitle(),properties.getProperty("HomePageTitle"));
		
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.close();
	}
	

}
