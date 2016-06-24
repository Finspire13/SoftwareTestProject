package com.actionTest;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<StudentBean> GetList(String strwhere,String strorder){
		StudentBean testStudent=new StudentBean();
		List<StudentBean> list=new ArrayList<StudentBean>();
		//System.out.println("List:"+strwhere);
		if(strwhere.equals("Student_State='in' and Building_ID=10 and Student_Class='1' and Domitory_ID='abc'")){
			list.add(testStudent);
			System.out.println("!!!");
		}
		if(strwhere.equals("Student_State='in' and Building_ID=10 and Student_Name='Jin Xin' and Domitory_ID='abc'")){
			list.add(testStudent);
			System.out.println("!!!");
		}
		if(strwhere.equals("Student_State='in' and Building_ID=10 and Student_Username='Student1' and Domitory_ID='abc'")){
			list.add(testStudent);
			System.out.println("!!!");
		}
		if(strwhere.equals("Student_State='in' and Building_ID=10 and Domitory_ID='abc'")){
			list.add(testStudent);
			System.out.println("!!!");
		}
		return list;
	}
	
	public void Update(StudentBean cnbean){
		
	}
}
