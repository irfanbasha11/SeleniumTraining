package com.selenium.example;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {				

    public static void main(String[] args) throws InterruptedException {		
    	
    	    System.setProperty("webdriver.chrome.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/chromedriver.exe");
        	WebDriver driver=new ChromeDriver();			
        		
        //Launching the site.				
            driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();		
                		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
        		
        String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator i1=(Iterator) s1.iterator();		
        		
        while(((java.util.Iterator<String>) i1).hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    Thread.sleep(3000);
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
}