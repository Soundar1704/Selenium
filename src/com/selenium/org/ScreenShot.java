package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
         WebDriver d=new ChromeDriver();
         d.get("https://www.flipkart.com/");
         d.manage().window().maximize();
         
         
         TakesScreenshot ts=(TakesScreenshot) d;
         File source = ts.getScreenshotAs(OutputType.FILE);
         File dest=new File("C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\snaps//flipkart.png");
         FileUtils.copyFile(source,dest);
         
         
	}

}
