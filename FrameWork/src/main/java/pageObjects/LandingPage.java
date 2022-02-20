package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver drive;
	public LandingPage(WebDriver drive) {
		this.drive=drive;
	}
	
	
	By flights=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[1]");
	By hotels=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[2]");
	By villas=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[3]");
	By holidays=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[4]");
	By trains=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[5]");
	By buses=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[6]");
	By visa=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[7]");
	By cabs=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[8]");
	By charter=By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[9]");
	
	
	public WebElement getFlights()
	{
		return drive.findElement(flights);
	}
	public WebElement getHotels()
	{
		return drive.findElement(hotels);
	}
	
	public WebElement getVillas()
	{
		return drive.findElement(villas);
	}
	public WebElement getHolidays()
	{
		return drive.findElement(holidays);
	}
	public WebElement getTrains()
	{
		return drive.findElement(trains);
	}
	public WebElement getBuses()
	{
		return drive.findElement(buses);
	}
	public WebElement getVisa()
	{
		return drive.findElement(visa);
	}
	public WebElement getCabs()
	{
		return drive.findElement(cabs);
	}
	
	public WebElement getCharter()
	{
		return drive.findElement(charter);
	}
	
	
	
	
	
}
