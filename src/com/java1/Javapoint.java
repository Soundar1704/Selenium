package com.java1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Javapoint {

	 
	public Javapoint(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static	WebDriver driver;
	

	@FindBy(xpath = "//img[@alt='selenium']")
	private WebElement sel;
	
	public WebElement getSel() {
		return sel;
	}

	public WebElement getSelind() {
		return selind;
	}

	public WebElement getTer() {
		return ter;
	}

	public WebElement getScup() {
		return scup;
	}

	public WebElement getScdo() {
		return scdo;
	}

	@FindBy(partialLinkText = "Selenium Index")
	private WebElement selind;
	
	@FindBy(partialLinkText = "Selenium Basic Terminology")
	private WebElement ter;
	
	@FindBy(partialLinkText = "Automation Testing")
    private WebElement scup;
	
	@FindBy(partialLinkText = "Why Automated Testing")
    private WebElement scdo;
     











}



