package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bean.DomitoryBean;
import com.dao.DomitoryDao;

public class DomitoryDaoTest_GetBean {

	@Test//(expected = SQLException.class)
	public void DAO_DOMITORY_GETBEAN_001() {
		DomitoryBean testDomitory=new DomitoryDao().GetBean(10622);
		
		assertEquals(10622, testDomitory.getDomitory_ID());
		assertEquals(10, testDomitory.getDomitory_BuildingID());
		assertEquals("abc", testDomitory.getDomitory_Name());
		assertEquals("female", testDomitory.getDomitory_Type());
		assertEquals("622", testDomitory.getDomitory_Number());
		assertEquals("2020102", testDomitory.getDomitory_Tel());
		assertEquals("Building10", testDomitory.getBuilding_Name());
	}
	@Test//(expected = SQLException.class)
	public void DAO_DOMITORY_GETBEAN_002() {
		DomitoryBean testDomitory=new DomitoryDao().GetBean(10701);
		
		assertEquals(0, testDomitory.getDomitory_ID());
		assertEquals(0, testDomitory.getDomitory_BuildingID());
		assertEquals(null, testDomitory.getDomitory_Name());
		assertEquals(null, testDomitory.getDomitory_Type());
		assertEquals(null, testDomitory.getDomitory_Number());
		assertEquals(null, testDomitory.getDomitory_Tel());
		assertEquals(null, testDomitory.getBuilding_Name());
	}
	@Test//(expected = SQLException.class)
	public void DAO_DOMITORY_GETBEAN_003() {
		DomitoryBean testDomitory=new DomitoryDao().GetBean(-1);
		
		assertEquals(0, testDomitory.getDomitory_ID());
		assertEquals(0, testDomitory.getDomitory_BuildingID());
		assertEquals(null, testDomitory.getDomitory_Name());
		assertEquals(null, testDomitory.getDomitory_Type());
		assertEquals(null, testDomitory.getDomitory_Number());
		assertEquals(null, testDomitory.getDomitory_Tel());
		assertEquals(null, testDomitory.getBuilding_Name());
	}
}
