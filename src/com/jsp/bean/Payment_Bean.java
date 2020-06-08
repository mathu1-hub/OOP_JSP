package com.jsp.bean;

public class Payment_Bean {
	
	
	private int id;
	private String fullName;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String cardname;
	private String cardnumber;
	private String expmonth;
	private String expyear;
	private String cvv;
	
	
	public Payment_Bean(int id,String fullName, String email, String address, String city, String state, String zip,
			String cardname, String cardnumber, String expmonth, String expyear, String cvv) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cardname = cardname;
		this.cardnumber = cardnumber;
		this.expmonth = expmonth;
		this.expyear = expyear;
		this.cvv = cvv;
	}




	public Payment_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getCardname() {
		return cardname;
	}


	public void setCardname(String cardname) {
		this.cardname = cardname;
	}


	public String getCardnumber() {
		return cardnumber;
	}


	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}


	public String getExpmonth() {
		return expmonth;
	}


	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}


	public String getExpyear() {
		return expyear;
	}


	public void setExpyear(String expyear) {
		this.expyear = expyear;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
	

}
