package com.mybusinessproject.service.retailerservice;

import java.util.List;

import com.mybusinessproject.entity.RetailerInfo;

public interface RetailerService {
    
	public void registerRetailer(RetailerInfo retailerInfo);
	public List<RetailerInfo> logincheckretaile(RetailerInfo retailerInfo);
}
