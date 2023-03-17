<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Course Content</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<div class="row container-fluid mt-5 ">
<div class="col-lg-3"></div>
<div class="col-lg-6 p-5 bg-dark text-white">
<h2>Upload Files</h2><br>
	<form>
		<input type="text" class="form-control" placeholder="First name" value="" required><br>
        <input type="text" class="form-control"  placeholder="Last name" value="" required><br>
        <input type="email" class="form-control" placeholder="Enter your email" required><br>
       <a href="UploadContent.jsp"><button class="btn btn-outline-primary" type="button">Submit</button></a>
	</form>
</div>
<div class="col-lg-3"></div>

</div>


</body>
</html>