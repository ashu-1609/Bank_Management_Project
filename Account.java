package com.exponent.BA.Model;

public class Account {

	private long accNo;

	private String accHolderName;

	private String panCardNumber;

	private long phoneNumber;

	private long adharNumber;

	private double balance;

	public long getAccNo() {
		return accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", panCardNumber=" + panCardNumber
				+ ", phoneNumber=" + phoneNumber + ", adharNumber=" + adharNumber + ", balance=" + balance + "]";
	}

}
