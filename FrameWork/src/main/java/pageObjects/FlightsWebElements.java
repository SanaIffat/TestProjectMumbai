package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsWebElements {
	
	WebDriver drive;
	public FlightsWebElements(WebDriver drive) {
		this.drive=drive;
	}
	 By from=By.id("fromCity");
	 By inputbox1=By.xpath("//input[@placeholder='From']");
	 By inputbox2=By.xpath("//input[@placeholder='To']");
	 By IXU=By.xpath("//div[@id='react-autowhatever-1']/div[1]/ul/li/div/div[1]/p[1]");
	 By JED=By.xpath("//div[@role='listbox']/div[1]/ul/li/div/div[1]/p[1]");
	 By Month1=By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]");
     By DepartureCalender=By.xpath("//label[@for='departure']");
     public WebElement getDepartureCalender()
		{
			return drive.findElement(DepartureCalender);
		}	
     
     
     public WebElement getFrom()
		{
			return drive.findElement(from);
		}
		public WebElement getIXU()
		{
			return drive.findElement(IXU);
		}
		public WebElement getJED()
		{
			return drive.findElement(JED);
		}
		public WebElement getInputBox1()
		{
			return drive.findElement(inputbox1);
		}
		public WebElement getInputBox2()
		{
			return drive.findElement(inputbox2);
		}
		public WebElement getMonth1()
		{
			return drive.findElement(Month1);
		}
		

}
