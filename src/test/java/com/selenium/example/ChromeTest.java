package com.selenium.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ChromeTest {
	@Test
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\irfanbs\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();//Instance
		 driver.get("https://www.saucedemo.com/");//To which web site to access that URL
		 driver.manage().window().maximize();//It will maximize the window
		 Thread.sleep(3000);
		// Login Page
	     WebElement username = driver.findElement(By.id("user-name"));//Send the text for user name
	     username.sendKeys("standard_user");
		 WebElement password = driver.findElement(By.id("password"));//Send the text for password
		 password.sendKeys("secret_sauce");
	     WebElement submit = driver.findElement(By.id("login-button"));//Click on login button it will return to the home page
	     submit.click();
	     Thread.sleep(3000);//sleep time(it will wait for some time)
	     
	     String title = driver.getTitle();    // Verify the text on page " SWAG LABS
		 System.out.println("Text on the page: " +title);
		 
		 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();//	Click on ADD TO CART option on any of the product.
		 driver.findElement(By.className("shopping_cart_link")).click();//	Click on YOUR CART icon on top right corner.
		 driver.findElement(By.id("checkout")).click();//	Click on CHECKOUT
		 
		//	Add details for CHECKOUT (First name, Last name, zip code
		 WebElement fname = driver.findElement(By.id("first-name"));
		 fname.sendKeys("Irfan");
	     WebElement lname = driver.findElement(By.id("last-name"));
	     lname.sendKeys("Basha");
	     WebElement postcode = driver.findElement(By.id("postal-code"));
	     postcode.sendKeys("516001");
	     //10.	Scroll page down and click on CONTINUE
	     WebElement Sd = driver.findElement(By.id("continue"));
	     Point loc = Sd.getLocation();
	     System.out.println(loc);
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scroll"+loc);
	     Thread.sleep(4000);
	     //click on CONTINUE
	     WebElement cont = driver.findElement(By.name("continue"));
	     cont.click();
	     //11.	Scroll page down and Click on FINISH
	     WebElement fin = driver.findElement(By.name("finish"));
	     fin.click();
	     //12.	Click on BACK HOME
	     WebElement backtest = driver.findElement(By.cssSelector("#back-to-products"));
	     backtest.click();
	     //13.	LOGOUT (from Top left menu in home page)
	     WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
	     menu.click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
     	 Thread.sleep(1000);
     	 
	     driver.quit();
	 }
}

