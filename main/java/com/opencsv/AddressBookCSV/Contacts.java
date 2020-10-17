package com.opencsv.AddressBookCSV;

import com.opencsv.bean.CsvBindByName;

public class Contacts {
	@CsvBindByName
	private String lastName;
	@CsvBindByName(column = "firstName")
	private String firstName;
	@CsvBindByName(column = "addressCity")
	private String addressCity;
	@CsvBindByName(column = "state")
	private String State;
	@CsvBindByName(column = "phoneNo")
	private long phoneNumber;
	@CsvBindByName(column = "email", required = true)
	private String email;
	@CsvBindByName(column = "zip")
	private long zip;
	@CsvBindByName(column = "city")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getaddressCity() {
		return addressCity;
	}

	public void setaddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public long getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getzip() {
		return zip;
	}

	public void setzip(long zip) {
		this.zip = zip;
	}

	public Contacts(String firstName, String lastName, String addressCity, String city, String State, long phoneNumber,
			String email, long zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressCity = addressCity;
		this.city = city;
		this.State = State;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Contacts [lastName=" + lastName + ", firstName=" + firstName + ", addressCity=" + addressCity
				+ ", State=" + State + ", phoneNumber=" + phoneNumber + ", email=" + email + ", zip=" + zip + ", city="
				+ city + "]";
	}
}
