package com.ind.arise.AriseFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage 
{
	public WebDriver myD;

	public AmazonHomePage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}

	By ProductSearchBox=By.id("twotabsearchtextbox");
	By ProductSearchButton=By.id("nav-search-submit-button");
	
	public WebElement AmazonSearchTextBox()
	{
		return myD.findElement(ProductSearchBox);
		
	}
	
	public WebElement AmazonSearchButton()
	{
		return myD.findElement(ProductSearchButton);
	}
	
	
	
	
	

}
