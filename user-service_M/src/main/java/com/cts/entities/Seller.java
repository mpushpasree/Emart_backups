package com.cts.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity(name = "Sellers")
public class Seller extends User {
	private String sellerName;
	private String companyName;
	private String aboutCompany;
	private String emailId;
	private String mobileNumber;
	private int GSTIN;
	@Embedded
	private Address address;
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAboutCompany() {
		return aboutCompany;
	}
	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getGSTIN() {
		return GSTIN;
	}
	public void setGSTIN(int gSTIN) {
		GSTIN = gSTIN;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

	
//	@OneToMany(mappedBy = "seller")
//	private List<Item> items;


	
}
