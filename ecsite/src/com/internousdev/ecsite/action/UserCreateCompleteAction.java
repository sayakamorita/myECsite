package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String loginUserName;
	public Map<String, Object> session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException{

		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),session.get("loginPassword").toString(),session.get("loginUserName").toString());

		String result = SUCCESS;

		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getLoginUserName(){
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName){
		this.loginUserName = loginUserName;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
