<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Register here</title>
	<link rel="stylesheet" href="css/register.css">
	<%@include file="Bootstrap/Bootstrap.jsp"%>

	<script type="text/javascript">
		function F() {
			//let v = document.getElementById("prof").value;
			//console.log(v);
			alert("Confirm Profession? Selected: " + document.getElementById("faculty").value);
			//document.getElementById("myForm").action = "facultyReg";
		}

		function S() {
			//let v = document.getElementById("prof").value;
			//console.log(v);
			alert("Confirm Profession? Selected: " + document.getElementById("student").value);
			//document.getElementById("myForm").action = "stuReg";
		}
	</script>

</head>

<body class="container">
	<%@include file="navbar.jsp"%>
	<br>


	<section class="get-in-touch">
		<h1 class="title">Register</h1>
		<form action="Register" class="contact-form row" id="myForm" method="post">
			<div class="form-field col-lg-6">
				<input id="name" class="input-text js-input" type="text" name="fname" required>
				<label class="label" for="name">Name</label>
			</div>
			<div class="form-field col-lg-6 ">
				<input id="email" class="input-text js-input" type="email" name="email" required>
				<label class="label" for="email">E-mail</label>
			</div>

			<div class="form-field col-lg-12">
				<input id="message" class="input-text js-input" type="password" name="pwd" required>
				<label class="label" for="message">Password</label>
			</div>
			<div class="form-field col-lg-12 mt-0">
				<div class="form-check">
					<label class="form-check-label" for="radio1"> <input type="radio" class="form-check-input"
							id="radio1" name="course" value="bca" required>BCA
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label" for="radio2"> <input type="radio" class="form-check-input"
							id="radio2" name="course" value="mca">MCA
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio" class="form-check-input" name="course"
							value="bba">BBA
					</label>
				</div>
			</div>
			<div class="card-footer">
				<span class="text-danger "><b>Are you?</b></span>
				Teacher&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input onclick="F()" type="radio" class="form-check-input"
					id="faculty" name="profession" value="Teacher">
				Student&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input onclick="S()" type="radio" class="form-check-input"
					id="student" name="profession" value="Student">

			</div>
			<div class="form-field col-lg-12">
				<input class="submit-btn" type="submit" value="Register">
			</div>
		</form>
	</section>
	<br>
	<%@include file="navBottom.jsp"%>

</body>

</html>