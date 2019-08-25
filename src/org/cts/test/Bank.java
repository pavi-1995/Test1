package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yumthang Valley\\eclipse-pavithra\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.lvbankloanline.in/lvbretail/retaillogin.html");
	 
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	WebElement username = driver.findElement(By.id(" "));
	username.sendKeys("paciperumal95@gmail.com");
	
WebElement password = 	driver.findElement(By.id(" "));
password.sendKeys("12345678");
	
	
	
	}

}
