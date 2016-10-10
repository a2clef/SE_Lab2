<?xml version="1.0" encoding="GB18030" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="GB18030"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
	background-image: url(image/ppap.jpg);
	background-repeat;
}</style>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert an author</title>
</head>
<body>
	<div class="area">
	<h2>Insert a author</h2>
	<p>input information about a new author</p>
	<form action="addauthor">
		<p>AuthorID: <input type="text" name="author_id" required="required"/></p>
	  	<p>Name: <input type="text" name="name"required="required" /></p>
	 	<p>Age: <input type="text" name="age" required="required"/></p>
	 	<p>Country: <input type="text" name="country" required="required"/></p>
	  	<input type="submit" value="Insert this author into database" />
	</form>
	</div>
	<br> <a href="<%=basePath%>hello.jsp">Back to main menu</a>
		     
</body>
</html>