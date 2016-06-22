package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dao.StudentDao;


@RunWith(Parameterized.class)
public class StudentDaoTest_CheckPassword {

	private String id;
	private String password;
	private boolean result;
	
	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"3000001","123456",true} ,
        {"3000001", "1234567",false} ,
        {"2000001", "137823",false} ,
        {"3000002", "329493",false} ,
        {"3000001", null,false} ,
        {null, "123456",false} ,
        {null, null,false} ,
       } );
   } 
	
	public StudentDaoTest_CheckPassword(String id,String password,boolean result)
	{
		this.id=id;
		this.password=password;
		this.result=result;
	}

	@Test//(expected = SQLException.class)
	public void testCheckLogin() {
		assertEquals(this.result, new StudentDao().CheckPassword(this.id, this.password));
	}

}
