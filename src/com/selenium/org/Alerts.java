package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.automationtesting.in/Alerts.html");
         driver.manage().window().maximize();
         
         WebElement ok = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
         ok.click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
        
         
         WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
         confirm.click();
         WebElement con = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
         con.click();
         Thread.sleep(2000);
         driver.switchTo().alert().dismiss();
         Thread.sleep(2000);
         
         WebElement text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
         text.click();
         WebElement prom = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
         prom.click();
         Thread.sleep(2000);
         driver.switchTo().alert().sendKeys("soundar");
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         
       
         
         
         
         
         
         
         
         
	}

}
