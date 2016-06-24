package com.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.bean.*;
import com.dao.*;
import com.actionTest.*;


public class AdminLog extends ActionSupport {

	//������Action�����ڷ�װ�û��������������
	private List<BuildingBean> buildinglist;
	private List<DomitoryBean> domitorylist;
	private String BuildingID;

	public List<BuildingBean> getBuildinglist() {
		return buildinglist;
	}

	public void setBuildinglist(List<BuildingBean> buildinglist) {
		this.buildinglist = buildinglist;
	}

	public List<DomitoryBean> getDomitorylist() {
		return domitorylist;
	}

	public void setDomitorylist(List<DomitoryBean> domitorylist) {
		this.domitorylist = domitorylist;
	}

	private String DomitoryID;
	public String getBuildingID() {
		return BuildingID;
	}

	public void setBuildingID(String buildingID) {
		BuildingID = buildingID;
	}

	public String getDomitoryID() {
		return DomitoryID;
	}

	public void setDomitoryID(String domitoryID) {
		DomitoryID = domitoryID;
	}

	//�����û������execute����
	public String execute() throws Exception {
		System.out.print("al!!!!");
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
		
		//��ѯ¥��
		buildinglist=new BuildingDao().GetList("","Building_Name");
//		System.out.println(BuildingID);
		//��ѯ����
		String strWhere="1=1 ";
		if(!(isInvalid(BuildingID)))
		{
			strWhere+=" and Domitory_BuildingID='"+BuildingID+"'";
		}
		else{
			strWhere+=" and 1=2";
		}
		
		
		//��ѯ����
		domitorylist=new DomitoryDao().GetList(strWhere,"Domitory_Name");
		
		return SUCCESS;
		
	}
	
	public String executeForUnitTest() throws Exception {
		//��ѯ¥��
		//buildinglist=new BuildingDaoStub().GetList("","Building_Name");
//		System.out.println(BuildingID);
		//��ѯ����
		String strWhere="1=1";
		if(!(isInvalid(BuildingID)))
		{
			strWhere+=" and Domitory_BuildingID='"+BuildingID+"'";
		}
		else{
			strWhere+=" and 1=2";
		}
		System.out.println(strWhere);
		//��ѯ����
		domitorylist=new DomitoryDaoStub().GetList(strWhere,"Domitory_Name");
		
		return SUCCESS;
		
	}
	
	public String executeForIntegrationTest() throws Exception {
		//��ѯ¥��
		//buildinglist=new BuildingDao().GetList("","Building_Name");
//		System.out.println(BuildingID);
		//��ѯ����
		String strWhere="1=1 ";
		if(!(isInvalid(BuildingID)))
		{
			strWhere+=" and Domitory_BuildingID='"+BuildingID+"'";
		}
		else{
			strWhere+=" and 1=2";
		}
		//��ѯ����
		domitorylist=new DomitoryDao().GetList(strWhere,"Domitory_Name");
		
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
