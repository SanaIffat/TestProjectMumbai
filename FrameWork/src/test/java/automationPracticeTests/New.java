package automationPracticeTests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New {
	/*@Test
	public void One()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumTools\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		drive.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(drive.getTitle());
		drive.findElement(By.id("checkBoxOption3")).click();
		
		WebElement chkbox=drive.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]"));
		WebElement drpDown=drive.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		WebElement txtBox = drive.findElement(By.xpath("//input[@id='name']"));
		WebElement alert= drive.findElement(By.xpath("//input[@id='alertbtn']"));
		String reuse=chkbox.getText();
		System.out.println("Name of CheckBox is :" +reuse);
		Select s=new Select(drpDown);
		s.selectByVisibleText(reuse);
		txtBox.sendKeys(reuse);
		alert.click();
		String alertText=drive.switchTo().alert().getText();
		if(alertText.contains(reuse))
		{
			drive.switchTo().alert().accept();
		}
			
	}*/

}
