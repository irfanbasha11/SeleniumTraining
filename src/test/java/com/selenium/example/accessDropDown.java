package com.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class accessDropDown {
 public static void main(String[] args) throws InterruptedException { 
	 WebDriverManager.firefoxdriver().setup();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\irfanbs\\Downloads\\geckodriver-v0.30.0-win32.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
 }}

