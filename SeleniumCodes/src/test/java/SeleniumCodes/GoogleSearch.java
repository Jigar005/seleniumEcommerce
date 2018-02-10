package SeleniumCodes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("flight");
		List <WebElement> list = driver.findElements
				(By.xpath("//ul[@role='listbox']//li//descendant::div[contains(@class,'sbqs_c')]"));
		System.out.println(list.size());
		for (int i = 0; i<list.size(); i++)
		{
			
			if (list.get(i).getText().equalsIgnoreCase("flight tracker"))
			{
				System.out.println(list.get(i).getText());
				list.get(i).click();
				break;
			}
			
			
		}
	}

}
