package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	/*DBに接続。*/
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	/*getItemListInfoメソッドを定義（DBから商品一覧を取得するためのメソッド*/
	public ArrayList<ItemListDTO> getItemListInfo() throws SQLException{
		ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();

	/*	item_info_transactionから全てを取り出す。SQL文。id,item_name,item_price,item_stock,insert_date*/
		String sql = "SELECT * FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setId(resultSet.getString("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				dto.setInsertDate(resultSet.getString("insert_date"));
				//testcode
				System.out.println("DTOの中身1件ずつ");
				System.out.println(dto.getId());
				System.out.println(dto.getItemName());
				System.out.println(dto.getItemPrice());
				System.out.println(dto.getItemStock());

				System.out.println(dto.getInsertDate());
				//testcode

				itemListDTO.add(dto);
			}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return itemListDTO;
		}
//		public int itemListDelete(String id) throws SQLException{
//			String sql = "DELETE FROM item_info_transaction WHERE id = ?";
//			PreparedStatement preparedStatement;
//			int result = 0;
//
//			try{
//				preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setString(1, id);
//				result = preparedStatement.executeUpdate();
//
//			}catch(SQLException e){
//				e.printStackTrace();
//			}finally{
//				connection.close();
//			}
//			return result;

	}


