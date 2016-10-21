<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'AddBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    请首先输入要插入的图书的具体信息：. <br><br>
    <form  action="index.jsp" style="width: 163px; height: 33px">
  	<input type="submit" value="取消添加，单击此处返回主页" style="width: 243px; ">
   </form>
 <form  action="Add_Check_Book.action" style="width: 163px; height: 33px">
    ID:<input type="text" name="isbn" style="width: 243px; "><br><br>
 题目：<input type="text" name="title" style="width: 243px; "><br><br>
 作者ID：<input type="text" name="authorid" style="width: 243px; "><br><br>
 出版日期：<input type="text" name="publishdate" style="width: 243px; "><br><br>
  价格：<input type="text" name="price" style="width: 243px; "><br><br>
   出版社：<input type="text" name="publisher" style="width: 243px; "><br><br>
  	<input type="submit" value="提交" style="width: 243px; ">
   </form>
  </body>
</html>
