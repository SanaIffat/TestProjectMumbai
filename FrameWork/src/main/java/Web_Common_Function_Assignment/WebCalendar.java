package Web_Common_Function_Assignment;


import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCalendar {
	
	/*
	 * purpose: This method will  click on Forward(Next) button of Calendar
	 *  or click on Backward(Prev) button till we get desired Year or Month which is taken from user as 
	 *  a parameter  
	 * param: WebDriver ,String yearOrMonth, WebElement yearOrMonthLocator, WebElement nextOrPrevButton
	 * return: void
	 */
	
	public static void goforwardORBackward(WebDriver driver,String yearOrMonth,WebElement yearOrMonthLocator,WebElement nextOrPrevButton) {
	
		// Retrieving current year value Click on Next arrow till we get desired year
		if(!yearOrMonthLocator.getText().equals(yearOrMonth))
		{
			do{
				nextOrPrevButton.click();
			   }while(!yearOrMonthLocator.getText().equals(yearOrMonth));
			
		}
	}
	/*
	 * purpose: This method will select Desired Date of Calendar which is taken from user as 
	 *  a parameter  
	 * param: WebDriver driver, String date, List<WebElement> DateLocator
	 * return: void
	 */

	public static void selectDate(WebDriver driver, String date,List<WebElement> DateLocator) {
		List<WebElement> dates= DateLocator;
			
		for(WebElement d:dates )
		{
			if(d.getText().equals(date))
			{
				d.click();
				break;
				
			}
		}
	}
	
	
	
}
