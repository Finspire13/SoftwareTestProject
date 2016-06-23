package com.actionTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.action.GoLogin;

@RunWith(Parameterized.class)
public class GologinTest {
	
	private String type;
	private String username;
	private String password;
	private String msg;
	private String output;
	
	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"ϵͳ����Ա","Admin1","678138",null,"success"} ,
        {"ϵͳ����Ա","Admin1","678137","�û��������������","input"} ,
        {"ϵͳ����Ա","Admin2","678138","�û��������������","input"} ,
        {"ϵͳ����Ա","Teacher1","137823","�û��������������","input"} ,
        {"ϵͳ����Ա","Admin1",null,"�û��������������","input"} ,
        {"ϵͳ����Ա",null,"678138","�û��������������","input"} ,
        {"ϵͳ����Ա",null,null,"�û��������������","input"} ,
        
        {"¥�����Ա","Teacher1","137823",null,"success"} ,
        {"¥�����Ա","Teacher1","137825","�û��������������","input"} ,
        {"¥�����Ա","Teacher2","137823","�û��������������","input"} ,
        {"¥�����Ա","Admin1","678138","�û��������������","input"} ,
        {"¥�����Ա","Teacher1",null,"�û��������������","input"} ,
        {"¥�����Ա",null,"137823","�û��������������","input"} ,
        {"¥�����Ա",null,null,"�û��������������","input"} ,
        
        {"ѧ��","Student1","123456",null,"success"} ,
        {"ѧ��","Student1","123457","�û��������������","input"} ,
        {"ѧ��","Student2","123456","�û��������������","input"} ,
        {"ѧ��","Teacher1","137823","�û��������������","input"} ,
        {"ѧ��","Student1",null,"�û��������������","input"} ,
        {"ѧ��",null,"123456","�û��������������","input"} ,
        {"ѧ��",null,null,"�û��������������","input"} ,
        
        {null,"Student1","123456","������ʹ���","input"} ,
       } );
   } 
	
	public GologinTest(String type,String username,String password,String msg,String output)
	{
		this.type=type;
		this.username=username;
		this.password=password;
		this.msg=msg;
		this.output=output;
	}

	@Test
	public void ACTION_GOLOGIN() throws Exception {
		GoLogin testGoLogin=new GoLogin();
		testGoLogin.setType(type);
		testGoLogin.setUsername(username);
		testGoLogin.setPassword(password);
		
		assertEquals(this.output,testGoLogin.executeForUnitTest());
		assertEquals(this.msg,testGoLogin.getMsg());
	}

}
