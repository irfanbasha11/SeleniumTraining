package com.selenium.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uitest {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.com");
		
		//javascript exector for alert
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript ("alert('Hello, do not close me!')");
		Thread.sleep(5000);
		driver.quit();
	}

}
