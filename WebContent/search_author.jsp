<%@page import="libsystem.action.searchauthor"%>
<%@page import="com.opensymphony.xwork2.Result"%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="GB18030"%>
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
<title>Search Result: by Author Name</title>
</head>
<body>

   	All books written by author:    
	<s:property  value="name"/>
    <br>
    <%
    String result=request.getAttribute("result").toString();
    if(!result.equals(""))
    {
        String tokens[]=result.split("~");
        int loopCount=tokens.length;
        out.print("	<table border=\"3\"> <tr> <th>ISBN</th> <th>Title</th> <th>Detail Information</th> </tr>");
        
        for(int i=0;i<loopCount;i=i+2)
        {
        	out.print("<tr><td>"+tokens[i]+"</td><td>"+tokens[i+1]+"</td><td>");	
        	out.print("<a href=\"searchbook?isbn="+(tokens[i])+"\">"+"Details</a></td></tr>");
        }
        out.print("</table>");    	
    }
    else
    {
    	out.print("This author does not exist, or haven't registered any books");	
    }
    %>
    <br>
    <a href="<%=basePath%>hello.jsp">Back to main menu</a>
</body>
</html>
