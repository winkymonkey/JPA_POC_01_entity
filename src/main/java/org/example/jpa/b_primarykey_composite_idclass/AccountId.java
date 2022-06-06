package org.example.jpa.b_primarykey_composite_idclass;

import java.io.Serializable;


public class AccountId implements Serializable {

	private static final long serialVersionUID = -442650859280537797L;

	private String accountNumber;
	private String accountType;
	
	
	// GETTERS, SETTERS
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	// EQUALS & HASHCODE
	public boolean equals(Object obj) {
		// implement
		return true;
	}
	public int hashCode() {
		// implement
		return 0;
	}

}
