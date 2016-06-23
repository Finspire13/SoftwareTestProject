package com.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.bean.BuildingBean;
import com.bean.DomitoryBean;
import com.dao.BuildingDao;
import com.dao.DomitoryDao;

public class DomitoryDaoTest_GetList {

	@Test
	public void DAO_DOMITORY_GETLIST_001() {
		
		List<DomitoryBean> result;
		result=new DomitoryDao().GetList("Domitory_ID=10622","Domitory_Name");
		
		assertEquals(10622,result.get(0).getDomitory_ID());
		assertEquals(10,result.get(0).getDomitory_BuildingID());
		assertEquals("abc",result.get(0).getDomitory_Name());
		assertEquals("female",result.get(0).getDomitory_Type());
		assertEquals("622",result.get(0).getDomitory_Number());
		assertEquals("2020102",result.get(0).getDomitory_Tel());
		assertEquals("Building10",result.get(0).getBuilding_Name());
	}
	
	@Test
	public void DAO_DOMITORY_GETLIST_002() {
		
		List<DomitoryBean> result;
		result=new DomitoryDao().GetList("Domitory_ID=10702","Domitory_Name");
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void DAO_DOMITORY_GETLIST_003() {
		
		List<DomitoryBean> result;
		result=new DomitoryDao().GetList("Domitory_ID=null","Domitory_Name");
		assertTrue(result.isEmpty());
	}

}
