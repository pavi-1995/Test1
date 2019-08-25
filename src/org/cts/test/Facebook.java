package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yumthang Valley\\eclipse-pavithra\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("paviperumal95@gmail.com");
		
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("12345678");
	
	
	
	
	
	
		
		
	}

}
