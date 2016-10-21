<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'DisPlayAllBook.jsp' starting page</title>
    
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
    库存的图书有： <br> <br>
    <s:iterator value="list" var="sx">
	*ID：<s:property value="isbn" />&nbsp;&nbsp;
	*书名：《<a href="ShowBookMessage.action?title=${sx.title} & authorid=${sx.authorid}"><s:property value="title" /></a>》&nbsp;&nbsp;
	*作者ID：<s:property value="authorid" />&nbsp;&nbsp;
	*出版日期：<s:property value="publishdate" />&nbsp;&nbsp;
	*价格：<s:property value="price" />&nbsp;元&nbsp;
	*出版社：<s:property value="publisher" /><br>
	<a href="DeleteBook.action?isbn=${sx.isbn}">删除此书</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="Update_Search.action?isbn=${sx.isbn}">更新</a><br>
	</s:iterator>
	<form  action="index.jsp" style="width: 163px; height: 33px">
  	<input type="submit" value="单击此处返回主页" style="width: 243px; ">
   </form>
  </body>
</html>
