package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C {
	 public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yumthang Valley\\eclipse-pavithra\\Selenium\\driver\\geckodriver.exe");
	
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://www.facebook.com/");
	 
	 driver.quit();
	 
	 
	 }

}
