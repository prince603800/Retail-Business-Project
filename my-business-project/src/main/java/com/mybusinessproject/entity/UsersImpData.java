package com.mybusinessproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class UsersImpData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "registrationNO")
	private int registrationNo;
	
	@Column(name = "user_type")
	private String user_type;
	
	@Column(name = "psword1")
	private String psword1;
	
	@Column(name = "psword2")
	private String psword2;
	
	public UsersImpData() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
	public int getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getPsword1() {
		return psword1;
	}

	public void setPsword1(String psword1) {
		this.psword1 = psword1;
	}

	public String getPsword2() {
		return psword2;
	}

	public void setPsword2(String psword2) {
		this.psword2 = psword2;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public UsersImpData(int id, String user_email, int registrationNo, String user_type, String psword1,
			String psword2) {
		this.id = id;
		this.user_email = user_email;
		this.registrationNo = registrationNo;
		this.user_type = user_type;
		this.psword1 = psword1;
		this.psword2 = psword2;
	}

	@Override
	public String toString() {
		return "UsersImpData [id=" + id + ", user_email=" + user_email + ", registrationNo=" + registrationNo
				+ ", user_type=" + user_type + ", psword1=" + psword1 + ", psword2=" + psword2 + "]";
	}

	

	
	
}
