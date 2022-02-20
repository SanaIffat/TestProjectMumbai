package com.aspire.selenium.practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:/Automation Data/SeleniumTools/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:/Users/sanac/Downloads/geckodriver-v0.30.0-win64/geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.spaces.in/");
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(700,450);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		driver.navigate().back();
		Thread.sleep(2000);
		Point p=new Point(40,70);
		driver.manage().window().setPosition(p);
		
		
		
		
		
	}

}
