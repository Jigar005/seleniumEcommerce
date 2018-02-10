package SeleniumCodes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Goodp implements GoodpConstant {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// implemented in class
		// FirefoxDriver
		driver = new FirefoxDriver();// Interface WebDriver
		driver.get("https://www.google.com");
	}

	@AfterMethod
	public void clearUp() {
		driver.close();
	}

	@DataProvider(name = "keyData")
	public Object[][] keyData() {
		return getData("google_ids.xls", "Sheet1", "GoogleIds");
	}

	@Test(dataProvider = "keyData")
	public void googleSearchTest(String keyWord1, String keyWord2) {
		driver.findElement(By.id(SEARCH_BOX)).sendKeys(keyWord1 + keyWord2);//
		driver.findElement(By.name(SEARCH_BUTTTON)).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	// Data Reading Method
	public String[][] getData(String xlFilePath, String sheetName, String tableName) {
		String[][] tabArray = null;
		try {
			Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
			Sheet sheet = workbook.getSheet(sheetName);
			int startRow, startCol, endRow, endCol, ci, cj;
			Cell tableStart = sheet.findCell(tableName);
			startRow = tableStart.getRow();
			startCol = tableStart.getColumn();

			Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1, 100, 64000, false);

			endRow = tableEnd.getRow();
			endCol = tableEnd.getColumn();
			System.out.println("startRow=" + startRow + ", endRow=" + endRow + ", " + "startCol=" + startCol
					+ ", endCol=" + endCol);
			tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
			ci = 0;

			for (int i = startRow + 1; i < endRow; i++, ci++) {
				cj = 0;
				for (int j = startCol + 1; j < endCol; j++, cj++) {
					tabArray[ci][cj] = sheet.getCell(j, i).getContents();
				}
			}
		} catch (Exception e) {
			System.out.println("error in getTableArray()");
		}

		return (tabArray);
	}
}
