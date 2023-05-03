package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.UserDaoImp;
import com.ty.hospital_app.dto.User;

public class UserService 
{
	public void saveUser(User user) 
	{
		UserDaoImp udaoImp=new UserDaoImp();
		User user1=udaoImp.saveUser(user);
		if(user1!=null)
		{
			System.out.println("User data saved successfully");
		}
		else
		{
			System.out.println("User data not saved");
		}
	}
	
	public User getUserById(int uid)
	{
		UserDaoImp udaoImp=new UserDaoImp();
		User user1=udaoImp.getUser(uid);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}

	public void deleteUser(int uid)
	{
		UserDaoImp udaoImp=new UserDaoImp();
		boolean flag=udaoImp.deleteUser(uid);
		if(flag)
		{
			System.out.println("User data deleted successfully");
		}
		else
		{
			System.out.println("User data not found");
		}

	}
	
	public User updateUser(int uid, User user)
	{
		UserDaoImp udaoImp=new UserDaoImp();
		User user1=udaoImp.updateUser(uid, user);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}

	}
}
