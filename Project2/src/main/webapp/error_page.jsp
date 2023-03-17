<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Something went wrong</title>
<%@include file="Bootstrap/Bootstrap.jsp" %>
</head>
<body class="text-center">
<h2>Something went wrong..</h2>

<%
	if(exception.getClass().toString().equals("class java.lang.NumberFormatException")){
		out.print("<h2>Please enter only numeric values</h2><br>");
		out.println("<a href=index.jsp class=btn btn-danger>Home Page</a>");
	}else{
		out.print("false<br>");
	}
%>


<%=exception.getClass().toString() %>
</body>
</html>