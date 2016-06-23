package com.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.dao.*;
import com.bean.*;

public class BuildingDaoTest_GetList {

	@Test
	public void DAO_BUILDING_GETLIST_001() {
		
		List<BuildingBean> result;
		result=new BuildingDao().GetList("Building_ID=10","Building_Name");
		
		assertEquals(10,result.get(0).getBuilding_ID());
		assertEquals("Building10",result.get(0).getBuilding_Name());
		assertEquals("Pengyuan",result.get(0).getBuilding_Introduction());
	}
	
	@Test
	public void DAO_BUILDING_GETLIST_002() {
		
		List<BuildingBean> result;
		result=new BuildingDao().GetList("Building_ID=20","Building_Name");
		
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void DAO_BUILDING_GETLIST_003() {
		
		List<BuildingBean> result;
		result=new BuildingDao().GetList("Building_ID=-1","Building_Name");
		
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void DAO_BUILDING_GETLIST_004() {
		
		List<BuildingBean> result;
		result=new BuildingDao().GetList("Building_Name='Building10'","Building_ID");
		
		assertEquals(10,result.get(0).getBuilding_ID());
		assertEquals("Building10",result.get(0).getBuilding_Name());
		assertEquals("Pengyuan",result.get(0).getBuilding_Introduction());
	}
	
	@Test
	public void DAO_BUILDING_GETLIST_0055() {
		
		List<BuildingBean> result;
		result=new BuildingDao().GetList("Building_Name='Building20'","Building_ID");
		
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void DAO_BUILDING_GETLIST_006() {
		
		List<BuildingBean> result;
		result=new BuildingDao().GetList("Building_Name=null","Building_ID");
		
		assertTrue(result.isEmpty());
	}

}
