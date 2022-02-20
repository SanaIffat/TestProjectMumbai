package Web_Common_Function_Assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class WebBrowser {
	
	/*
	 * purpose: This method will return true if expected Page Title matches original PageTitle
	 * param: WebDriver, Expected pageTitle String Format
	 * return: boolean
	 */
	public static boolean pageTitleValidation(WebDriver driver, String expTitle){
		boolean isTitleMatch = false;
		if(driver.getTitle().equals(expTitle)){
			isTitleMatch = true;
		}
		return isTitleMatch;
	}
	
	/*
	 * purpose: This method allows Forward Navigation
	 * param: WebDriver
	 */
	public static void pageForwardNavigation(WebDriver driver){
		driver.navigate().forward();	
		}
	/*
	 * purpose:This method allows Backward Navigation
	 * param: WebDriver
	 */
	public static void pageBackwardNavigation(WebDriver driver){
		driver.navigate().back();	
		}
	/*
	 * purpose: This method allows Page Refresh
	 * param: WebDriver
	 */
	public static void pageRefresh(WebDriver driver){
		driver.navigate().refresh();	
		}
	/*
	 * purpose: This method Maximize browser
	 * param: WebDriver
	 */
	public static void browserMaximize(WebDriver driver){
		driver.manage().window().maximize();	
		}
	/*
	 * purpose: This method minimizes browser
	 * param: WebDriver, Integer width and Height of Window
	 */
	public static void browserMinimize(WebDriver driver, int width,int height){
		Dimension dm = new Dimension(width,height);
		driver.manage().window().setSize(dm);	
		}
	/*
	 * purpose: This method add Cookie To Browser
	 * param: WebDriver, String name Of Cookie, String value of cookie
	 */
	public static void addCookieToBrowser(WebDriver driver,String name, String value){
		Cookie cookie = new Cookie(name, value);
		driver.manage().addCookie(cookie);	
		}
	/*
	 * purpose: This method get Cookie a particular named cookie from Browser
	 * param: WebDriver, String name 
	 * return: Cookie
	 */
	
	public static Cookie getBrowserCookieNamed(WebDriver driver,String name){
		Cookie cookie = driver.manage().getCookieNamed(name);
		return cookie;	
		
		}
	/*
	 * purpose: This method print Cookies in console
	 * param: WebDriver, String name 
	 * return: Set<Cookie>
	 */
	
	public static Set<Cookie> printCookies(WebDriver driver){
		 Set<Cookie> cookies = driver.manage().getCookies();
		 return cookies;	
		
		}
	
	/*
	 * purpose: tore the cookie information using FileWriter Class to write 
	 * streams of characters and BufferedWriter to write the text 
	 * into a file to create into a file Cookies.data
		"Cookies.data" file stores all cookies information along with "Name, Value, Domain, Path".
	 * param: WebDriver
	 */
	
	public static void manageCookies(WebDriver driver){
		 	// create file named Cookies to store Login Information		
        File file = new File("C:/Users/admin/eclipse-workspace/Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);									
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	 
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
		
		}
	
	/*
	 * purpose: This method delete All Cookies from Browser
	 * param: WebDriver
	 */
	public static void deleteAllCookies(WebDriver driver){
		driver.manage().deleteAllCookies();	
		}
	
	/*
	 * purpose: This method delete Cookie from Browser
	 * param: WebDriver
	 */
	public static void deleteCookie(WebDriver driver,Cookie cookie){
		driver.manage().deleteCookie(cookie);
		}
	
	/*
	 * purpose: This method delete Cookie from Browser
	 * param: WebDriver
	 */
	public static void deleteCookieNamed(WebDriver driver,String name){
		driver.manage().deleteCookieNamed(name);
		}
	/*
	 * purpose: This method switch To Browser Child Tab
	 * param: WebDriver
	 */
	
	public static void switchToBrowserChildTab(WebDriver drive, int tabIndex) {
			// considering that there is only one tab opened in that point.
			String oldTab = drive.getWindowHandle();
		 	ArrayList<String> newTab = new ArrayList<String>(drive.getWindowHandles());
		    newTab.remove(oldTab);
		    // change focus to new tab
		    drive.switchTo().window(newTab.get(tabIndex));
	}
	/*
	 * purpose: This method switch To Browser Parent Tab
	 * param: WebDriver
	 */
	
	public static void switchToBrowserParentTab(WebDriver drive) {
		String parent=drive.getWindowHandle();
		drive.switchTo().window(parent);
	}
}
