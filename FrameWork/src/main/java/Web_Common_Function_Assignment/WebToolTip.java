package Web_Common_Function_Assignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebToolTip {
	/*
	 * purpose: This method will return true if ToolTip is Present 
	 * param: WebDriver, String Attribute Name,WebElement TooltipElement 
	 * whose tooltip is being checked ,String Expected
	 * return: True if toolTip is present
	 */
	
	public static boolean handleTooltipByAttribute(WebDriver driver,String AttriName,WebElement TooltipElemnt,String expectedTooltip) {
		boolean toolTipPresent=false;
		String actual=TooltipElemnt.getAttribute(AttriName);
		if(actual.equals(expectedTooltip))
		{
			toolTipPresent=true;
		}
		return toolTipPresent;
	}

}
