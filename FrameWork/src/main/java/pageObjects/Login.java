package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver drive;
	public Login(WebDriver drive) {
		this.drive=drive;
	}
	
	By login=By.xpath("//li[@data-cy='account']");
	By username=By.id("username");
	By googlelog=By.xpath("//div[@data-cy='googleLogin']");
	
	
	public WebElement getLogin() {
		return drive.findElement(login);
	}
	public WebElement getUsername() {
		return drive.findElement(username);
	}
	public WebElement getgoogleLog() {
		return drive.findElement(googlelog);
	}
	
}
