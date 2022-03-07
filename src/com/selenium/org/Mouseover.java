package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://www.greenstechnologys.com/");
	        driver.manage().window().maximize();
	        
	        WebElement course = driver.findElement(By.partialLinkText("COURSES"));
	        Actions ac=new Actions(driver);
	        ac.moveToElement(course).perform();
	        Thread.sleep(2000);
	        
	        WebElement next = driver.findElement(By.partialLinkText("Oracle Training"));
	        ac.moveToElement(next).perform();
	        
	        WebElement click = driver.findElement(By.linkText("SQL Certification"));
	        ac.click(click).perform();
	        
	        driver.get("https://www.google.co.in/");
	        driver.manage().window().maximize();
	        WebElement con = driver.findElement(By.linkText("Gmail"));
	        Thread.sleep(2000);
	        ac.contextClick(con).perform();
	        Thread.sleep(2000);

	        WebElement goo = driver.findElement(By.xpath("//input[@type='text']"));   
	        goo.sendKeys("soundar");
	        Thread.sleep(2000);
	        ac.doubleClick(goo).perform();
	        
	        Thread.sleep(2000);
	        driver.get("http://www.leafground.com/pages/drop.html");
	        WebElement drag = driver.findElement(By.id("draggable"));
	        WebElement drop = driver.findElement(By.id("droppable"));
	        Thread.sleep(2000);
	        ac.dragAndDrop(drag, drop).perform();
	        
	        
	        
	}
	
	
	

}
