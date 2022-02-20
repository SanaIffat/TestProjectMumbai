package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	
	public WebDriver drive;
	
	
   public WebDriver callInit() 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\SeleniumTools\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		return drive;
   }

}
