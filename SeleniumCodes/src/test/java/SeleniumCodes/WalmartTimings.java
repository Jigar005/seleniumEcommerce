package SeleniumCodes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WalmartTimings {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.walmart.com/search/?query=tv&cat_id=0");
		driver.get("https://www.walmart.com");
		driver.findElement(By.id("global-search-input")).sendKeys("phone");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='global-search-form']/div/div[3]/button")).click();
		String totalPagesCount = driver.findElement(By.xpath(".//*[@id='mainSearchContent']/div[3]/div[2]/ul/li[8]/a")).getText();
		
		//Date and Timing printing
		DateFormat dateformat = new SimpleDateFormat("DD/MM/YY hh:mm:ss");
		Date date = new Date();
		String currentDate = dateformat.format(date);
		System.out.println(currentDate +"  "+totalPagesCount);
	}
	

}
