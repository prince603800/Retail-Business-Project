package com.mybusinessproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "items")
public class Items {

	@Id
	@GenericGenerator(name = "id",strategy = "increment")
	private int id;
	
	@Column(name = "itemname")
	private String itemname;
	
	@Column(name = "itemsize")
	private String itemsize;
	
	@Column(name = "retailerid")
	private int retailerid;

	public Items() {}
	
	
	public Items(int id, String itemname, String itemsize, int retailerid) {
		this.id = id;
		this.itemname = itemname;
		this.itemsize = itemsize;
		this.retailerid = retailerid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}



	public String getItemsize() {
		return itemsize;
	}


	public void setItemsize(String itemsize) {
		this.itemsize = itemsize;
	}


	public int getRetailerid() {
		return retailerid;
	}

	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemname=" + itemname + ", type=" + itemsize + ", retailername=" + retailerid + "]";
	}
	
}
