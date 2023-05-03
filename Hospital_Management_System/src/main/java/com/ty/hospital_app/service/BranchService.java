package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Branch;

public class BranchService
{
	public void saveBranch(int hid,Branch branch)
	{
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		Branch branch2=branchDaoImp.saveBranch(hid, branch);
		if(branch2!=null)
		{
			System.out.println("Branch data saved");
		}
		else
		{
			System.out.println("unfortunately Branch data not saved");
		}
	}
	
	public Branch getBranchById(int bid)
	{
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		
		Branch branch2=branchDaoImp.getBranch(bid);
		if(branch2!=null)
		{
			return branch2;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteHospital(int bid)
	{
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		
		boolean flag=branchDaoImp.deleteBranch(bid);
		if(flag)
		{
			System.out.println("Branch data deleted successfully");
		}
		else
		{
			System.out.println("Branch data not found");
		}
	}
	
	public Branch updateBranch(int bid,Branch branch)
	{
        BranchDaoImp branchDaoImp=new BranchDaoImp();
		
		Branch branch2=branchDaoImp.updateBranch(bid, branch);
		if(branch2!=null)
		{
			return branch;
		}
		else
		{
			return null;
		}
	}

}
