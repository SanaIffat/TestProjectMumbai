package Web_Common_Function_Assignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebSynchronization {
	
	
	public static void isElementPresent(WebDriver driver){
		
	}
	
	/*
	 * purpose:This method checks that an element,
	 * is present on the DOM of a page, is visible. 
	 * Visibility means that the element is not only 
	 * displayed but also has a height and width 
	 * that is greater than 0.
	 * param:  WebDriver,WebElement
	 * return: WebElement
	 */
	public static WebElement isElementPresent(WebDriver driver,WebElement ele){
		WebElement elem = null;
		WebDriverWait w=new WebDriverWait(driver,10);
		elem= w.until(ExpectedConditions.visibilityOf(ele));
		return elem;
		
	}
	
	
	
	
	
	/*
	 * purpose:This method checks that an element,
	 * is visible and enabled such that you can click it.
	 * param:  WebElement
	 * return: WebElement
	 */
	public static WebElement isElementClickable(WebDriver driver,WebElement ele){

		WebElement elem = null;
		WebDriverWait wait= new WebDriverWait(driver,20);
		elem=wait.until(ExpectedConditions.elementToBeClickable(ele));
		return elem;
	}
	
	
	
	
	
	public static void isElementClickable(WebDriver driver){
		
	}
	/*
	 * purpose:This method will wait until element is Visible
	 * param: WebElement, WebDriver
	 * return:void
	 */
	public static void isElementVisible(WebDriver driver, WebElement element){
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		
	}
	
}
