package com.mybusinessproject.dao.customerdao;

import java.util.List;

import com.mybusinessproject.entity.CustomerInfo;
import com.mybusinessproject.entity.RetailerInfo;

public interface CustomerDao {
	public void registerCustomer(CustomerInfo customerInfo);
	
	
	public List<CustomerInfo> logincheckcustomer(CustomerInfo customerInfo);
	
	
	
	public List<RetailerInfo> getallRetailer();
}
