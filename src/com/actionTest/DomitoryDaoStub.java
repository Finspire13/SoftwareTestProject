package com.actionTest;

import java.util.ArrayList;
import java.util.List;

import com.bean.DomitoryBean;

public class DomitoryDaoStub {
	
	public List<DomitoryBean> GetList(String strwhere,String strorder){
		List<DomitoryBean> list=new ArrayList<DomitoryBean>();
		if(strwhere.equals("Domitory_BuildingID=10"))
			list.add(new DomitoryBean());
		
		if(strwhere.equals("1=1 and Domitory_BuildingID='10'"))
			list.add(new DomitoryBean());
		return list;
	}

}
