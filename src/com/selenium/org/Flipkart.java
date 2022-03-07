package com.selenium.org;

import com.java1.FlipkartLogin;

public class Flipkart extends BaseClass  {

	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");
		geturl("https://www.amazon.in/");
		 FlipkartLogin f=new  FlipkartLogin(driver);
			click(f.getArr());	 
			Thread.sleep(2000);
			sendkeys(f.getMail(), "9715389080");
			Thread.sleep(2000);
			click(f.getCon());
			Thread.sleep(2000);
			sendkeys(f.getPass(), "soundar1704");
			click(f.getSign());
				 
				 
				 
				 
				 
				 
				 
				 
     
	}


}
