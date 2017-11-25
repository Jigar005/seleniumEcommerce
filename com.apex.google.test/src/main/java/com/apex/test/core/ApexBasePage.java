package com.apex.test.core;
import org.openqa.selenium.WebDriver;


public class ApexBasePage {
	protected WebDriver driver = null;
	
public String getTitle()
{return driver.getTitle();}

public String getUrl()
{return driver.getCurrentUrl();}
}
