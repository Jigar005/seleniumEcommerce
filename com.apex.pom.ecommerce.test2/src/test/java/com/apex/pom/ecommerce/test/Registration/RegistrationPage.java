package com.apex.pom.ecommerce.test.Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apex.pom.ecommerce.test.core.EcommerceBasePage;


public class RegistrationPage extends EcommerceBasePage implements RegistrationConstants {
	@FindBy(xpath = RegistrationConstants.ACCOUNTCLICK_XPATH)
	WebElement accclickElemnt;
	@FindBy(xpath = RegistrationConstants.SIGNUPCLICK_XPATH)
	WebElement signupElemnt;
	@FindBy(xpath = RegistrationConstants.GENDER_BUTN_XPATH)
	WebElement genderBtnElemnt;
	@FindBy(id = RegistrationConstants.FNAME_ID)
	WebElement fNameElemnt;
	@FindBy(id = RegistrationConstants.LNAME_ID)
	WebElement lNameElemnt;
	@FindBy(id = RegistrationConstants.BIRTHDAY_ID)
	WebElement BirthDayElemnt;
	@FindBy(id = RegistrationConstants.MONTH_ID)
	WebElement BirthMonthElemnt;
	@FindBy(id = RegistrationConstants.YEAR_ID)
	WebElement BirthYearElemnt;
	@FindBy(id = RegistrationConstants.EMAIL_ID)
	WebElement EmailAddElemnt;
	@FindBy(id = RegistrationConstants.HOUSENO_ID)
	WebElement houseNoElemnt;
	@FindBy(id = RegistrationConstants.ADD1_ID)
	WebElement addrsLineElemnt;
	@FindBy(id = RegistrationConstants.CITY_ID)
	WebElement cityElemnt;
	@FindBy(id = RegistrationConstants.STATE_ID)
	WebElement stateElemnt;
	@FindBy(id = RegistrationConstants.COUNTRY_ID)
	WebElement countryElemnt;
	@FindBy(id = RegistrationConstants.POSTCODE_ID)
	WebElement postCodeElemnt;
	@FindBy(id = RegistrationConstants.PHONE_ID)
	WebElement phoneElemnt;
	@FindBy(id = RegistrationConstants.FAX_ID)
	WebElement faxElemnt;
	@FindBy(id = RegistrationConstants.PASSWORD_ID)
	WebElement passwordElemnt;
	@FindBy(id = RegistrationConstants.CPASSWORD_ID)
	WebElement cPasswordElemnt;
	@FindBy(id = RegistrationConstants.NEWSLETTER_ID)
	WebElement newsLetterBoxElemnt;
	@FindBy(id = RegistrationConstants.TERMS_ID)
	WebElement termsBoxElemnt;
	@FindBy(name = RegistrationConstants.SUBMIT_NAME)
	WebElement submitElemnt;

	public void registrationFillUp(String fname, String lname, String date, String month, String year, String email,
			String houseno, String addrsL1, String city, String state, String country, String postCode, String phoneNu,
			String faxNo, String password, String cPassword) throws Exception {
		accclickElemnt.click();
		Thread.sleep(2000);
		signupElemnt.click();
		Thread.sleep(2000);
		genderBtnElemnt.click();
		Thread.sleep(2000);
		fNameElemnt.sendKeys(fname);
		Thread.sleep(2000);
		lNameElemnt.sendKeys(lname);
		Thread.sleep(2000);
		BirthDayElemnt.sendKeys(date);
		Thread.sleep(2000);
		BirthMonthElemnt.sendKeys(month);
		Thread.sleep(2000);
		BirthYearElemnt.sendKeys(year);
		Thread.sleep(2000);
		EmailAddElemnt.sendKeys(email);
		Thread.sleep(2000);
		houseNoElemnt.sendKeys(houseno);
		Thread.sleep(2000);
		addrsLineElemnt.sendKeys(addrsL1);
		Thread.sleep(2000);
		cityElemnt.sendKeys(city);
		Thread.sleep(2000);
		stateElemnt.sendKeys(state);
		Thread.sleep(2000);
		countryElemnt.sendKeys(country);
		Thread.sleep(2000);
		postCodeElemnt.sendKeys(postCode);
		Thread.sleep(2000);
		phoneElemnt.sendKeys(phoneNu);
		Thread.sleep(2000);
		faxElemnt.sendKeys(faxNo);
		Thread.sleep(2000);
		passwordElemnt.sendKeys(password);
		Thread.sleep(2000);
		cPasswordElemnt.sendKeys(cPassword);
		Thread.sleep(2000);
		newsLetterBoxElemnt.click();
		Thread.sleep(2000);
		termsBoxElemnt.click();
		Thread.sleep(2000);
		submitElemnt.click();
		Thread.sleep(2000);
	}

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
