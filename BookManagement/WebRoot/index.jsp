<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
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
  欢迎来到图书管理系统，请选择功能<br>
    <form  action="InputAuthorName.jsp" style="width: 163px; height: 33px">
    <input type="submit" value="按照作者查询图书" style="width: 243px; ">
    </form>
    <form  action="ShowAllBook.action" style="width: 163px; height: 33px">
    <input type="submit" value="浏览图书库中的全部图书" style="width: 243px; ">
    </form>
    <form  action="AddAuthor.jsp" style="width: 163px; height: 33px">
    <input type="submit" value="新增一本书" style="width: 243px; ">
    </form>
  </body>
</html>
