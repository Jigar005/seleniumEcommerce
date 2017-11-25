package com.apex.test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class EcommerceRegistationTest extends EcommerceBaseTest implements EcommerceRegistationConstants  {
  @Test//Getting the registation page and clickon the new user
  public void getRegPage () throws Exception 
  {driver.findElement(By.xpath(ACCOUNTCLICK_XPATH)).click();
  Thread.sleep(5000);
  driver.findElement(By.xpath(SIGNUPCLICK_XPATH)).click();
  Thread.sleep(10000);
  driver.findElement(By.xpath(GENDER_BUTN_XPATH)).click();
  driver.findElement(By.id(FNAME_ID)).sendKeys("Jigar");
  driver.findElement(By.id(LNAME_ID)).sendKeys("Mehta");
  driver.findElement(By.id(EMAIL_ID)).sendKeys("Mehta@rocking.com");
  driver.findElement(By.id(BIRTHDAY_ID)).sendKeys("31");
  driver.findElement(By.id(MONTH_ID)).sendKeys("08");
  driver.findElement(By.id(YEAR_ID)).sendKeys("1979");
  driver.findElement(By.id(HOUSENO_ID)).sendKeys("5");
  driver.findElement(By.id(ADD1_ID)).sendKeys("M G road");
  driver.findElement(By.id(CITY_ID)).sendKeys("fremont");
  driver.findElement(By.id(STATE_ID)).sendKeys("ca");
  driver.findElement(By.id(COUNTRY_ID)).sendKeys("usa");
  driver.findElement(By.id(POSTCODE_ID)).sendKeys("25412");
  driver.findElement(By.id(PHONE_ID)).sendKeys("5555555555");
  driver.findElement(By.id(FAX_ID)).sendKeys("5555555555");
  driver.findElement(By.id(PASSWORD_ID)).sendKeys("1234");
  driver.findElement(By.id(CPASSWORD_ID)).sendKeys("1234");
  driver.findElement(By.id(NEWSLETTER_ID)).click();
  driver.findElement(By.id(TERMS_ID)).click();
  driver.findElement(By.name(SUBMIT_NAME)).click();

  }
 
  }
