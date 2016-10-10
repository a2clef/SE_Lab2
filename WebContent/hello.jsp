<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

    
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
<title>Online Library System </title>
</head>
<body>

	<div class="area">
	<h2>Search books by author name</h2>
	<form action="searchauthor">
	    <p>name: <input type="text" name="name" required="required"/></p>
	    <input type="submit" value="search" />
	</form>
	</div>

	<div class="area">
	<h2>Add a new book into the library</h2>
	<form action="addbook">
	  	<p>ISBN: <input type="text" name="isbn" pattern="[0-9]{13}$" required="required"/></p>
	 	<p>Title: <input type="text" name="title" required="required"/></p>
		<p>AuthorID: <input type="text" name="author_id"required="required" /></p>
	 	<p>Publisher: <input type="text" name="publisher"required="required" /></p>
	  	<p>PublishDate: <input type="text" name="publish_date" placeholder="eg:1949-10-01" pattern="^[12][0-9][0-9][0-9]-[01][0-9]-[0-3][0-9]$" required="required"/></p>
	  	<p>Price: <input type="text" name="price" required="required"/></p>
	  	<input type="submit" value="Insert this book into database" />
	</form>
	</div>
	
	<div class="area">
	
	
	<h2><a href="<%=basePath%>insert_author.jsp">Press link to add an author directly</a></h2>

	<embed src="http://music.163.com/style/swf/widget.swf?sid=433107901&type=2&auto=1&width=278&height=32" width="298" height="52"  allowNetworking="all"></embed>
</body>
</html>