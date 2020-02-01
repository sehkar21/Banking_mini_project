package com.banking.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPage;
import com.banking.utilities.XLUtils;

public class TC_LoginPageDDT_002 extends BaseClass {

	
	
	@Test(dataProvider = "LoginData")
	public void LoginDDT(String user,String pwds) throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setusername(user);
		lp.setpassword(pwds);
		lp.clicksubmit();

		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			//driver.switchTo().frame("flow_close_btn_iframe");
			//lp.btnclose();
			lp.Logout();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}


	}
	
	
	public boolean isAlertPresent()
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		
		String path = "S:\\New folder\\projectworkplace\\Banking_mini_project\\src\\test\\java\\com\\banking\\TestData\\LoginData.xlsx";
		
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1",1);
		String LoginData[][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				
				LoginData[i-1][j]= XLUtils.getCellData(path, "Sheet1", i,j);
			}
		}
		
		return LoginData;
		
	}
	
}
