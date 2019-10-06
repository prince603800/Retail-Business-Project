package com.mybusinessproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybusinessproject.entity.ItemModel;
import com.mybusinessproject.entity.Items;
import com.mybusinessproject.entity.RetailerInfo;
import com.mybusinessproject.service.retailerservice.RetailerService;

@Controller
@RequestMapping("/retailerController")
public class RetailerController {

	@Autowired
	RetailerService retailerService;
	
	@GetMapping("/re-page")
	public String retailerRegistrationPage(Model theModel) {
		RetailerInfo retailerInfo = new RetailerInfo();
		theModel.addAttribute(retailerInfo);
		return "retailer-registration";
	}

	
	
	
	@PostMapping("/retailer-registration")
	public String registrationConfirmation(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo) {
		System.out.println(retailerInfo.getFname());
		retailerService.registerRetailer(retailerInfo);
		
		return "redirect:/customerController/login-form";
	}
	
	
	
	
	@PostMapping("/re-login")
	public String rlogin(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo,Model theModel) {
		System.out.println(retailerInfo.getUser_email());
		System.out.println(retailerInfo.getPsword1());
		
		List<RetailerInfo> list = retailerService.logincheckretaile(retailerInfo);
		
		
		
		if(!list.isEmpty()) {
			
			List<Items> itemList = new ArrayList<>();
			itemList.add(new Items(0, "itemname", "itemsize", retailerInfo.getRetailerId()));
			itemList.add(new Items(0, "itemname", "itemsize", retailerInfo.getRetailerId()));
			itemList.add(new Items(0, "itemname", "itemsize", retailerInfo.getRetailerId()));
			itemList.add(new Items(0, "itemname", "itemsize", retailerInfo.getRetailerId()));
			
			ItemModel itemModel = new ItemModel();
			itemModel.setItems(itemList);
			
			theModel.addAttribute("itemList",itemList);
			
			return "retailer-dashboard";
		}
		
		else {
			return "redirect:/customerController/login-form";
	}
	}
	
	@PostMapping("/saveItems")
	public String saveItems(@ModelAttribute ("itemList") List<Items> itemList) {
		
		for (Items temp : itemList) {
			System.out.println(temp.getItemname());
		}
		
		return null;
	}
	
	
}
