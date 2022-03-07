package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
	
	    WebElement frame = driver.findElement(By.xpath("//a[@class='analystic']"));
	    frame.click();
	    WebElement p = driver.findElement(By.id("singleframe"));  
	    driver.switchTo().frame(p);
	    System.out.println("====P====");
	    Thread.sleep(2000);
	    WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	     text.sendKeys("Selenium");
	     
	driver.switchTo().defaultContent();
	 
	System.out.println("====iFrame====");
	
	Thread.sleep(2000);
	      WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	       frame2.click();
	       
	       WebElement parentframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	        driver.switchTo().frame(parentframe);
	        
	        WebElement child = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	        driver.switchTo().frame(child);
	        Thread.sleep(2000);
	        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	         textbox.sendKeys("testing");
	         Thread.sleep(2000);
	         driver.switchTo().parentFrame();
	         driver.switchTo().defaultContent();
	
	
	
	
	
	
	}

}
