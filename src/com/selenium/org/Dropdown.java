package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        
	        WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	        create.click();
	        
	        
	        Thread.sleep(2000);
	        WebElement day = driver.findElement(By.id("day"));
	        Select s=new Select(day);
	        s.selectByIndex(16);
	        
	        Thread.sleep(2000);
	        WebElement month = driver.findElement(By.id("month"));
	        Select m=new Select(month);
	        m.selectByVisibleText("May");
	        
	        Thread.sleep(2000);
	        WebElement year = driver.findElement(By.id("year"));
	        Select y=new Select(year); 
	        y.selectByValue("2019");
	        
	        Thread.sleep(2000); 
	       WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	       gender.click();
	       
	}

}
