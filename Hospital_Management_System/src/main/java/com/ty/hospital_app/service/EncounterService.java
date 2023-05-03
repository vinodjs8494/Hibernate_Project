package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService 
{
	public void saveEncounter(int bid,Encounter encounter)
	{
		EncounterDaoImp daoimp=new EncounterDaoImp();

		Encounter encounter1=daoimp.saveEncounter(bid, encounter);
		if(encounter1!=null)
		{
			System.out.println("Encounter data saved successfully");
		}
		else
		{
			System.out.println("unfortunately encounter data not saved");
		}
	}

	public Encounter getEncounterById(int eid)
	{
		EncounterDaoImp daoimp=new EncounterDaoImp();
		Encounter encounter1=daoimp.getEncounter(eid);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}

	public void deleteEncounter(int eid)
	{
		EncounterDaoImp daoimp=new EncounterDaoImp();

		boolean flag=daoimp.deleteEncounter(eid);
		if(flag)
		{
			System.out.println("Encounter data deleted successfully");
		}
		else
		{
			System.out.println("Encounter data not found");
		}
	}
	
	public Encounter updateEncounter(int eid,Encounter encounter)
	{
		EncounterDaoImp daoimp=new EncounterDaoImp();
		Encounter encounter1=daoimp.updateEncounter(eid, encounter);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
		
	}

}
