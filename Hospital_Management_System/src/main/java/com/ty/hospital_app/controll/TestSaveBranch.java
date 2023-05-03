package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.BranchService;

public class TestSaveBranch 
{
	public static void main(String[] args, Hospital Hospital, Address address) 
	{
		Branch branch2=new Branch();
		Address address1=new Address();

		BranchService bservice=new BranchService();
		branch2.setBranch_name("basavangudi");
		branch2.setBranch_phoneno(8067854563l);
		branch2.setBranch_email("newjayadevbasavangudi@gmail.com");
		//branch2.setHospital(hospital);
		//branch2.setAddress(address1);
		bservice.saveBranch(1, branch2);
		
	}

}
