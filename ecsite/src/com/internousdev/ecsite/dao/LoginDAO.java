package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		LoginDTO loginDTO = new LoginDTO();

		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setLoginUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
			//testcode
			System.out.println("loginDTOの中身");
			System.out.println(loginDTO.getLoginId());
			System.out.println(loginDTO.getLoginPassword());
			System.out.println(loginDTO.getLoginUserName());

			//testcode
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

}
