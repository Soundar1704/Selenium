package com.java1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin {
	public FlipkartLogin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static  WebDriver driver;
		
@FindBy(partialLinkText = "Account & Lists")	
private WebElement acc;
public WebElement getAcc() {
	return acc;
}

public WebElement getMail() {
	return mail;
}

public WebElement getCon() {
	return con;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSign() {
	return sign;
}

@FindBy(id = "ap_email")
private WebElement mail;

@FindBy(id = "continue")
private WebElement con;
 
@FindBy(id = "ap_password")
private WebElement pass;

@FindBy(id = "signInSubmit")
private WebElement sign;
@FindBy(partialLinkText = "Your Account")
private WebElement ya;
public WebElement getYa() {
	return ya;
}
@FindBy(xpath = "(//span[@class='nav-icon nav-arrow'])[2]")
private WebElement arr;
public WebElement getArr() {
	return arr;
}
}
