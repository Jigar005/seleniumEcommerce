package SeleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.kayak.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'One-way')]")).click();
		driver.findElement(By.xpath(".//*[contains(@id,'destination-airport')]")).sendKeys("EWR");
		driver.findElement(By.xpath(".//*[contains(@id,'depart-input')]")).click();
		// String
		// ss=driver.findElement(By.xpath(".//*[contains(@id,'201801')]/div/div[3]/div[1]/div[2]")).getText();
		// System.out.println(ss);
		/*
		 * .//*[@id='Gu-k-201801']/div/div[3]/div[1]/div[1] firsrt
		 * .//*[@id='Gu-k-201801']/div/div[3]/div[1]/div[2]/div second
		 * .//*[@id='Gu-k-201801']/div/div[3]/div[5]/div[4]/div last
		 * .//*[contains(@id,'201801')]/div/div[3]/div[1]/div[2]
		 */
		String date = "01/31/2018";
		String[] dateArray = date.split("/");
		String month = dateArray[0];
		String day = dateArray[1];
		String year = dateArray[2];
		int rowCount;
		int coloumCount;
		String p1 = ".//*[contains(@id,'"+year+month+"')]/div/div[3]/div[";
		String p2 = "]/div[";
		String p3 = "]";
		String currentDate = null;
		boolean flag = true;

		for (rowCount = 1; rowCount < 6; rowCount++) {
			for (coloumCount = 1; coloumCount < 8; coloumCount++) {
				currentDate = driver.findElement(By.xpath(p1 + rowCount + p2 + coloumCount + p3)).getText();
				System.out.println(currentDate);
				if (currentDate.contains(day)) {
					driver.findElement(By.xpath(p1 + rowCount + p2 + coloumCount + p3)).click();
					flag = false;
					break;

				}

			}
/*If I don't use boolean variable then the outer for loop will be break at its first iteration.
 * by using boolean variable it will come to know that inner for loop is broke so outer has to follow
 */
			if (flag = false) {
				break;
			}
		}

	}

}
