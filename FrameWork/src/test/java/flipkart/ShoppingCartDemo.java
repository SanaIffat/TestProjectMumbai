package flipkart;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingCartDemo {
	
//WebDriver drive;
	
	
	/*This code is working properly if we Use Thread.sleep at every instance
	 but not working if applying implicit wait*/
	
	@Test
	public void addingItemToCart() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumTools\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		//drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drive.get("https://www.flipkart.com/");
		drive.manage().window().maximize();
		//drive.navigate().to(url);
	
		drive.findElement(By.xpath("//div[@class='_1XBjg- row']/div/div/form/div //input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8208458869");
		drive.findElement(By.xpath("//div[@class='_1XBjg- row']/div/div/form/div //input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("sanawit30");
		drive.findElement(By.xpath("//div[@class='_1XBjg- row']/div/div/form/div //button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	    Thread.sleep(4000L);
		//Here I was trying to find dynamically suggested for you items 
		//drive.findElement(By.xpath("//div[@class='_1CzqlW'] //div[@class='_3liAhj _2Vsm67'] //a[@title='Wonderchef Kadhai 24 cm']")).click();
		//drive.findElement(By.cssSelector("div[class='_1CzqlW'] div a[title='Wonderchef Kadhai 24 cm']")).click();
		
		//Searching Item through Search Box
		drive.findElement(By.cssSelector(".LM6RPg")).sendKeys("Egg boiler");
		WebElement searchbtn = drive.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		Actions a=new Actions(drive);
		a.moveToElement(searchbtn).click().build().perform();
		System.out.println(drive.getTitle());
		//Clicking on first displayed Item
		Thread.sleep(3000L);
		drive.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
		
		//Switching To Window
		Set<String> id= drive.getWindowHandles();
		Iterator <String> it=id.iterator();
		
		String parent=it.next();
		String child=it.next();
		drive.switchTo().window(child);
		Thread.sleep(4000L);
		System.out.println(drive.getTitle());
		drive.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		drive.quit();
		
	}
	
	

}
