package com.internousdev.ecsite.dto;

public class LoginDTO {
	private String loginId;
	private String loginPassword;
	private String loginUserName;
	private boolean loginFlg = false;

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
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

	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

}
