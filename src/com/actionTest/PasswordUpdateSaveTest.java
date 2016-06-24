package com.actionTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.action.*;

@RunWith(Parameterized.class)
public class PasswordUpdateSaveTest {

	private String id;
	private String type;

	private String password;
	private String password2;
	private String msg;
	
	private String output;
	
	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"1000001","1","678138","768138","修改成功",null} ,
        {"1000001","1","678137","768138","用户名或者密码错误","input"} ,
        {"2000001","2","137823","317823","修改成功",null} ,
        {"2000001","2","137824","317823","用户名或者密码错误","input"} ,
        {"3000001","3","123456","213456","修改成功",null} ,
        {"3000001","3","1234567","213456","用户名或者密码错误","input"} ,
        {null,"1","678138","768138","用户名或者密码错误","input"} ,
        {"1000001",null,"678138","768138","请重新登录",null} ,
       } );
   } 
	
	@Test
	public void ACTION_PASSWORDUPDATESAVE() throws Exception {
		PasswordUpdateSave test=new PasswordUpdateSave();
		test.setPassword(password);
		test.setPassword2(password2);
		assertEquals(output,test.executeForUnitTest(type, id));
		assertEquals(msg,test.getMsg());
	}
	
	@Test
	public void ACTION_PASSWORDUPDATESAVE_INTEGRATION() throws Exception {
		PasswordUpdateSave test=new PasswordUpdateSave();
		test.setPassword(password);
		test.setPassword2(password2);
		assertEquals(output,test.executeForIntegrationTest(type, id));
		assertEquals(msg,test.getMsg());
	}

	public PasswordUpdateSaveTest(String id, String type, String password,
			String password2, String msg, String output) {
		super();
		this.id = id;
		this.type = type;
		this.password = password;
		this.password2 = password2;
		this.msg = msg;
		this.output = output;
	}



	



}
