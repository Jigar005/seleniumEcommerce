package com.apex.customer.service.core;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.apex.customer.service.entity.Customer;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JSONParserUtil {

	public static String getcustomerJSONMessage(Customer customer) {
		Gson gson = new Gson();
		String jsonInString = gson.toJson(customer);
		return jsonInString;
		}

	public static Customer getCustomerStringMessage(String jsonString) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Customer customer = gson.fromJson(new FileReader("D:\\file.json"), Customer.class);
		
		return customer;
	}

}
