package com.ind.arise.AriseFramework1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	
	public WebDriver myD;
	public Properties properties;
	public String vBrowser;
	
	public WebDriver BrowserCall() throws IOException
	{
		
		properties=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SARAVANAN R\\Mobile1\\AriseFramework1\\data.properties");
		properties.load(fis);
		vBrowser=properties.getProperty("Browser");
	
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
			myD=new ChromeDriver();

		}
		
		else if (vBrowser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\ArisGlobal\\geckodriver.exe");
			myD=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser");
		}
		return myD;
		
	}
	

}
