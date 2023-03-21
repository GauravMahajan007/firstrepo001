package com.ADS.Utility;

import org.openqa.selenium.By;
import com.ADS.BaseClass.Base;

public class TestUtility extends Base {

	/**
	 * load in Base Class
	 */
	public static long Page_Load_timeout = 10;
	public static long Implicitly_Wait = 10;
	
	public void type(String Xpath,String Fname)
	{
		driver.findElement(By.xpath(Xpath)).sendKeys(Fname);
	}
	
}
