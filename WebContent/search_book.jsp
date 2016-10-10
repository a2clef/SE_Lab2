<%@page import="libsystem.action.searchbook"%>
<%@page import="com.opensymphony.xwork2.Result"%>


<?xml version="1.0" encoding="GB18030" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="GB18030"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search results</title>
</head>
<body>

   	Book Information if ISBN:    <s:property  value="isbn"/> <br>

    <%
    String result=request.getAttribute("result").toString();
    String string_arr[]=result.split("~");
    if(!result.equals(""))
    {
    	//out.print(result);
        
        out.print("	<table border=\"1\"> <tr> <th>Isbn</th> <th>Title</th> <th>AuthorID</th><th>Publisher</th><th>PublishDate</th><th>Price</th> </tr>");
        
        out.print("<tr>");
        for(int i=0;i<6;i++)
        {
        	out.print("<td>");	
        	out.print(string_arr[i]);    	
        	out.print("</td>");  	
        }
        out.print("</tr>");
        out.print("</table>");    
        out.print("<br>");
        out.print("<a href=\"deletebook?isbn="+(string_arr[0])+"\">"+"Delete this book</a>");

    }
    else
    {
    	out.print("This book was not found");	
    }
	
    %>
    <a href="<%=basePath%>hello.jsp">back to main menu</a>
</body>
</html>
