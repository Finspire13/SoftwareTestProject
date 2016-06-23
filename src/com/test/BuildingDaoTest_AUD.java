package com.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.dao.*;
import com.bean.*;

public class BuildingDaoTest_AUD {

	@Test
	public void DAO_BUILDING_ADD_001() throws Exception {
		BuildingBean testBuilding=new BuildingBean();
		testBuilding.setBuilding_ID(10);
		testBuilding.setBuilding_Name("Building10");
		testBuilding.setBuilding_Introduction("Pengyuan");
		
		new BuildingDao().Add(testBuilding);
	}
	
	@Test(expected = Exception.class)
	public void DAO_BUILDING_ADD_002() throws Exception {
		BuildingBean testBuilding=new BuildingBean();
		testBuilding.setBuilding_ID(-1);
		testBuilding.setBuilding_Name(null);
		testBuilding.setBuilding_Introduction(null);
		
		new BuildingDao().Add(testBuilding);
	}
	
	
	@Test
	public void DAO_BUILDING_UPDATE_001() throws Exception{
		BuildingBean testBuilding=new BuildingBean();
		testBuilding.setBuilding_ID(10);
		testBuilding.setBuilding_Name("Building100");
		testBuilding.setBuilding_Introduction("Jiading");
		
		new BuildingDao().Update(testBuilding);
	}
	
	@Test(expected = Exception.class)
	public void DAO_BUILDING_UPDATE_002() throws Exception{
		BuildingBean testBuilding=new BuildingBean();
		testBuilding.setBuilding_ID(-1);
		testBuilding.setBuilding_Name(null);
		testBuilding.setBuilding_Introduction(null);
		
		new BuildingDao().Update(testBuilding);
	}
	
	
	@Test
	public void DAO_BUILDING_DELETE_001() throws Exception{
		new BuildingDao().Delete("Building_ID=10");
	}
	
	@Test
	public void DAO_BUILDING_DELETE_002() throws Exception{
		new BuildingDao().Delete("Building_ID=20");
	}
	
	@Test(expected = Exception.class)
	public void DAO_BUILDING_DELETE_003() throws Exception{
		new BuildingDao().Delete(null);
	}

}
