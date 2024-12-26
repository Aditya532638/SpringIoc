package com.example.demoIOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration

public class DemoIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIocApplication.class, args);
		System.err.println("running");
		}

		@Bean("retailer")
		public Customer getNameRetail() {
			
			Customer cc = new Customer();
			cc.getCustomerName();
			System.out.println(cc.customerId=101);
			System.out.println("I am Retail Customer");
			
			return cc;}
			
			
//			
//			@Bean("online")
//			public Customer getNameOnline() {
//				Customer cc = new Customer();
//				cc.getCustomerName();
//				System.out.println(cc.customerId=102);
//				System.out.println("I am online Customer");
//				return cc;
		
		
		
//	}

}
