package com.thaya.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thaya.vendor.entities.Vendor;
import com.thaya.vendor.service.VendorService;

@Controller
public class VendorController {

	@Autowired
	VendorService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "createVendor";
	}
	
	@RequestMapping("/saveVend")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		
		service.saveVendor(vendor);
		String msg = "Vendor is created with ID: "+vendor.getId();
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {
		
		List<Vendor> vendors = service.getVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		
		Vendor vendor = service.getVendorById(id);
		service.deleteVendor(vendor);
		List<Vendor> vendors = service.getVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/showEdit")
	public String showEdit(@RequestParam("id") int id, ModelMap modelMap) {
		
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "editVendor";
	}
	
	@RequestMapping("/updateVend")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		
		service.updateVendor(vendor);
		List<Vendor> vendors = service.getVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	
	
	
	
	
	
	
	
	
}
