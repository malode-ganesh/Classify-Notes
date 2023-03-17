<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<%
	int n1 = Integer.parseInt(request.getParameter("f1"));
	int n2 = Integer.parseInt(request.getParameter("f2"));
	
	out.print(n1/n2);

%>
</body>
</html>