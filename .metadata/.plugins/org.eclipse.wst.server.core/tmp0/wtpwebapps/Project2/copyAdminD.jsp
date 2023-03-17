<%@page import="com.connectionProvider.ConnectionProvider"%>
<%@page import="dao.UserDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Admin Dashboard</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<%-- <%@include file="Bootstrap/Bootstrap.jsp"%> --%>
	<style>
		body {
			padding: 0;
			margin: 0;

		}
	</style>
</head>

<body>


	<%@ page import="java.sql.*"%>
	<%!
		Connection con = ConnectionProvider.getConnection();
		String cName;
		UserDao us;
	%>
	<%
	String email = request.getParameter("email");
	String pwd = request.getParameter("pwd");

	Connection con = ConnectionProvider.getConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from classify_admin where email=? and pwd=?");
	pstmt.setString(1, email);
	pstmt.setString(2, pwd);

	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		String user = rs.getString("fname");
		cName = rs.getString("course");
	%>
	<!-- //if user exists -->
	<div class="container admin-bg">
		<h1 class="text-center">Admin Dashboard</h1>
		<hr>
		<div class="card">
			<div class="card-header">
				<h4>Welcome<b> <%out.print(user); %></b></h4>
				<h4>Course : <%out.print(rs.getString("course").toUpperCase()); %></h4>
				<div class="text-right"><button class="btn btn-danger">Logout</button></div>
			</div>
		</div>


		<hr>

		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">Upload Notes</a></li>
			<li><a data-toggle="tab" href="#menu1">First Year</a></li>
			<li><a data-toggle="tab" href="#menu2">Second Year</a></li>
			<li><a data-toggle="tab" href="#menu3">Third Year</a></li>
		</ul>

		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<h3><%out.print(rs.getString("course").toUpperCase()); %></h3>
				<div class="container bg p-4">
					<form method="post" action="uploadServlet" enctype="multipart/form-data">
						<label>
							<h4>Choose Year</h4>
						</label><br> <input onchange="funYear(1)" id="1" type="radio" name="year" value="fy">&nbsp;First
						Year <br> <input onchange="funYear(2)" id="2" type="radio" name="year" value="sy">&nbsp;Second
						Year<br> <input onchange="funYear(3)" id="3" type="radio" name="year" value="ty">&nbsp;Third
						Year<br>
						<div class="">
							<label for="sem">
								<h4>Select Sem</h4>
							</label> <select name="sem" id="sem" class="btn btn-info" required>
								<option value="">Select</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
							</select> <br> <label for="sub">
								<h4>Select Subject</h4>
							</label> <select name="sub" id="sub" class="btn btn-info" required>
								<option value="">Select</option>
								<option value="fc">FC</option>
								<option value="c-lang">C</option>
								<option value="cpp">C++</option>
								<option value="java">Java</option>
								<option value="web-d">Web Development</option>
								<option value="mad">Mobile Application Development</option>
							</select>
						</div>
						<br> <input type="file" name="pdf" accept="application/pdf, application/docx" required><br>
						<input type="radio" name="course" value="<%out.print(rs.getString("course"));%>"
							checked>&nbsp;&nbsp;<%out.print(rs.getString("course").toUpperCase()); %><br>
						<br> <input type="submit" class="btn btn-primary" value="Upload"> <br> <br> <br>
					</form>
				</div>
			</div>
			<div id="menu1" class="tab-pane fade">
				<table class="table table-striped text-center">
					<thead>
						<tr>
							<th>Subject</th>
							<th>Year</th>
							<th>Semester</th>
							<th>File Name</th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<%
				PreparedStatement ps = con.prepareStatement("select * from db where course=? and year=?");
				ps.setString(1, cName);
				ps.setString(2, "fy");
				ResultSet r = ps.executeQuery();
				
				while(r.next()){
					String year = r.getString("year").toUpperCase();
		  			String sub = r.getString("sub").toUpperCase();
		  			String c = r.getString("course");
		  			int sem = r.getInt("sem");
		  			String fileName = r.getString("fileName");
		  		%>

						<tr>
							<td><%out.print(sub); %></td>
							<td><%out.print(year); %></td>
							<td><%out.print(sem); %></td>
							<td><%out.print(fileName); %></td>
							<td>
								<form action="deleteServlet">
									<input type="text" name="deleteFile" value="<%out.print(fileName);%>" hidden>
									<input type="submit" class="btn btn-sm btn-danger" value="Delete">
								</form>
							</td>
							<td>
								<form action="downloadFiles" method="post">
									<input type="text" name="uploadFileName" value="<%out.print(fileName);%>" hidden>
									<input type="submit" class="btn btn-sm btn-primary" value="View">
								</form>
							</td>
						</tr>
					</tbody>
					<%
				}
			%>
				</table>
				<h3>Menu 1</h3>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
			<div id="menu2" class="tab-pane fade">
				<h3>Menu 2</h3>
				<p>Sed ut perspiciatis unde omnis iste natus error sit
					voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
			</div>
			<div id="menu3" class="tab-pane fade">
				<h3>Menu 3</h3>
				<p>Eaque ipsa quae ab illo inventore veritatis et quasi
					architecto beatae vitae dicta sunt explicabo.</p>
			</div>
		</div>
	</div>


	<%
	//if user doesn't exists
	} else {
	String str = "<h3 style=color:red><br><br><br>Invalid username or password<br>Retry</h3>";
	request.setAttribute("msg", str);
	RequestDispatcher rd = request.getRequestDispatcher("/adminLogin.jsp");
	rd.forward(request, response);
	}
	%>
</body>
<script src="js/adminDashboard.js" type="text/javascript"></script>

</html>