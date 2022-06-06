package org.example.jpa.b_primarykey_composite_idclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "T_EMPL")
@IdClass(AccountId.class)
public class Account {
	
	@Id
	private String accountNumber;
	
	@Id
	private String accountType;
	
	@Column(name = "BALANCE")
	private int balance;
	
	@Column(name = "AADHAR")
	private int aadhar;
	
	// GETTER, SETTER
	
}
