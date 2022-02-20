package automationPracticeTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebToolTip {
public static WebDriver driver;
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\SeleniumTools\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/tooltip/");




//Instantiate Action Class

WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);

//Retrieve WebElement
WebElement element = driver.findElement(By.id("age"));

// Using the action class to mimic mouse hover
new Actions(driver).moveToElement(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element))).build().perform();
WebElement toolTip = driver.findElement(By.xpath("//*[@title='We ask for your age only for statistical purposes.']"));

// To get the tool tip text and assert
String toolTipText = toolTip.getText();
System.out.println("toolTipText-->"+toolTipText);

//Verification if tooltip text is matching expected value
if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){
System.out.println("Pass");
}else{
System.out.println("Fail");
}
// Close the main window
driver.close();
}
}
