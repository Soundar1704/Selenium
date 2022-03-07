package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.com/");
        driver.manage().window().maximize();
        
        WebElement from = driver.findElement(By.id("src"));
        from.sendKeys("chennai");
        
        WebElement to = driver.findElement(By.id("dest"));
        to.sendKeys("coimbatore");
        
       
        
	}

}
