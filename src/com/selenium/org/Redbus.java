package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws Throwable {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      
      WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
      mob.sendKeys("9715389080");
      
      WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
      pass.sendKeys("soundar1704");
      Thread.sleep(2000);
    
      WebElement log = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
      log.click();
      Thread.sleep(2000);
     
    WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Brand Directory']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView();", scrolldown);
    Thread.sleep(2000);
    
    WebElement scrollup = driver.findElement(By.xpath("//div[text()='Mobiles']"));
    js.executeScript("arguments[0].scrollIntoView();", scrollup);
    
      
    
	}

}
