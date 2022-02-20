package Web_Common_Function_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTextBox {
	public static void sendInput(WebElement textBox, String text,WebDriver driver){
		if(WebElementCommon.isClickable(textBox, driver)){
			textBox.sendKeys(text);
		}
	}
}
