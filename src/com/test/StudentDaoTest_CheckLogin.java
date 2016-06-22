package com.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dao.*;

@RunWith(Parameterized.class)
public class StudentDaoTest_CheckLogin {

	private String username;
	private String password;
	private String result_id;
	
	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"Student1","123456","3000001"} ,
        {"Student1", "1234567",null} ,
        {"Admin1", "678138",null} ,
        {"Student2", "123456",null} ,
        {"Student1", null,null} ,
        {null, "123456",null} ,
        {null, null,null} ,
       } );
   } 
	
	public StudentDaoTest_CheckLogin(String username,String password,String result_id)
	{
		this.username=username;
		this.password=password;
		this.result_id=result_id;
	}

	@Test//(expected = SQLException.class)
	public void testCheckLogin() {
		assertEquals(this.result_id, new StudentDao().CheckLogin(this.username, this.password));
	}

}
