package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bean.BuildingBean;
import com.dao.BuildingDao;

public class BuildingDaoTest_GetBean {

	@Test//(expected = SQLException.class)
	public void DAO_BUILDING_GETBEAN_001() {
		BuildingBean testBuilding=new BuildingDao().GetBean(10);
		
		assertEquals(10, testBuilding.getBuilding_ID());
		assertEquals("Building10", testBuilding.getBuilding_Name());
		assertEquals("Pengyuan", testBuilding.getBuilding_Introduction());
	}
	
	@Test//(expected = SQLException.class)
	public void DAO_BUILDING_GETBEAN_002() {
		BuildingBean testBuilding=new BuildingDao().GetBean(20);
		
		assertEquals(0, testBuilding.getBuilding_ID());
		assertEquals(null, testBuilding.getBuilding_Name());
		assertEquals(null, testBuilding.getBuilding_Introduction());
	}
	
	@Test//(expected = SQLException.class)
	public void DAO_BUILDING_GETBEAN_003() {
		BuildingBean testBuilding=new BuildingDao().GetBean(-1);
		
		assertEquals(0, testBuilding.getBuilding_ID());
		assertEquals(null, testBuilding.getBuilding_Name());
		assertEquals(null, testBuilding.getBuilding_Introduction());
	}
}
