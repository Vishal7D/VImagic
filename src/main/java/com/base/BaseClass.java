package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver; 
	
	FileInputStream fileInputStream;
	public static String pojectPath= System.getProperty("user.dir");
	
	public void launchTheWeb() {
		try {
			fileInputStream = new FileInputStream(pojectPath+"D:\\Software\\Vishal\\com.VImagic\\src\\main\\resources\\Property\\config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	   driver = new ChromeDriver();
	   
	   driver.manage().window().minimize();
	   
	   Properties prop= new Properties();
	   
	   prop.getProperty("weburl");
	}

}
