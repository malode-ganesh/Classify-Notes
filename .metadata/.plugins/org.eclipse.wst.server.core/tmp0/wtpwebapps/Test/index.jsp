<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@include file="CDN/bootstrap.jsp" %>
  
 <title>Classify </title>
</head>
<body class="">
<jsp:include page="navbar.jsp"></jsp:include>

<%--
<%
if(session.getAttribute("uname")==null){
	response.sendRedirect("stuLogin.jsp");
}
%>  --%>

<div class="row container-fluid p-4">
<div class="col-md-3 bg-success"><h2>SideBar</h2></div>
<div class="col-md-6 bg-primary">
	<h2 class="mt-3">Welcome to Classify</h2>
	<p class="h-text">A complete study material for exam preparation...!</p>
	
	<div class="bg-dark p-4 text-white mb-4">
	<p><h3>SRTM University Nanded</h3> (Institute Of Technology And Management)</p>
	<p>Get all notes as per your <i>course</i></p>
	<ul>
		<li>BCA</li>
		<li>BBA</li>
		<li>BSC HS</li>
	</ul>
	<hr>
	  <a href="stuLogin.jsp" title="Login to access notes"><button type="button" class="btn btn-outline-info">Student Login</button></a>	

	
	</div>
	
</div>
<div class="col-md-3 bg-warning"></div>
</div>
<div class="row container-fluid">
<div class="col-lg-3"></div>
<div class="col-lg-6 bg-warning p-4">
<h2>College Administration Login</h2>
<form>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="">
    <label class="" >Don't have accout?<a href="register.jsp"> Sign Up</a></label><br>
  </div>
	  <a href="login.jsp" title=""><button type="button" class="btn btn-outline-dark">Login</button></a>	
</form>
</div>
<div class="col-lg-3"></div>

</div>
 </body>
</html>