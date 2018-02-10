package SeleniumCodes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Temp  {
	public static void main(String[] args) {
		
	
	
	WebDriver driver = new FirefoxDriver(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	driver.get("https://www.google.com/");
	driver.findElement(By.id("lst-ib")).sendKeys("Kaka");;
	//will open google in 
	//Japanese Lang

		
	}

}
