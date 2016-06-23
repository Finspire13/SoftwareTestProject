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
        {"系统管理员","Admin1","678138",null,"success"} ,
        {"系统管理员","Admin1","678137","用户名或者密码错误","input"} ,
        {"系统管理员","Admin2","678138","用户名或者密码错误","input"} ,
        {"系统管理员","Teacher1","137823","用户名或者密码错误","input"} ,
        {"系统管理员","Admin1",null,"用户名或者密码错误","input"} ,
        {"系统管理员",null,"678138","用户名或者密码错误","input"} ,
        {"系统管理员",null,null,"用户名或者密码错误","input"} ,
        
        {"楼宇管理员","Teacher1","137823",null,"success"} ,
        {"楼宇管理员","Teacher1","137825","用户名或者密码错误","input"} ,
        {"楼宇管理员","Teacher2","137823","用户名或者密码错误","input"} ,
        {"楼宇管理员","Admin1","678138","用户名或者密码错误","input"} ,
        {"楼宇管理员","Teacher1",null,"用户名或者密码错误","input"} ,
        {"楼宇管理员",null,"137823","用户名或者密码错误","input"} ,
        {"楼宇管理员",null,null,"用户名或者密码错误","input"} ,
        
        {"学生","Student1","123456",null,"success"} ,
        {"学生","Student1","123457","用户名或者密码错误","input"} ,
        {"学生","Student2","123456","用户名或者密码错误","input"} ,
        {"学生","Teacher1","137823","用户名或者密码错误","input"} ,
        {"学生","Student1",null,"用户名或者密码错误","input"} ,
        {"学生",null,"123456","用户名或者密码错误","input"} ,
        {"学生",null,null,"用户名或者密码错误","input"} ,
        
        {null,"Student1","123456","身份类型错误","input"} ,
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
