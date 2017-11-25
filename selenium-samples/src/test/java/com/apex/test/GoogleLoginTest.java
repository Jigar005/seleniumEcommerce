package com.apex.test;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.DataProvider;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoogleLoginTest {
	private static final String PASSWORDBOX_CLICK = "passwordNext";
	private static final String PASSWORDBOX = "password";
	private static final String EMAILBOX_NEXTCLICK = "identifierNext";
	private static final String EMAILBOX = "identifierId";
	WebDriver driver =null;
	
	@DataProvider(name= "success_ids_dp")
	public Object[][] getSuccessfulUserId()
	{
		return getTableData("google_ids.xls", "Sheet1", "GoogleIds");
//		String[][] ids ={
//				{"user1@gmail.com", "password1"},
//				{"user2@gmail.com", "password2"},
//				{"user3@gmail.com", "password3"},
//				{"user4@gmail.com", "password4"}};
	}
		
		
  @Test(dataProvider= "success_ids_dp")
  public void testWithSucessInput(String emailId, String pwd) throws Exception 
  {
	  driver.findElement(By.id(EMAILBOX)).sendKeys(emailId);
	  Thread.sleep(2000);
	  driver.findElement(By.id(EMAILBOX_NEXTCLICK)).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name(PASSWORDBOX)).sendKeys(pwd);
	  Thread.sleep(2000);
	  driver.findElement(By.id(PASSWORDBOX_CLICK)).click();
//	  Thread.sleep(4000);
//	  Assert.assertTrue(driver.getTitle().contains("Inbox"));
//	  Assert.assertTrue(driver.getCurrentUrl().contains("https://mail.google.com/"));
	  
	  
  }
  @BeforeMethod
  public void setUp() {
	  driver = new FirefoxDriver();
	  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail");
  }

  @AfterMethod
  public void cleanUp() {
	  driver.close();
  }
  public String[][] getTableData(String xlFilePath, String sheetName, String tableName){
      String[][] tabArray=null;
      try{
          Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
          Sheet sheet = workbook.getSheet(sheetName);
          int startRow,startCol, endRow, endCol,ci,cj;
          Cell tableStart=sheet.findCell(tableName);
          startRow=tableStart.getRow();
          startCol=tableStart.getColumn();

          Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                               

          endRow=tableEnd.getRow();
          endCol=tableEnd.getColumn();
          System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                  "startCol="+startCol+", endCol="+endCol);
          tabArray=new String[endRow-startRow-1][endCol-startCol-1];
          ci=0;

          for (int i=startRow+1;i<endRow;i++,ci++){
              cj=0;
              for (int j=startCol+1;j<endCol;j++,cj++){
                  tabArray[ci][cj]=sheet.getCell(j,i).getContents();
              }
          }
      }
      catch (Exception e)    {
          System.out.println("error in getTableArray()");
      }

      return(tabArray);
  }
}
