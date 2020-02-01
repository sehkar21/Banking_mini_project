package com.banking.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPage;

public class TC1_LoginPage_001 extends BaseClass {

	
	@Test
	public void loginTest() throws IOException {
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setusername(username);
		logger.info("Enetered Username");
		
		lp.setpassword(password);
		logger.info("Enetered password");
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
		}
		else
		{
			
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
		
		
	}
	
}
