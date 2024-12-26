package com.example.demoIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MerchantController {
	
	@Autowired               //use to create object of a class
	
	@Qualifier("retailer") //use whenever the Bean annotation is used
	                    
//	@Qualifier("Online")    //use whenever the Bean annotation is used
	
	
	Customer cc;
	
	@Value("${merchantId}")
	int merchantId;
	
	
	@GetMapping("/IOC")
	public Customer Name() {
		
		System.out.println("MerchantId "+merchantId);
		cc.getCustomerName();
		
		return cc;
		
	}
	
	

}
