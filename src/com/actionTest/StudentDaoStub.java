package com.actionTest;

import com.bean.AdminBean;
import com.bean.StudentBean;

public class StudentDaoStub {
	public String CheckLogin(String username, String password){
		String id = null;
		
		if(username=="Student1"&&password=="123456")
		{
			id="3000001";
		}
		
		return id;
	}
	
	public boolean CheckPassword(String id, String password){
		if(id=="3000001"&&password=="123456")
			return true;
		else
			return false;
	}
	
	public StudentBean GetBean(int id){
		return new StudentBean();
	}
	
	public void Update(StudentBean cnbean){
		
	}
}
