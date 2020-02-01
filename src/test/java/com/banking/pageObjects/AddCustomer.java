package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

	WebDriver ldriver;
	
	public AddCustomer(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//ul[contains(@class, 'menusubnav')]/li[2]/a")
	@CacheLookup
	WebElement Newcustomer;
	
	@FindBy(xpath="//tr/td[2]/input")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(xpath="//tr/td[2]/input[1]")
	@CacheLookup
	WebElement rdGender;

	@CacheLookup
	@FindBy(xpath="//input[@id='dob']")
	WebElement txtdob;

	@CacheLookup
	@FindBy(xpath="//textarea")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(xpath="//tr[8]/td[2]/input")
	WebElement txtcity;

	@CacheLookup
	@FindBy(xpath="//tr[9]/td[2]/input")
	WebElement txtstate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		Newcustomer.click();
			
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
	

	
	
	
	
}
