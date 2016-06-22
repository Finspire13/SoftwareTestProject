package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dao.AdminDao;


@RunWith(Parameterized.class)
public class AdminDaoTest_CheckPassword {

	private String id;
	private String password;
	private boolean result;
	
	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"1000001","678138",true} ,
        {"1000001", "678137",false} ,
        {"2000001", "137823",false} ,
        {"1000002", "678138",false} ,
        {"1000001", null,false} ,
        {null, "678138",false} ,
        {null, null,false} ,
       } );
   } 
	
	public AdminDaoTest_CheckPassword(String id,String password,boolean result)
	{
		this.id=id;
		this.password=password;
		this.result=result;
	}

	@Test//(expected = SQLException.class)
	public void testCheckLogin() {
		assertEquals(this.result, new AdminDao().CheckPassword(this.id, this.password));
	}

}
