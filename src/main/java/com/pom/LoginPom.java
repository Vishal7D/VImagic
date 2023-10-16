package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPom extends BaseClass{

	{
    
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement username;
    @FindBy(xpath="//p[text()='Password : admin123']")
    private WebElement password;
	@FindBy(xpath="//input[@name='username']")
	private WebElement inputUsername;
	@FindBy(xpath="//input[@name='password']")
	private WebElement inputPassword;
	
}
