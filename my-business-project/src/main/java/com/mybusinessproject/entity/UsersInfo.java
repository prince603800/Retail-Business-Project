package com.mybusinessproject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "users_info")
public class UsersInfo {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		
		@Column(name = "fname")
		private String fname;
		
		@Column(name = "lname")
		private String lname;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "phoneNo")
		private String phoneNo;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "userImpData_id")
		private UsersImpData userImpData;
				
		public UsersInfo() {}

		public UsersInfo(int id, String fname, String lname, String address, String phoneNo, UsersImpData userImpData) {
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.address = address;
			this.phoneNo = phoneNo;
			this.userImpData = userImpData;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public UsersImpData getUserImpData() {
			return userImpData;
		}

		public void setUserImpData(UsersImpData userImpData) {
			this.userImpData = userImpData;
		}

		@Override
		public String toString() {
			return "UsersInfo [id=" + id + ", fname=" + fname + ", lname=" + lname + ", address=" + address
					+ ", phoneNo=" + phoneNo + ", userImpData=" + userImpData + "]";
		}
		
		
		
		
	}


