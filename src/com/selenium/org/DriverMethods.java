package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver s=new ChromeDriver();
        s.get("https://www.google.co.in/");
        s.manage().window().maximize();
        s.navigate().to("https://www.flipkart.com/");
        s.navigate().back();
        s.navigate().forward();
        s.navigate().refresh();
        String currentUrl=s.getCurrentUrl();
        System.out.println(currentUrl);
        String title = s.getTitle();
        System.out.println(title);
        s.close();
        s.quit();
	}

}
