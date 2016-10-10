<?xml version="1.0" encoding="GB18030" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="GB18030"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<style type="text/css">
body {
	background-image: url(image/ppap.jpg);
	background-repeat;
}</style>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Input information wrong</title>
</head>
<body>
   Error occured, please check your input
   <br>
   adding book:Not sufficient information or wrong format.
   <br>
   adding author: Not sufficient information or conflict/inconsistency occured
   <br>
   <br>
   <br>
   <br>
   <br>
   <a href="<%=basePath%>hello.jsp">Back to main menu</a>
</body>
</html>