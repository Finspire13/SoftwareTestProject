package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dao.TeacherDao;


@RunWith(Parameterized.class)
public class TeacherDaoTest_CheckPassword {

	private String id;
	private String password;
	private boolean result;
	
	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"2000001","137823",true} ,
        {"2000001", "137825",false} ,
        {"3000001", "123456",false} ,
        {"2000002", "137823",false} ,
        {"2000001", null,false} ,
        {null, "137823",false} ,
        {null, null,false} ,
       } );
   } 
	
	public TeacherDaoTest_CheckPassword(String id,String password,boolean result)
	{
		this.id=id;
		this.password=password;
		this.result=result;
	}

	@Test//(expected = SQLException.class)
	public void testCheckLogin() {
		assertEquals(this.result, new TeacherDao().CheckPassword(this.id, this.password));
	}

}
