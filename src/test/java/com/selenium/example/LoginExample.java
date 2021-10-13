package com.selenium.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginExample {
	//public static void main(String[] args) throws InterruptedException {
	@Test
	
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	}
	public void logintest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername"));
		WebElement username=driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword"));
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.name("Submit"));
		login.click();
		Thread.sleep(3000);
		driver.quit();
		

		
			}

		}



