<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Admin Login</title>
	<link rel="stylesheet" href="css/admin.css">
</head>

<body class="bg container-fluid">
	<%@include file="navbar.jsp" %>
	<div class="text-center"><%=request.getAttribute("msg") %></div>
	<br><br><br><br><br>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="global-container">
				<div class="card login-form">
					<div class="card-body">
						<h3 class="card-title text-center">Admin Login</h3>
						<div class="card-text">

							<form action="adminDashboard.jsp" method="post">
								<!-- to error: add class "has-danger" -->
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label>
									<input type="email" name="email" class="form-control form-control-sm"
										id="exampleInputEmail1" aria-describedby="emailHelp" required
										placeholder="Enter username">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label>
									<input type="password" name="pwd" class="form-control form-control-sm"
										id="exampleInputPassword1" required placeholder="Enter password">
								</div>
								<a href="#" style="float:right;font-size:12px;">Forgot password?</a>
								<br><br>
								<button type="submit" class="btn btn-primary btn-block">Sign in</button>

								<div class="sign-up">
									Don't have an account? <a href="register.jsp">Create One</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

		</div>
		<div class="col-md-4">

		</div>
	</div>
	<br><br>
	<%@include file="navBottom.jsp" %>
</body>

</html>