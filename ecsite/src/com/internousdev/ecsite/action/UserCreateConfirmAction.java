package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String loginUserName;
	public Map<String, Object> session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;



		if(!(loginUserId.equals(""))&&!(loginPassword.equals(""))&&!(loginUserName.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("loginUserName", loginUserName);
		}else{
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
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
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

}
