package com.apex.pom.ecommerce.test.Registration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.pom.ecommerce.test.core.EcommerceBaseTest;
import com.apex.pom.ecommerce.test.core.JxlUtility;

public class RegistrationTest extends EcommerceBaseTest implements RegistrationConstants {

	@DataProvider(name = "read")
	public Object[][] read() {
		return JxlUtility.getData("ecommerce_ids.xls", "Sheet1", "ecommerce_registation");
	}

	@Test(dataProvider = "read")
	public void test1(String fname, String lname, String date, String month, String year, String email, String houseno,
			String addrsL1, String city, String state, String country, String postCode, String phoneNu, String faxNo,
			String password, String cPassword) throws Exception
	{
		RegistrationPage regpage = new RegistrationPage(driver);
		regpage.registrationFillUp(fname, lname, date, month, year, email, houseno, addrsL1, city, state, country,
				postCode, phoneNu, faxNo, password, cPassword);

	}

}
