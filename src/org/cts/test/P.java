package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yumthang Valley\\eclipse-pavithra\\Selenium\\driver\\chromedriver.exe" );
		  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		

}
}