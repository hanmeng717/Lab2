<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'UpdateNewAuthor.jsp' starting page</title>
    
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
    您更新之后的作者在库存中不存在，请完善该作者的信息： <br><br>
    <form action="index.jsp" style="width: 163px; height: 33px">
  	<input type="submit" value="取消添加，单击此处返回主页" style="width: 243px; ">
   </form>
    <form  action="Update_NewAuthor.action" style="width: 163px; height: 33px">
    作者ID:<input type="text" name="authorid" style="width: 243px; "><br><br>
 姓名：<input type="text" name="name" style="width: 243px; "><br><br>
 年龄：<input type="text" name="age" style="width: 243px; "><br><br>
 国籍：<input type="text" name="country" style="width: 243px; ">
  	<input type="submit" value="提交" style="width: 243px; ">
   </form>
   
  </body>
</html>
