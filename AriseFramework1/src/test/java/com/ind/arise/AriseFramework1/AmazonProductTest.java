package com.ind.arise.AriseFramework1;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonProductTest extends Base 
{
	
	@Test
	public void TS001() throws IOException
	{
		myD=BrowserCall();
		myD.get(properties.getProperty("URL"));
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AmazonHomePage home=new AmazonHomePage(myD);
		
		home.AmazonSearchTextBox().sendKeys("Samsung S21 Ultra");
		home.AmazonSearchButton().click();
		
		System.out.println(myD.getTitle());
	
		
	}

	@AfterTest
	public void tearDown()
	{
		myD.close();
	}
	
}
