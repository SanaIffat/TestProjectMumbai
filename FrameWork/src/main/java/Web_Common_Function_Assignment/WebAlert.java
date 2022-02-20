package Web_Common_Function_Assignment;

import org.openqa.selenium.WebDriver;

public class WebAlert {
	/*
	 * purpose: This method will dismiss alert
	 * param: WebDriver
	 * return: void
	 */
	
	public static void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/*
	 * purpose:This method will accept alert
	 * param: WebDriver
	 * return: void
	 */
	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/*
	 * purpose:This method will get Text Of Alert
	 * param: WebDriver
	 * return: String
	 */
	public static String getTextOfAlert(WebDriver driver) {
		String alertText=driver.switchTo().alert().getText();
		return alertText;
	}
	/*
	 * purpose:This method will send Input To  Alert
	 * param: WebDriver, String to input in alert
	 * return: void
	 */
	public static void sendInputToAlert(WebDriver driver, String input) {
		driver.switchTo().alert().sendKeys(input);
		
	}
}
