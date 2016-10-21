<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'InputAuthorName.jsp' starting page</title>
  </head>
  <body>
    请输入要查询的作者的姓名<br>
  <form  action="AuthorNameSearch.action" style="width: 163px; height: 33px">
  	<input type="text" name="authorname" style="width: 243px; ">
  	<input type="submit" value="提交" style="width: 243px; ">
   </form>
   <form  action="index.jsp" style="width: 163px; height: 33px">
  	<input type="submit" value="取消查询，返回主页" style="width: 243px; ">
   </form>
  </body>
</html>
