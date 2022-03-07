package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				driver=new ChromeDriver();
				
			} else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("\\Driver\\geckodriver.exe"));
				driver=new FirefoxDriver();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
              
		}
        public static void geturl(String url) {
           driver.get(url);
        }
        public static void  sendkeys(WebElement element, String send) {
        	element.sendKeys(send);
			
		}
        public static void click(WebElement element) {
          element.click();
		}
        public static void robotClass() throws AWTException,Throwable {
        	Robot r=new Robot();
        	r.keyPress(KeyEvent.VK_DOWN);
        	r.keyRelease(KeyEvent.VK_UP);
        	r.keyPress(KeyEvent.VK_ENTER);	   
		}
        public static void action(WebElement element) {
        	Actions ac=new Actions(driver);
        	ac.contextClick(element).perform();
        }
        public static void moveToElement(WebElement element) {
        	Actions ac1=new Actions(driver);
        			ac1.moveToElement(element).perform();
        }
        public static void doubleClick(WebElement element) {
        	Actions ac2=new Actions(driver);
        	ac2.doubleClick(element).perform();
        }
        public static void draDrop(WebElement element, WebElement element1) {
        	Actions ac3=new Actions(driver);
        	ac3.dragAndDrop(element, element1);
        }
        public static void forward() {
        	driver.navigate().forward();
        }
        public static void back() {
        	driver.navigate().back();
        }
        public static void refresh() {
        	driver.navigate().refresh();
        }
        public static void close() {
        	driver.close();
        }
        public static void quit() {
        	driver.quit();
        }
        public static void enabled(WebElement element) {
        	element.isEnabled();
        }
        public static void displayed(WebElement element) {
        	element.isDisplayed();
        }
        public static void selected(WebElement element) {
        	element.isSelected();
        }
        public static void screenshot(String path) throws IOException {
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	File source = ts.getScreenshotAs(OutputType.FILE);
        	File dest=new File(path);
        	FileUtils.copyFile(source, dest);	
        }
        public static void clear(WebElement element) {
        	element.clear();
        }
        public static void dropdown(WebElement element,String option,String value) {
        	Select s=new Select(element);
        	if (option.equalsIgnoreCase("byIndex")) {
        		int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}else if (option.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			}else if (option.equalsIgnoreCase("byvisibleText")) {
				s.selectByVisibleText(value);
				
			}else {
				System.out.println("invalid selection");
			}
        }
        public static void simplealert() {
        	try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        public static void confirmalert(String alert) {
        	if (alert.equalsIgnoreCase("ok")) {
        		driver.switchTo().alert().accept();
				
			}else if (alert.equalsIgnoreCase("canel")) {
				driver.switchTo().alert().dismiss();
				
			}else {
				System.out.println("invalid confirm alert");
			}
        }
        public static void prompt(String alert, String value) {
        	if (alert.equalsIgnoreCase("ok")) {
        		driver.switchTo().alert().sendKeys(value);
        		driver.switchTo().alert().accept();
				
			}else if (alert.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
				
			}else {
				System.out.println("invalid");
			}
        }
        public static void scrollupdown(WebElement element) {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("arguments[0].scrollIntoView;", element);
        }
        public static void frames(int i) {
        	driver.switchTo().frame(i);
        }
        public static void frameString(String value) {
        	driver.switchTo().frame(value);
        }
        public static void frameElement(WebElement element) {
        	driver.switchTo().frame(element);
        }
        public static void windowshandling() {
        	Set<String> windowHandles = driver.getWindowHandles();
        	for (String st : windowHandles) {
        		String title = driver.switchTo().window(st).getTitle();
        		System.out.println(title);
				
			}
        }
     
        
        
}      
	


