package com.jsp.bean;

public class contactus {
	
	private String fullname;
	private String email;
	private String phonenumber;
	private String messgae;
	
	public contactus(String fullname, String email, String phonenumber, String messgae) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.messgae = messgae;
	}

	public contactus() {
		super();
		// TODO Auto-generated constructor stub
	}







	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String message) {
		this.messgae = message;
	}
	
	
	
	

}
