package com.apex.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
//	  WebDriver driver = new FirefoxDriver();
		
//System.setProperty("webdriver.chrome.driver", "C:\\cDownload\\Selenium_browser_drivers\\Crossbrowser\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
		
System.setProperty("webdriver.InternetExplorer.driver", "C:\\cDownload\\Selenium_browser_drivers\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");

//Thread.sleep(10000);
WebDriver driver = new InternetExplorerDriver();
//Thread.sleep(10000);

driver.get("https://www.google.com");
  }
}
