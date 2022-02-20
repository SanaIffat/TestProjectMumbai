package Web_Common_Function_Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebElementCommon {
	/*
	 * purpose: This method will return true if element is present in DOM
	 * param: WebElement
	 * return: boolean
	 */
	public  WebDriver driver;
	public  WebElementCommon(WebDriver driver) {
		this.driver=driver;
	}
	public static boolean isPresent(WebElement element,WebDriver driver){
		boolean isPre = false;
		if(WebSynchronization.isElementPresent(driver,element)!=null){
			if(element.isDisplayed()){
				isPre = true;
			}
		}
		return isPre;
	}
	/*
	 * purpose: This method will return true if element is clickable in DOM
	 * param: WebElement
	 * return: boolean
	 */
	
	public static boolean isClickable(WebElement element,WebDriver driver){
		boolean isClick = false;
		if(isPresent(element,driver)){
			if(element.isEnabled()){
				isClick = true;
			}
		}
		return isClick;
	}
	
	/*
	 * purpose: This method will return Attribute Name
	 * param: WebElement
	 * return: String
	 */
	public static String getAttribute(WebElement element,String attributeName){
		return element.getAttribute(attributeName);
	}
	/*
	 * purpose:This method will get Dimension of element
	 * param: WebElement
	 * return:void
	 */
	public static Dimension buttonSize(WebElement element) {
		return element.getSize();
		
	}
	/*
	 * purpose:This method will get Background Color of element
	 * param: WebElement
	 * return:void
	 */
	public static String backckgroundColor(WebElement element) {
		return element.getCssValue("background-color");
		
	}
	/*
	 * purpose:This method will get Background Color WebElement
	 * param: WebElement
	 * return:void
	 */
	public static String borderBottomColor(WebElement element) {
		return element.getCssValue("border-bottom-color");
		
	}
	
	/*
	 * purpose:This method will get Border Bottom Width
	 * param: WebElement
	 * return:void
	 */
	public static String borderBottomWidth(WebElement button) {
		return button.getCssValue("border-bottom-width");
		
	}
	
	/*
	 * purpose:This method will return Integer array which stores
	 * Location X Y of WebElement in integer array 
	 * param: WebElement
	 * return:Integer[]
	 */
	public static Integer[] getElementLocationXY(WebElement element) {
		Integer xy[]=new Integer[2]; 
		Point location= element.getLocation();
		xy[0]= location.getX();
		xy[1]=location.getY(); 
		return xy;
	}
	/*
	 * purpose:This method will get Location
	 * param: WebElement
	 * return:Point class
	 */
	public static Point getLocation(WebElement button) {
		return button.getLocation();
		
	}
	
	
	/*
	 * purpose:This method will Tagname of element
	 * param: WebElement
	 * return:Point class
	 */
	public static String getTagName(WebElement element) {
		return element.getTagName();
		
	}
	
	
}
