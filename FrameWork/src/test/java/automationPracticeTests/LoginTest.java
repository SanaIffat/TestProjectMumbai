package automationPracticeTests;



import org.testng.annotations.Test;

import pageObjects.Login;
import resources.Base;

public class LoginTest extends Base {

	/* Login Test Case Scenario to practice
	 * 1.If you click on login it asks for option of login with email
	 * 2.And there are two buttons facebook login and Google(gmail) login
	 * 3.If you click Either of Button you are redirected to the Google and Facebook form Page
	 * 4.Need to learn and understand and Automate this scenarios
	 */
	
	@Test
	public void loginTest() throws InterruptedException
	{
		drive=callInit();
		drive.get("https://www.makemytrip.com/");
		Login l=new Login(drive);
		System.out.println(l.getLogin().isEnabled());
		Thread.sleep(3000L);
		l.getLogin().click();
		Thread.sleep(3000L);
		l.getgoogleLog().click();
				
	}
	
	
}
