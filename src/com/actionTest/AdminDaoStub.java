package com.actionTest;

import com.bean.*;


public class AdminDaoStub {
		
	public String CheckLogin(String username, String password){
		String id = null;
		
		if(username=="Admin1"&&password=="678138")
		{
			id="1000001";
		}
		
		return id;
	}
	
	public boolean CheckPassword(String id, String password){
		if(id=="1000001"&&password=="678138")
			return true;
		else
			return false;
	}
	
	public AdminBean GetBean(int id){
		return new AdminBean();
	}
	
	public void Update(AdminBean cnbean){
		
	}
}
