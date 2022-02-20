package Web_Common_Function_Assignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFrame {

	/*
	 * purpose: This method will switch To Frame
	 * param: WebDriver,WebElement
	 * return: void
	 */
	
	public static void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/*
	 * purpose: This method will switch To Frame by Id or Name
	 * param: WebDriver,WebElement
	 * return: void
	 */
	
	public static void switchToFrame_ID(WebDriver driver, String Id) {
		driver.switchTo().frame(Id);
	}
	
	/*
	 * purpose: This method will switch To Frame by Index
	 * param: WebDriver,WebElement
	 * return: void
	 */
	
	public static void switchToFrame_Index(WebDriver driver, Integer index) {
		driver.switchTo().frame(index);
	}
	
	/*
	 * purpose: This method will switch To parent frame
	 * param: WebDriver,WebElement
	 * return: void
	 */
	
	public static void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	/*
	 * purpose: This method will switch To parent frame
	 * param: WebDriver,WebElement
	 * return: void
	 */
	
	public static void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	/*
	 * purpose: This method will return number Of Frames
	 * param: WebDriver,WebElement
	 * return: void
	 */
	
	public static int numberOfFrames(WebDriver driver,List<WebElement> iframes ) {
		 int framesize = iframes.size();
		 return framesize;
	}
	

}
