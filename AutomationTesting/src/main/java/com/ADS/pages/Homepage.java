package com.ADS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ADS.BaseClass.Base;

public class Homepage extends Base{

	//Page Factory or Object Repository
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath = "//textarea[@rows='3']")
	WebElement address;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath = "//a[@href=\"WebTable.html\"]")
	WebElement WebTable;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	/** 
	 * @param Fname
	 */
	public void Typefname(String Fname)
	{
		FirstName.sendKeys(Fname);
	}
	
	/** 
	 * @param Lname
	 */
	public void TypeLname(String Lname)
	{
		LastName.sendKeys(Lname);
	}
	
	public void TypeAddress(String addresss)
	{
		address.sendKeys(addresss);
	}
	
	public void TypeEmail(String emails)
	{
		email.sendKeys(emails);
	}

	public void clickOnWebtable() {
		
		WebTable.click();
	}
}
