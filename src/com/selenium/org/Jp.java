package com.selenium.org;

import com.java1.Javapoint;

public class Jp extends BaseClass {

	public static void main(String[] args) throws Throwable {
         browserLaunch("chrome");
         geturl("https://www.javatpoint.com/");
         Javapoint j=new Javapoint(driver);
         click(j.getSel());
         scrollupdown(j.getSelind());
         click(j.getTer());
         scrollupdown(j.getScdo());
         Thread.sleep(2000);
         scrollupdown(j.getScup());
         
	}
	

}
