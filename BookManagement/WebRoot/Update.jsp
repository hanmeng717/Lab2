<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'Update.jsp' starting page</title>
    
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
    请更新如下信息： <br><br>
    <form  action="Update_CheckNewAuthor.action" style="width: 471px; height: 641px">
    <s:iterator value="list" var="sx">
	ID：<s:textfield name="isbn" value="%{isbn}" readonly="true"/>&nbsp;&nbsp;<br>
	书名：《<s:textfield name="title" value="%{title}" readonly="true" />》&nbsp;&nbsp;<br>
	作者ID：<s:textfield name="authorid" value="%{authorid}" />&nbsp;&nbsp;<br>
	出版日期：<s:textfield name="publishdate" value="%{publishdate}" />&nbsp;&nbsp;<br>
	价格：<s:textfield name="price" value="%{price}"/>&nbsp;元&nbsp;<br>
	出版社：<s:textfield name="publisher" value="%{publisher}" />&nbsp;&nbsp;<br><br>
	<input type="submit" value="保存更改" style="width: 243px; ">
	</s:iterator>
   </form>
  </body>
</html>
