package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bean.DomitoryBean;
import com.dao.DomitoryDao;

public class DomitoryDaoTest_AUD {

	@Test
	public void DAO_DOMITORY_ADD_001() throws Exception {
		DomitoryBean testDomitory=new DomitoryBean();
		testDomitory.setDomitory_ID(10622);
		testDomitory.setDomitory_BuildingID(10);
		testDomitory.setDomitory_Name("abc");
		testDomitory.setDomitory_Type("female");
		testDomitory.setDomitory_Number("622");
		testDomitory.setDomitory_Tel("2020102");
		testDomitory.setBuilding_Name("Building10");

		
		new DomitoryDao().Add(testDomitory);
	}
	
	@Test(expected = Exception.class)
	public void DAO_DOMITORY_ADD_002() throws Exception {
		DomitoryBean testDomitory=new DomitoryBean();
		testDomitory.setDomitory_ID(-1);
		testDomitory.setDomitory_BuildingID(-1);
		testDomitory.setDomitory_Name(null);
		testDomitory.setDomitory_Type(null);
		testDomitory.setDomitory_Number(null);
		testDomitory.setDomitory_Tel(null);
		testDomitory.setBuilding_Name(null);
		
		new DomitoryDao().Add(testDomitory);
	}
	
	
	@Test
	public void DAO_DOMITORY_UPDATE_001() throws Exception{
		DomitoryBean testDomitory=new DomitoryBean();
		testDomitory.setDomitory_ID(10622);
		testDomitory.setDomitory_BuildingID(10);
		testDomitory.setDomitory_Name("abc");
		testDomitory.setDomitory_Type("female");
		testDomitory.setDomitory_Number("622");
		testDomitory.setDomitory_Tel("2020102");
		testDomitory.setBuilding_Name("Building10");
		
		new DomitoryDao().Update(testDomitory);
	}
	
	@Test(expected = Exception.class)
	public void DAO_DOMITORY_UPDATE_002() throws Exception{
		DomitoryBean testDomitory=new DomitoryBean();
		testDomitory.setDomitory_ID(-1);
		testDomitory.setDomitory_BuildingID(-1);
		testDomitory.setDomitory_Name(null);
		testDomitory.setDomitory_Type(null);
		testDomitory.setDomitory_Number(null);
		testDomitory.setDomitory_Tel(null);
		testDomitory.setBuilding_Name(null);
		
		new DomitoryDao().Update(testDomitory);
	}
	
	
	@Test
	public void DAO_DOMITORY_DELETE_001() throws Exception{
		new DomitoryDao().Delete("Domitory_ID=10622");
	}
	
	@Test
	public void DAO_DOMITORY_DELETE_002() throws Exception{
		new DomitoryDao().Delete("Domitory_ID=10702");
	}
	
	@Test(expected = Exception.class)
	public void DAO_DOMITORY_DELETE_003() throws Exception{
		new DomitoryDao().Delete(null);
	}

}
