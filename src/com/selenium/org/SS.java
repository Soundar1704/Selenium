package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().minimize();

TakesScreenshot ts=(TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dst=new File("C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\snaps//img1.png");
FileUtils.copyFile(src, dst);
	}

}
