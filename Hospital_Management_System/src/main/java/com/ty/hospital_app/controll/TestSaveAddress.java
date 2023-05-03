package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.AddressService;

public class TestSaveAddress
{
	public static void main(String[] args) 
	{
		Address address=new Address();
		AddressService adservice=new AddressService();
		address.setCountry("India");
		address.setState("karnataka");
		address.setStreet("sajjanrao street");
		address.setPincode(561012);
		adservice.saveAddress(1, address);
		
	}

}
