package resources;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class jdbcConection {

public static void main(String[] args) throws SQLException, ClassNotFoundException {

// TODO Auto-generated method stub

String host="localhost";

String port= "3306";

Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/testdata", "root", "mysql");

Statement s=con.createStatement();

ResultSet rs=s.executeQuery("select * from login where username ='sana'");

while(rs.next())

{
	System.out.println(rs.getString("username"));
	System.out.println(rs.getString("passward"));

/*WebDriver driver= new FirefoxDriver();

driver.get("https://login.salesforce.com");

driver.findElement(By.xpath(".//*[@id='username']")).sendKeys();

driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));*/

}

}

}
