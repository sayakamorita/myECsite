package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{
	public Map<String, Object>session;
	private ItemListDAO itemListDAO = new ItemListDAO();
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private String message;



	public String execute() throws SQLException{
//		//testcode
//		System.out.println(session.get("id"));
//		System.out.println(session.get("login_user_id"));
//		//testcode
		itemList = itemListDAO.getItemListInfo();
		String result= SUCCESS;
		session.put("id", itemList.get(0));
		session.put("itemName", itemList.get(1));
		session.put("itemPrice", itemList.get(2));
		session.put("itemStock", itemList.get(3));

//
//		//testcode
//		System.out.println("deleteFlgの値");
//		System.out.println(deleteFlg);
//		//testcode
//			ItemListDAO.getItemListInfo(
//			session.get("id").toString(),
//			session.get("item_name").toString(),
//			session.get("item_price").toString(),
//			session.get("item_stock").toString(),
//			session.get("insert_date")
//			);


//	セッションにitemListをいれる

//		if(deleteFlg == null){
//			String id = session.get("id").toString();

//
//		}else if(deleteFlg.equals("1")){
//			delete();
//		}


//		String result = SUCCESS;
		return result;
	}
//	public void delete() throws SQLException{
//		String id = session.get("id").toString();
//		int res = itemListDAO.itemListDelete(id);
//
//		if(res > 0){
//			itemList = null;
//			setMessage("商品情報を正しく削除しました。");
//		}else if(res == 0){
//			setMessage("商品情報の削除に失敗しました。");
//		}
//	}
//	public void setDeleteFlg(String deleteFlg){
//		this.deleteFlg = deleteFlg;
//	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public ArrayList<ItemListDTO> getItemList(){
		return this.itemList;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

}
