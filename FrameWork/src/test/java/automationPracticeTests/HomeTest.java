package automationPracticeTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomeTest extends Base
    
{
   

	@Test
	public void loadHomePage()
	{
		drive=callInit();
		drive.get("https://www.makemytrip.com/");
		System.out.println(drive.getTitle());
		LandingPage lp=new LandingPage(drive);
		lp.getFlights().click();
		lp.getHotels().click();
		lp.getVillas().click();
		lp.getHolidays().click();
		lp.getTrains().click();
		lp.getBuses().click();
		lp.getVisa().click();
		lp.getCabs().click();
		lp.getCharter().click();
	}

	
	
    
}
