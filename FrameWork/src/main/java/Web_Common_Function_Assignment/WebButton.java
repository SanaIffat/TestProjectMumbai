package Web_Common_Function_Assignment;



import org.openqa.selenium.WebElement;

public class WebButton {
	/*
	 * purpose:This method will click on Button
	 * param: WebElement
	 * return:void
	 */
	public static void buttonClick(WebElement button) {
		button.click();
	}
	/*
	 * purpose:This method will get Text of Button
	 * param: WebElement
	 * return:void
	 */
	public static String buttongetText(WebElement button) {
		return button.getText();	
	}
	
	
	

}
