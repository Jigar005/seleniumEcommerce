package SeleniumCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.walmart.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List <WebElement> linkedList = driver.findElements(By.tagName("a"));
		linkedList.addAll(driver.findElements(By.tagName("img")));
		List <WebElement> activeLinks = new ArrayList();
		String active;
		
		for (int i =0; i<linkedList.size(); i++){
		if (linkedList.get(i).getAttribute("href")!=null)
		{
			activeLinks.add(linkedList.get(i));
//			System.out.println(activeLinks.get(i).getAttribute("href"));
		
		}
		active = activeLinks.get(i).getAttribute("href");
		driver.get(active);
		System.out.println("driver.getTitle"+driver.getTitle());
		driver.navigate().back();
		
		}
		//System.out.println(active);
//		System.out.println(ss= driver.getCurrentUrl());
	}
	


}
