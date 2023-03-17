<%@page import="com.connectionProvider.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!-- Error Handling -->
<%@page errorPage="error_page.jsp"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Home Page</title>
	<%@include file="Bootstrap/Bootstrap.jsp"%>
	<style type="text/css">
		body {
			background-image: url('img/section-bg.jpg');
			background-repeat: no-repeat;
			background-attachment: fixed;
			background-size: cover;
		}

		* {
			padding: 0;
			margin: 0;
		}
	</style>
</head>

<body class="container-fluid">
	<%@include file="navbar.jsp"%>
	<br>
	<br>
	<br>
	<marquee>
		<h3 class="text-secondary">Welcome to Classify Notes. Your study
			partner!</h3>
	</marquee>
	<%
	Connection con = ConnectionProvider.getConnection();
	int n1 = 10;
	int n2 = 1;
	%>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4"></div>
		<%@include file="login.jsp"%>
	</div>



	<%@include file="navBottom.jsp"%>
</body>

</html>