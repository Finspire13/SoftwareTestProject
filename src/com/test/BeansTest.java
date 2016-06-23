package com.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import com.dao.*;
import com.bean.*;

public class BeansTest {

	@Test
	public void TEST_BEAN_ADMIN_001() {
		//fail("Not yet implemented");
		AdminBean testAdmin=new AdminBean();
		testAdmin.setAdmin_ID(1000001);
		testAdmin.setAdmin_Username("Admin1");
		testAdmin.setAdmin_Password("678138");
		testAdmin.setAdmin_Name("Jin Xin");
		testAdmin.setAdmin_Sex("Female");
		testAdmin.setAdmin_Tel("15201925306");
		
		assertEquals(1000001,testAdmin.getAdmin_ID());
		assertEquals("Admin1",testAdmin.getAdmin_Username());
		assertEquals("678138",testAdmin.getAdmin_Password());
		assertEquals("Jin Xin",testAdmin.getAdmin_Name());
		assertEquals("Female",testAdmin.getAdmin_Sex());
		assertEquals("15201925306",testAdmin.getAdmin_Tel());
	}
	
	@Test
	public void TEST_BEAN_ADMIN_002() {
		
		AdminBean testAdmin=new AdminBean();
		testAdmin.setAdmin_ID(-1);
		testAdmin.setAdmin_Username(null);
		testAdmin.setAdmin_Password(null);
		testAdmin.setAdmin_Name(null);
		testAdmin.setAdmin_Sex(null);
		testAdmin.setAdmin_Tel(null);
		
		//System.out.print("!");
		//System.out.print(testAdmin.getAdmin_Name());
		
		assertEquals(-1,testAdmin.getAdmin_ID());
		assertEquals(null,testAdmin.getAdmin_Username());
		assertEquals(null,testAdmin.getAdmin_Password());
		assertEquals(null,testAdmin.getAdmin_Name());
		assertEquals(null,testAdmin.getAdmin_Sex());
		assertEquals(null,testAdmin.getAdmin_Tel());
	}

	@Test
	public void TEST_BEAN_TEACHER_001(){
		TeacherBean testTeacher=new TeacherBean();
		
		testTeacher.setTeacher_ID(2000001);
		testTeacher.setTeacher_Username("Teacher1");
		testTeacher.setTeacher_Password("137823"); 
		testTeacher.setTeacher_Name("Jin Xin");
		testTeacher.setTeacher_Sex("Female");
		testTeacher.setTeacher_Tel("15201925306");
		
		assertEquals(2000001,testTeacher.getTeacher_ID());
		assertEquals("Teacher1",testTeacher.getTeacher_Username());
		assertEquals("137823",testTeacher.getTeacher_Password());
		assertEquals("Jin Xin",testTeacher.getTeacher_Name());
		assertEquals("Female",testTeacher.getTeacher_Sex());
		assertEquals("15201925306",testTeacher.getTeacher_Tel());
	}
	
	@Test
	public void TEST_BEAN_TEACHER_002(){
		TeacherBean testTeacher=new TeacherBean();
		
		testTeacher.setTeacher_ID(-1);
		testTeacher.setTeacher_Username(null);
		testTeacher.setTeacher_Password(null);
		testTeacher.setTeacher_Name(null);
		testTeacher.setTeacher_Sex(null);
		testTeacher.setTeacher_Tel(null);
		
		assertEquals(-1,testTeacher.getTeacher_ID());
		assertEquals(null,testTeacher.getTeacher_Username());
		assertEquals(null,testTeacher.getTeacher_Password());
		assertEquals(null,testTeacher.getTeacher_Name());
		assertEquals(null,testTeacher.getTeacher_Sex());
		assertEquals(null,testTeacher.getTeacher_Tel());
	}
	
	@Test
	public void TEST_BEAN_STUDENT_001(){
		StudentBean testStudent=new StudentBean();
		
		testStudent.setStudent_ID(3000001);
		testStudent.setStudent_DomitoryID(10622);
		testStudent.setStudent_Username("Student1");
		testStudent.setStudent_Password("123456");
		testStudent.setStudent_Name("Jin Xin");
		testStudent.setStudent_Sex("Female");
		testStudent.setStudent_Class("class1");
		testStudent.setStudent_State("In");
		
		assertEquals(3000001,testStudent.getStudent_ID());
		assertEquals(10622,testStudent.getStudent_DomitoryID());
		assertEquals("Student1",testStudent.getStudent_Username());
		assertEquals("123456",testStudent.getStudent_Password());
		assertEquals("Jin Xin",testStudent.getStudent_Name());
		assertEquals("Female",testStudent.getStudent_Sex());
		assertEquals("class1",testStudent.getStudent_Class());
		assertEquals("In",testStudent.getStudent_State());
	}
	
	@Test
	public void TEST_BEAN_STUDENT_002(){
		StudentBean testStudent=new StudentBean();
		
		testStudent.setStudent_ID(-1);
		testStudent.setStudent_DomitoryID(-1);
		testStudent.setStudent_Username(null);
		testStudent.setStudent_Password(null);
		testStudent.setStudent_Name(null);
		testStudent.setStudent_Sex(null);
		testStudent.setStudent_Class(null);
		testStudent.setStudent_State(null);
		
		assertEquals(-1,testStudent.getStudent_ID());
		assertEquals(-1,testStudent.getStudent_DomitoryID());
		assertEquals(null,testStudent.getStudent_Username());
		assertEquals(null,testStudent.getStudent_Password());
		assertEquals(null,testStudent.getStudent_Name());
		assertEquals(null,testStudent.getStudent_Sex());
		assertEquals(null,testStudent.getStudent_Class());
		assertEquals(null,testStudent.getStudent_State());
	}
	
	@Test
	public void TEST_BEAN_BUILDING_001(){
		BuildingBean testBuilding=new BuildingBean();
		
		testBuilding.setBuilding_ID(10);
		testBuilding.setBuilding_Name("Building10");
		testBuilding.setBuilding_Introduction("Pengyuan");
		
		assertEquals(10,testBuilding.getBuilding_ID());
		assertEquals("Building10",testBuilding.getBuilding_Name());
		assertEquals("Pengyuan",testBuilding.getBuilding_Introduction());
	}
	
	@Test
	public void TEST_BEAN_BUILDING_002(){
		BuildingBean testBuilding=new BuildingBean();
		
		testBuilding.setBuilding_ID(-1);
		testBuilding.setBuilding_Name(null);
		testBuilding.setBuilding_Introduction(null);
		
		assertEquals(-1,testBuilding.getBuilding_ID());
		assertEquals(null,testBuilding.getBuilding_Name());
		assertEquals(null,testBuilding.getBuilding_Introduction());
	}
	
	@Test
	public void TEST_BEAN_DOMITORY_001(){
		DomitoryBean testDomitory=new DomitoryBean();
		
		testDomitory.setDomitory_ID(10622);
		testDomitory.setDomitory_BuildingID(10);
		testDomitory.setDomitory_Name("abc");
		testDomitory.setDomitory_Type("female");
		testDomitory.setDomitory_Number("622");
		testDomitory.setDomitory_Tel("2020102");
		
		assertEquals(10622,testDomitory.getDomitory_ID());
		assertEquals(10,testDomitory.getDomitory_BuildingID());
		assertEquals("abc",testDomitory.getDomitory_Name());
		assertEquals("female",testDomitory.getDomitory_Type());
		assertEquals("622",testDomitory.getDomitory_Number());
		assertEquals("2020102",testDomitory.getDomitory_Tel());
	}
	
	@Test
	public void TEST_BEAN_DOMITORY_002(){
		DomitoryBean testDomitory=new DomitoryBean();
		
		testDomitory.setDomitory_ID(-1);
		testDomitory.setDomitory_BuildingID(-1);
		testDomitory.setDomitory_Name(null);
		testDomitory.setDomitory_Type(null);
		testDomitory.setDomitory_Number(null);
		testDomitory.setDomitory_Tel(null);
		
		assertEquals(-1,testDomitory.getDomitory_ID());
		assertEquals(-1,testDomitory.getDomitory_BuildingID());
		assertEquals(null,testDomitory.getDomitory_Name());
		assertEquals(null,testDomitory.getDomitory_Type());
		assertEquals(null,testDomitory.getDomitory_Number());
		assertEquals(null,testDomitory.getDomitory_Tel());
	}
}
