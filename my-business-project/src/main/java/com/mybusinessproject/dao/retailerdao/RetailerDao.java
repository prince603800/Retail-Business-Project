package com.mybusinessproject.dao.retailerdao;

import java.util.List;

import com.mybusinessproject.entity.RetailerInfo;

public interface RetailerDao {
	
	public void registerRetailer(RetailerInfo retailerInfo);
	public List<RetailerInfo> logincheckretailer(RetailerInfo retailerInfo);
}
