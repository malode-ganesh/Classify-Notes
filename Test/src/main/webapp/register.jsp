<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register | Faculty</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<div class="row container-fluid mt-5 justify-content-center">
<div class="col-lg-3"></div>
<div class="col-lg-6 p-5 bg-dark text-white">
	<form>
  <div class="form-row ">
    <div class="col-md-4 mb-3">    
      <label>First name</label>
      <input type="text" class="form-control" placeholder="First name" value="" required>
    </div>
    <div class="col-md-4 mb-3">
      <label >Last name</label>
      <input type="text" class="form-control"  placeholder="Last name" value="" required>
    </div>
    <div class="col-md-4 mb-3">
      <label >Username</label>
      <div class="input-group">
         <input type="email" class="form-control" placeholder="Enter your email" required>
      </div>
    </div>
  </div>  
  <a href="UploadContent.jsp"><button class="btn btn-outline-primary" type="button">Submit</button></a>
</form>
</div>
<div class="col-lg-3"></div>

</div>

</body>
</html>