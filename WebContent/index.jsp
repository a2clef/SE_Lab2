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
}
</style>

<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Library entrance</title>
</head>
<body>
   <h1>This is the online library system
   <br>
   <a href="<%=basePath%>hello.jsp">Enter</a></h1>
   <br>
	<embed src="http://music.163.com/style/swf/widget.swf?sid=432821633&type=2&auto=1&width=320&height=66" width="340" height="86"  allowNetworking="all"></embed>
</body>
</html>
