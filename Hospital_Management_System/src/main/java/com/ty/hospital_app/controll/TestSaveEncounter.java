package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.EncounterService;

public class TestSaveEncounter 
{
	public static void main(String[] args) 
	{
		Encounter encounter=new Encounter();
		Branch branch=new Branch();
		EncounterService encservice=new EncounterService();
		encounter.setBranch(branch);
		encounter.setEncounter_reason("severe fever");
		encounter.setDateofjoin("10/02/23");
		encounter.setDateofdischarge("17/02/23");
		
		
	}

}
