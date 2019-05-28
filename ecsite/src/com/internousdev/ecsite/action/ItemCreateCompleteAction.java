package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{
	private String buyItemName;
	private String buyItemPrice;
	private String buyItemStock;
	public Map<String,Object>session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{
		itemCreateCompleteDAO.createItem(session.get("buyItemName").toString(),
										session.get("buyItemPrice").toString(),
										session.get("buyItemStock").toString());

		String result = SUCCESS;
		return result;
	}
	public String getBuyItemName(){
		return buyItemName;
	}
	public void setBuyItemName(String buyItemName){
		this.buyItemName = buyItemName;

	}
	public String getBuyItemPrice(){
		return buyItemPrice;
	}
	public void setBuyItemPrice(String buyItemPrice){
		this.buyItemPrice = buyItemPrice;
	}
	public String getBuyItemStock(){
		return buyItemStock;
	}
	public void setBuyItemStock(String buyItemStock){
		this.buyItemStock = buyItemStock;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}



}
