package com.apex.customer.service.entity;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CUSTOMER")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
@XmlElement(name = "ID")
	private int id;
@XmlElement(name = "FIRSTNAME")
	private String firstName;
@XmlElement(name = "LASTNAME")
	private String lastName;
@XmlElement(name = "STREET")
	private String street;
@XmlElement(name = "CITY")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public Customer(int id, String firstName, String lastName, String street, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
	}

}
