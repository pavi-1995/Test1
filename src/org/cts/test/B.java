package org.cts.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class B {
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Yumthang Valley\\eclipse-pavithra\\Selenium\\driver\\IEDriverServer.exe" );
	
	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.quit();
	
	
	
	}

}
