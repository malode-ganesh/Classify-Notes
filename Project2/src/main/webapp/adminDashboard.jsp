<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.entities.DbData"%>
<%@page import="dao.DbDao"%>
<%@page import="com.connectionProvider.ConnectionProvider"%>
<%@page import="dao.UserDao"%>
<%@page import="com.entities.Users"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Admin Dashboard</title>
	<%@include file="Bootstrap/Bootstrap.jsp"%>
</head>

<body>
	<%@include file="navbarSecureAdmin.jsp"%>
	<br>
	<br>
	<br>
	<%!Connection con = ConnectionProvider.getConnection();%>

	<%
	String email = request.getParameter("email");
	String pwd = request.getParameter("pwd");

	Users user = new Users(email, pwd);
	UserDao dao = new UserDao(ConnectionProvider.getConnection());

	//Logout
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		HttpSession hs = request.getSession();
		hs.setAttribute("email", email);
	
	/*Passing course to js file  */
	
	if (dao.VerifyAdmin(user)) {
	%>


	<h2 class="text-center">Admin Dashboard</h2>
	<div class="card">
		<div class="card-header p-2">
			<h5>
				Welcome
				<%=user.getName().toUpperCase()%></h5>
			<h5>
				Course :<%=user.getCourse().toUpperCase()%></h5>
		</div>
	</div>
	<!-- card close -->
	<hr>
	<nav>
		<div class="nav nav-tabs" id="nav-tab" role="tablist">
			<a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab"
				aria-controls="nav-home" aria-selected="true">Upload Documents</a>
			<a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab"
				aria-controls="nav-profile" aria-selected="false">First Year</a>
			<a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab"
				aria-controls="nav-contact" aria-selected="false">Second
				Year</a>
			<a class="nav-item nav-link" id="nav-third-tab" data-toggle="tab" href="#nav-third" role="tab"
				aria-controls="nav-third-tab" aria-selected="false">Third Year</a>

			<a class="nav-item nav-link" id="nav-notice-tab" data-toggle="tab" href="#nav-notice" role="tab"
				aria-controls="nav-notice-tab" aria-selected="false">Upload Notice</a>
		</div>
	</nav>
	<div class="tab-content" id="nav-tabContent">
		<!--Upload doc Tab  -->
		<div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
			<div class="container-fluid">
				<form method="post" action="uploadServlet" enctype="multipart/form-data">
					<br>
					<label>
						<h5>Choose Year</h5>
					</label> <select name="year" id="sel1" onchange="select1()" id="year" class="btn btn-info" required>
						<option value="">Select</option>
						<option value="fy">First Year</option>
						<option value="sy">Second Year</option>
						<option value="ty">Third Year</option>
					</select><br>
					<div class="">
						<label for="sem">
							<h5>Select Sem</h5>
						</label> <select name="sem" id="sel2" onchange="select2()" class="btn btn-info" required>

						</select> <br> <label for="sub">
							<h5>Select Subject</h5>
						</label> <select name="sub" id="sub" class="btn btn-info" required>

						</select>
					</div>
					<br> <input type="file" name="pdf" accept="application/pdf, application/docx" required><br>
					<br>
					<input type="radio" id="c" name="course" value="<%=user.getCourse()%>" checked>&nbsp;&nbsp;
					<%=user.getCourse().toUpperCase()%><br> <br> <input type="submit" class="btn btn-primary"
						value="Upload"> <br>
					<br> <br>
				</form>
			</div>
		</div>
		<!-- upload doc Tab close-->
		<!--FY Tab-->
		<div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
			<div class="container p-2">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Subject</th>
							<th scope="col">Year</th>
							<th scope="col">Sem</th>
							<th scope="col">FileName</th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<%
						String c = user.getCourse();

						PreparedStatement pstmt = con.prepareStatement("select * from db where course=? and year=?");
						pstmt.setString(1, c);
						pstmt.setString(2, "fy");
						ResultSet rs = pstmt.executeQuery();

						while (rs.next()) {
						%>

						<tr>
							<td><%=rs.getString("sub")%></td>
							<td><%=rs.getString("year")%></td>
							<td><%=rs.getString("sem")%></td>
							<td><a href="#"><%=rs.getString("FileName")%></a></td>
							<td>
								<form action="deleteFile">
									<input type="text" name="deleteFile" value="<%=rs.getString("FileName")%>" hidden>
									<input type="submit" class="btn btn-sm btn-danger" value="Delete">
								</form>
							</td>
							<td>
								<form action="downloadFiles" method="post">
									<input type="text" name="uploadFileName" value="<%=rs.getString("FileName")%>"
										hidden> <input type="submit" class="btn btn-sm btn-primary" value="Download">
								</form>
							</td>
						</tr>

						<%
						}
						%>
					</tbody>
				</table>

			</div>
		</div>
		<!--FY Tab close-->
		<!--SY Tab-->
		<div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
			<div class="container p-2">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Subject</th>
							<th scope="col">Year</th>
							<th scope="col">Sem</th>
							<th scope="col">FileName</th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<%
						PreparedStatement pstmt2 = con.prepareStatement("select * from db where course=? and year=?");
						pstmt2.setString(1, c);
						pstmt2.setString(2, "sy");
						ResultSet rs2 = pstmt2.executeQuery();

						while (rs2.next()) {
						%>
						<tr>
							<td><%=rs2.getString("sub")%></td>
							<td><%=rs2.getString("year")%></td>
							<td><%=rs2.getString("sem")%></td>
							<td><a href="#"> <%=rs2.getString("FileName")%></a></td>
							<td>
								<form action="deleteFile">
									<input type="text" name="deleteFile" value="<%=rs2.getString("FileName")%>" hidden>
									<input type="submit" class="btn btn-sm btn-danger" value="Delete">
								</form>
							</td>
							<td>
								<form action="downloadFiles" method="post">
									<input type="text" name="uploadFileName" value="<%=rs2.getString("FileName")%>"
										hidden> <input type="submit" class="btn btn-sm btn-primary" value="Download">
								</form>
							</td>
						</tr>

						<%
						}
						%>
					</tbody>
				</table>

			</div>
		</div>
		<!--SY Tab close  -->
		<!--TY Tab-->
		<div class="tab-pane fade" id="nav-third" role="tabpanel" aria-labelledby="nav-third-tab">
			<div class="container p-2">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Subject</th>
							<th scope="col">Year</th>
							<th scope="col">Sem</th>
							<th scope="col">FileName</th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<%
						PreparedStatement pstmt3 = con.prepareStatement("select * from db where course=? and year=?");
						pstmt3.setString(1, c);
						pstmt3.setString(2, "ty");
						ResultSet rs3 = pstmt3.executeQuery();

						while (rs3.next()) {
						%>
						<tr>
							<td><%=rs3.getString("sub")%></td>
							<td><%=rs3.getString("year")%></td>
							<td><%=rs3.getString("sem")%></td>
							<td><a href="#"> <%=rs3.getString("FileName")%></a></td>
							<td>
								<form action="deleteFile">
									<input type="text" name="deleteFile" value="<%=rs3.getString("FileName")%>" hidden>
									<input type="submit" class="btn btn-sm btn-danger" value="Delete">
								</form>
							</td>
							<td>
								<form action="downloadFiles" method="post">
									<input type="text" name="uploadFileName" value="<%=rs3.getString("FileName")%>"
										hidden> <input type="submit" class="btn btn-sm btn-primary" value="Download">
								</form>
							</td>
						</tr>

						<%
						}
						%>
					</tbody>
				</table>

			</div>
		</div>
		<!--TY Tab close  -->
		<!--Upload Notices  -->
		<div class="tab-pane fade show active" id="nav-notice" role="tabpanel" aria-labelledby="nav-notice-tab">
			<div class="container-fluid">
				<form method="post" action="UploadNoticeServlet" enctype="multipart/form-data">
					<br>
					<input type="file" name="pdf" accept="application/pdf" required>

					<input type="text" value="<%=user.getCourse()%>" name="course" hidden>
					<br><br>
					<input type="submit" class="btn btn-sm btn-primary" value="Upload">
				</form>
				<br>
				<hr>
				<!--Display notice  -->

				<table class="table table-hover container" >
					<thead>
						<tr>
							<th>Date</th>
							<th>Notice</th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<%
						PreparedStatement pstmt4 = con.prepareStatement("select * from notices where course =?");
						pstmt4.setString(1, user.getCourse());
						ResultSet data = pstmt4.executeQuery();
						while(data.next()){
							%>
						<tr>
							<td><%=data.getString("uploadDate")%></td>
							<td><%=data.getString("fileName")%></td>
							<td>
								<form action="ReadNotice" method="post">
										<input type="text" name="uploadFileName" value="<%=data.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-warning" value="View">
									</form>
							</td>
							<td>
								<form action="DeleteNotice">
									<input type="text" name="deleteFile" value="<%=data.getString("FileName")%>" hidden>
									<input type="submit" class="btn btn-sm btn-danger" value="Delete">
								</form>
							</td>
						</tr>
						<%
						}
					%>

					</tbody>
				</table>

			</div>
		</div>
		<!-- upload notices Tab close-->
	</div>
	<%
	} else {
	String str = "<h3 style=color:red><br><br><br>Invalid username or password<br>Retry</h3>";
	request.setAttribute("msg", str);
	RequestDispatcher rd = request.getRequestDispatcher("/adminLogin.jsp");
	rd.forward(request, response);
	}
	%>

	<script type="text/javascript" src="stuDashboard.js"></script>
</body>

</html>