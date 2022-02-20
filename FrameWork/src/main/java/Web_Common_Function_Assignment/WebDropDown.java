package Web_Common_Function_Assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropDown {
	/*
	 * purpose:This method will Select option using Value 
	 * in static DropDown
	 * param: WebElement, String value
	 * return:void
	 */
 public static void staticDropDownSelectByValue(WebElement element, String value) {
	Select s= new Select(element);
	s.selectByValue(value);
 }
 
 	/*
	 * purpose:This method will Select option using Index 
	 * in static DropDown
	 * param: WebElement, Integer Index
	 * return:void
	 */
 public static void staticDropDownSelectByIndex(WebElement element, int index) {
	Select s= new Select(element);
	s.selectByIndex(index);
}

	/*
	 * purpose:This method will Select option By Visible Text
	 * in static DropDown
	 * param: WebElement, String visibleText
	 * return:void
	 */
 public static void staticDropDownSelectByVisibleText(WebElement element, String visibleText) {
	Select s= new Select(element);
	s.selectByVisibleText(visibleText);
}

 	/*
	 * purpose:This method will DeSelect option using Value 
	 * in static DropDown
	 * param: WebElement, String value
	 * return:void
	 */
 
 public static void staticDropDownDeselectByValue(WebElement element, String value) {
		Select s= new Select(element);
		s.deselectByValue(value);
	 }
 
 	/*
	 * purpose:This method will DeSelect option using Index
	 * in static DropDown
	 * param: WebElement, integer index
	 * return:void
	 */
 public static void staticDropDownDeSelectByIndex(WebElement element, int index) {
	Select s= new Select(element);
	s.deselectByIndex(index);
}
 
 	/*
	 * purpose:This method will DeSelect option By Visible Text
	 * in static DropDown
	 * param: WebElement, String visibleText
	 * return:void
	 */
public static void staticDropDownDeSelectByVisibleText(WebElement element, String visibleText) {
	Select s= new Select(element);
	s.deselectByVisibleText(visibleText);
}

/*
 * purpose:This method will Select given option from given list
 * in Dynamic DropDown
 * param: WebElement List, String option
 * return:void
 */
public static void dynamicDropDownOptionClick(List<WebElement> elementlist, String option) {
	List<WebElement> myList = elementlist;
	for (WebElement element:myList)
	    if(element.getText().contains(option))
	    	element.click();	
}






}
