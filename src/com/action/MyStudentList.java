package com.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.actionTest.*;
import com.bean.*;
import com.dao.*;


public class MyStudentList extends ActionSupport {

	//������Action�����ڷ�װ�û��������������
	private List<StudentBean> list;
	private List<DomitoryBean> domitorylist;
	private String Building_ID;
	private String SearchRow;
	private String SearchKey;
	private String Domitory_ID;
	
	public List<StudentBean> getList() {
		return list;
	}
	public void setList(List<StudentBean> list) {
		this.list = list;
	}
	
	public String getBuilding_ID() {
		return Building_ID;
	}
	public void setBuilding_ID(String buildingID) {
		Building_ID = buildingID;
	}
	
	public List<DomitoryBean> getDomitorylist() {
		return domitorylist;
	}
	public void setDomitorylist(List<DomitoryBean> domitorylist) {
		this.domitorylist = domitorylist;
	}
	
	
	public String getSearchRow() {
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
		SearchRow = searchRow;
	}
	public String getSearchKey() {
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
		SearchKey = searchKey;
	}
	
	
	public String getDomitory_ID() {
		return Domitory_ID;
	}
	public void setDomitory_ID(String domitoryID) {
		Domitory_ID = domitoryID;
	}
	//�����û������execute����
	public String executeForUnitTest() throws Exception {

		//��ѯ����
		String strWhere="Student_State='in' and Building_ID="+Building_ID;
		if(!(isInvalid(SearchKey)))
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		}
		if(!(isInvalid(Domitory_ID)))
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		}
		System.out.println(strWhere);
		//��ѯ����
		list=new StudentDaoStub().GetList(strWhere,"Domitory_Name");
		
		//��ѯ��������
		domitorylist=new DomitoryDaoStub().GetList("Domitory_BuildingID="+Building_ID,"Domitory_Name");
	
		return SUCCESS;
		
	}
	
	public String executeForIntegrationTest() throws Exception {

		//��ѯ����
		String strWhere="Student_State='in' and Building_ID="+Building_ID;
		if(!(isInvalid(SearchKey)))
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		}
		if(!(isInvalid(Domitory_ID)))
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		}
		//��ѯ����
		list=new StudentDao().GetList(strWhere,"Domitory_Name");
		
		//��ѯ��������
		domitorylist=new DomitoryDao().GetList("Domitory_BuildingID="+Building_ID,"Domitory_Name");
	
		return SUCCESS;
		
	}
	
	public String execute() throws Exception {
		System.out.print("msList!!!");
		//������룬����ҳ�����
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//����session����
		HttpSession session = ServletActionContext.getRequest().getSession();
		//��֤�Ƿ�������¼
		if(session.getAttribute("id")==null){
			out.print("<script language='javascript'>alert('�����µ�¼��');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		}

		//��ѯ����
		String strWhere="Student_State='��ס' and Building_ID="+Building_ID;
		if(!(isInvalid(SearchKey)))
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		}
		if(!(isInvalid(Domitory_ID)))
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		}
		
		//��ѯ����
		list=new StudentDao().GetList(strWhere,"Domitory_Name");
		
		//��ѯ��������
		domitorylist=new DomitoryDao().GetList("Domitory_BuildingID="+Building_ID,"Domitory_Name");
	
		return SUCCESS;
		
	}
	
	//�ж��Ƿ��ֵ
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}
	
	//����
	public static void main(String[] args) {
		System.out.println();
	}
	
}
