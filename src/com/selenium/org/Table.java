package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();  
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().minimize();
        
        System.out.println("====First Column===");
    List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));  
    for (WebElement first : column) {
    	System.out.println(first.getText());
		}
    System.out.println("====Second Column===");
    List<WebElement> secnd = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
    for (WebElement secndc : secnd) {
		System.out.println(secndc.getText());
	}
    
    
		}
			
		}
        
        
	


