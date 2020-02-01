package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	//@FindBy(id="closeBtn")
	//@CacheLookup
	//WebElement btnclose;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement btnLogout;
	
	
	
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setpassword(String pwd) 
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btnLogin.click();
	}
	
	/*public void btnclose()
	{
		btnclose.click();
	}*/
	
	public void Logout()
	{
		btnLogout.click();
	}
	
}
