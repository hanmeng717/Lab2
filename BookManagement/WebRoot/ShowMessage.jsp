<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'ShowMessage.jsp' starting page</title>
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
    这本书的详细信息如下： <br><br>
    <s:iterator value="list" var="sx">
	ID：<s:property value="isbn" />&nbsp;&nbsp;
	书名：《<s:property value="title" />》&nbsp;&nbsp;
	作者ID：<s:property value="authorid" />&nbsp;&nbsp;
	出版日期：<s:property value="publishdate" />&nbsp;&nbsp;
	价格：<s:property value="price" />&nbsp;元&nbsp;
	出版社：<s:property value="publisher" />&nbsp;&nbsp;<br><br>
	</s:iterator>
这本书的作者的详细信息如下： <br><br>
	<s:iterator value="list1" var="sx1">
	ID：<s:property value="authorid" />&nbsp;&nbsp;
	姓名：<s:property value="name" />&nbsp;&nbsp;
	年龄：<s:property value="age" />&nbsp;岁&nbsp;
	国籍：<s:property value="country" />&nbsp;&nbsp;
	</s:iterator>
	<form  action="index.jsp" style="width: 163px; height: 33px">
  	<input type="submit" value="单击此处返回主页" style="width: 243px; ">
   </form>
  </body>
</html>
