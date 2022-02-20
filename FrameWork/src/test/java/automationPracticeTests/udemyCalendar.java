package automationPracticeTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class udemyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumTools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();	
		WebElement frame=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		//clicking On Calendar WebElement
		driver.findElementById("datepicker").click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement year=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-year']"))));
		WebElement month=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']"))));
		WebElement nextButton=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@data-handler='next']/span"))));
		
	/*	if(!month.getText().equalsIgnoreCase("2021") )
		{
			do{	
				nextButton.click();
			  }while(!month.getText().equalsIgnoreCase("2021"));
			
		}
		
		
		/*
		
 	  while(!wait.until(ExpectedConditions.visibilityOf(month)).getText().equalsIgnoreCase("December"))
			{
			 wait.until(ExpectedConditions.visibilityOf(nextButton)).click();
			} */
		List<WebElement> dates= driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		//Grab common attribute//Put into list and iterate
		
		
		for(WebElement d:dates )
		{
			if(d.getText().equals("12"))
			{
				d.click();
				break;
				
			}
		}
		
		

		/*for(int i=0;i<count;i++)
		{
			
		String text=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
		break;
		}

		} */
	}

}


