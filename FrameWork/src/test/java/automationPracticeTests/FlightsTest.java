package automationPracticeTests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.FlightsWebElements;
import resources.Base;

public class FlightsTest extends Base {

	/*
	@Test
	public void FlightsBooking() throws InterruptedException
	{
		drive=callInit();
		drive.get("https://www.makemytrip.com/");
	
		FlightsWebElements fw=new FlightsWebElements(drive);
		Thread.sleep(3000L);
		fw.getFrom().click();
		Thread.sleep(4000L);
		fw.getInputBox1().sendKeys("Aur");
		Thread.sleep(4000L);
		fw.getIXU().click();
		fw.getInputBox2().sendKeys("Jed");
		fw.getJED().click();
		Thread.sleep(2000L);
		System.out.println(fw.getMonth1().getText());
	}
	*/
	@Test
	public void calenderTest() {
		drive=callInit();
		drive.get("https://www.makemytrip.com/");
		drive.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FlightsWebElements fw=new FlightsWebElements(drive);
		fw.getDepartureCalender().click();
		System.out.println(fw.getMonth1().getText());
	}
	

}
