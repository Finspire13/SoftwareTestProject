package com.actionTest;

import com.bean.StudentBean;
import com.bean.TeacherBean;

public class TeacherDaoStub {
	public String CheckLogin(String username, String password){
		String id = null;
		
		if(username=="Teacher1"&&password=="137823")
		{
			id="2000001";
		}
		
		return id;
	}
	
	public boolean CheckPassword(String id, String password){
		if(id=="2000001"&&password=="137823")
			return true;
		else
			return false;
	}
	
	public TeacherBean GetBean(int id){
		return new TeacherBean();
	}
	
	public void Update(TeacherBean cnbean){
		
	}
}
