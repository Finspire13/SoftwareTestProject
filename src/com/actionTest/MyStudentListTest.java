package com.actionTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bean.DomitoryBean;
import com.bean.StudentBean;
import com.action.*;

@RunWith(Parameterized.class)
public class MyStudentListTest {


	private String building_ID;
	private String searchRow;
	private String searchKey;
	private String domitory_ID;
	private boolean isStudentListEmpty;
	private boolean isDomitoryListEmpty;
	private String result;
	
	public MyStudentListTest(String building_ID, String searchRow,
			String searchKey, String domitory_ID, boolean isStudentListEmpty,
			boolean isDomitoryListEmpty, String result) {
		super();
		this.building_ID = building_ID;
		this.searchRow = searchRow;
		this.searchKey = searchKey;
		this.domitory_ID = domitory_ID;
		this.isStudentListEmpty = isStudentListEmpty;
		this.isDomitoryListEmpty = isDomitoryListEmpty;
		this.result = result;
	}


	@Parameters
    public static Collection data()  {
        return  Arrays.asList( new  Object[][] {
        {"10","Student_Class","1","10622",false,false,"success"} ,
        {"10","Student_Class","13","10622",true,false,"success"} ,
        {"10","Student_Name","Jin Xin","10622",false,false,"success"} ,
        {"10","Student_Name","Jin","10622",true,false,"success"} ,
        {"10","Student_Username","Student1","10622",false,false,"success"} ,
        {"10","Student_Username","Student13","10622",true,false,"success"} ,
        {"10","Student_Username","Student1","aef",true,false,"success"} ,
        {"10","Student_Username",null,"10622",false,false,"success"} ,
        {"10",null,"Student1","10622",true,false,"success"} ,
        {"10","Student_Username","Student1",null,false,false,"success"} ,
        {"10",null,null,null,false,false,"success"} ,
       } );
   }

	@Test
	public void ACTION_MYSTUDENTLIST() throws Exception {
		MyStudentList test=new MyStudentList();
		test.setSearchKey(searchKey);
		test.setSearchRow(searchRow);
		test.setDomitory_ID(domitory_ID);
		test.setBuilding_ID(building_ID);
		assertEquals(result,test.executeForUnitTest());
		assertEquals(this.isDomitoryListEmpty,test.getDomitorylist().isEmpty());
		assertEquals(this.isStudentListEmpty,test.getList().isEmpty());
	}
	
	@Test
	public void ACTION_MYSTUDENTLIST_INTEGRATION() throws Exception {
		MyStudentList test=new MyStudentList();
		test.setSearchKey(searchKey);
		test.setSearchRow(searchRow);
		test.setDomitory_ID(domitory_ID);
		test.setBuilding_ID(building_ID);
		assertEquals(result,test.executeForIntegrationTest());
		assertEquals(this.isDomitoryListEmpty,test.getDomitorylist().isEmpty());
		assertEquals(this.isStudentListEmpty,test.getList().isEmpty());
	}

}
