<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<title>管理者画面</title>

<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}
		table{
			text-align:center;
			margin:0 auto;
		}
/*====================ecsite layout====================*/
		#top{
			width:780px;
			margin:30px auto;
			border:1px solid #333;

		}
		#header{
			width:100%;
			height:80px;
			background-color:black;
		}
		#main{
			width:100%;
			height:500px;
			text-align:center;
		}
		#footer{
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}
		#right{
			float:right;
			width:50%;
			height:100px;
		}
		#left{
			float:left;
			width:50%;
			height:100px;
		}


</style>
<script type="text/javascript">
		function submitAction(url){
			$('form').attr('action',url);
			$('form').submit();
		}
</script>
</head>
<body>
	<div id="header">
		<div id="pr"></div>

	</div>

	<div id="main">
		<div id="left">
			<div id="top">
				<p>管理者画面</p>
			</div>
			<div id="table">
				<s:form>
					<tr>
						<td><input type="button" value="新規登録" onclick="submitAction('ItemCreateAction')"/></td>
						<td><input type="button" value="一覧" onclick="submitAction('ItemListAction')"/></td>
					</tr>
				</s:form>
			</div>
		</div>
		<div id="right">
			<div id="top">
				<p>ユーザー画面</p>
			</div>
			<div id="table">
				<s:form>
					<tr>
						<td><input type="button" value="新規登録" onclick="submitAction('UserCreateAction')"/></td>
						<td><input type="button" value="一覧" onclick=""/></td>
					</tr>
				</s:form>
			</div>
		</div>

	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>