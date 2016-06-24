package com.actionTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.action.*;
import com.actionTest.*;

public class AdminLogTest {

	@Test
	public void ACTION_ADMINLOG_001() throws Exception {
		AdminLog test=new AdminLog();
		test.setBuildingID("10");
		test.executeForUnitTest();
		assertFalse(test.getDomitorylist().isEmpty());
	}
	
	@Test
	public void ACTION_ADMINLOG_002() throws Exception {
		AdminLog test=new AdminLog();
		test.setBuildingID("20");
		test.executeForUnitTest();
		assertTrue(test.getDomitorylist().isEmpty());
	}
	     
	@Test
	public void ACTION_ADMINLOG_003() throws Exception {
		AdminLog test=new AdminLog();
		test.setBuildingID(null);
		test.executeForUnitTest();
		assertTrue(test.getDomitorylist().isEmpty());
	}
	
	@Test
	public void ACTION_ADMINLOG_INTEGRATION_001() throws Exception {
		AdminLog test=new AdminLog();
		test.setBuildingID("10");
		test.executeForIntegrationTest();
		assertFalse(test.getDomitorylist().isEmpty());
	}
	
	@Test
	public void ACTION_ADMINLOG_INTEGRATION_002() throws Exception {
		AdminLog test=new AdminLog();
		test.setBuildingID("20");
		test.executeForIntegrationTest();
		assertTrue(test.getDomitorylist().isEmpty());
	}
	
	@Test
	public void ACTION_ADMINLOG_INTEGRATION_003() throws Exception {
		AdminLog test=new AdminLog();
		test.setBuildingID(null);
		test.executeForIntegrationTest();
		assertTrue(test.getDomitorylist().isEmpty());
	}

}
