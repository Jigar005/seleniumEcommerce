package com.apex.customer.service.core;

import com.apex.customer.service.entity.Customer;
import com.google.gson.Gson;

public class JSONParserUtil {

	public static String getcustomerJSONMessage(Customer customer) {
		Gson gson = new Gson();
		String jsonInString = gson.toJson(customer);
		return jsonInString;
		}

	public static Customer getCustomerStringMessage(String jsonString) {
		return null;
	}

}