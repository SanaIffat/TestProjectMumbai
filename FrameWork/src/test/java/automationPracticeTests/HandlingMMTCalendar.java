package automationPracticeTests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMMTCalendar {
	public static void selectDate(WebElement calendar, String year, String monthName, String day, WebDriver driver) throws ParseException
	{
		//Clicking on calendar to open calendar widget
		calendar.click();
		
		// Retrieving current year value
		String currentYear= driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]/div[1]/span")).getText();

		// Click on Next arrow till we get desired year
		if(!currentYear.equals(year))
		{
			do{
				driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
			}while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]/div[1]/span")).getText().equals(year));
			
		}
		
		// Select desired month after selecting desired year
		
		String currentMonth= driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]/div[1]")).getText();
		if(!currentMonth.equalsIgnoreCase(monthName))
		{
			do{
				driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
			}while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]/div[1]")).getText().trim().equalsIgnoreCase(monthName));
			
		}
		//get java month number for desired month
		
		int javaMonthInt= HandlingMMTCalendar.getMonthJavaInt(monthName);
		
		// Find dates of desired month only
		
		List<WebElement> allDateOfDesiredMonth= driver.findElements(By.xpath("//div[@class='dateInnerCell'  and @DayPicker-Months="+javaMonthInt+"']"  ));
		for(WebElement d:allDateOfDesiredMonth )
		{
			if(d.getText().trim().equals(day))
			{
				d.click();
				break;
			}
		}
		
		
		
	}
	
	// Code to get java month number
	public static int getMonthJavaInt(String monthName) throws ParseException 
	{

		Date date = new SimpleDateFormat("MMMM").parse(monthName);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH);
	}
	
	public static void main(String[] args) throws ParseException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumTools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		// Locating departure date calendar
		WebElement departCal= driver.findElement(By.id("hp-widget__depart"));
		HandlingMMTCalendar.selectDate(departCal, "2017", "September", "22", driver);
		
		
		
		
		

	}

}
