<%@page import="dao.UserDao"%>
<%@page import="com.connectionProvider.ConnectionProvider"%>
<%@page import="com.entities.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_page.jsp"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Student Dashboard</title>
	<%@include file="Bootstrap/Bootstrap.jsp"%>
</head>

<body>
	<%@ page import="java.sql.*"%>
	<%@include file="navbarSecure.jsp"%>

	<br>
	<br>
	<br>
	<br>
	<%!Connection con = ConnectionProvider.getConnection();
	String c;%>

	<%
	String email = request.getParameter("email");
	String pwd = request.getParameter("pwd");

	Users user1 = new Users(email, pwd);
	UserDao dao = new UserDao(ConnectionProvider.getConnection());
	
	//Logout
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
	HttpSession hs = request.getSession();
	hs.setAttribute("email", email);


	/* System.out.print(dao.Verify(user1));
	System.out.print(user1.getCourse()); */

	if (dao.Verify(user1)) {

		c = user1.getCourse();
		System.out.print("course :" + c);
		out.print("<body>");
	%>
	<div class="container-fluid">
		<nav>
			<div class="nav nav-tabs" id="nav-tab" role="tablist">
				<a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab"
					aria-controls="nav-home" aria-selected="true"><i class="fa-solid fa-magnifying-glass"> </i>
					Search</a>
				<a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab"
					aria-controls="nav-profile" aria-selected="false"><i class="fa-solid fa-square-1"></i>
					First Year</a>
				<a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab"
					aria-controls="nav-contact" aria-selected="false">Second
					Year</a>
				<a class="nav-item nav-link" id="nav-third-tab" data-toggle="tab" href="#nav-third" role="tab"
					aria-controls="nav-third-tab" aria-selected="false">Third Year</a>

				<button type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#myModal">
					Notice
				</button>
			</div>
		</nav>
		<div class="tab-content" id="nav-tabContent">
			<!--Upload doc Tab  -->
			<div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
				<div class="container-fluid">
					<form action="Msg.jsp" method="post">
						<h5>Course</h5>
						<input type="radio" id="c" name="course" value="<%=c%>" checked>
						<label for="c"> <%=user1.getCourse().toUpperCase()%>
						</label><br>
						<div class=" p-2">

							<div class="">
								<label for="year">
									<h5>Select Year</h5>
								</label> <select name="year" id="sel1" onchange="select1()" id="year"
									class="btn btn-info" required>
									<option value="">Select</option>
									<option value="fy">First Year</option>
									<option value="sy">Second Year</option>
									<option value="ty">Third Year</option>
								</select>
							</div>
							<br>
							<div class="">
								<label for="sem">
									<h5>Select Sem</h5>
								</label> <select name="sem" id="sel2" onchange="select2()" class="btn btn-info"
									required>
									<!--<option value="">Select</option>
									 <option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option> -->
								</select>
							</div>
							<br> <label for="sub">
								<h5>Select Subject</h5>
							</label> <select name="sub" id="sub" class="btn btn-info" required>
								<!-- <option value="">Select</option>
								<option value="fc">FC</option>
								<option value="c-lang">C</option>
								<option value="cpp">C++</option>
								<option value="java">Java</option>
								<option value="web-d">Web Development</option>
								<option value="mad">Mobile Application Development</option> -->
							</select>
						</div>
						<br> <input class="btn btn-outline-danger" type="submit" value="Get Files">
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
									<form action="downloadFiles" method="post">
										<input type="text" name="uploadFileName" value="<%=rs.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-primary"
											value="Download">
									</form>
								</td>
								<td>
									<form action="FileReadPdf" method="post">
										<input type="text" name="uploadFileName" value="<%=rs.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-warning" value="View">
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
									<form action="downloadFiles" method="post">
										<input type="text" name="uploadFileName" value="<%=rs2.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-primary"
											value="Download">
									</form>
								</td>
								<td>
									<form action="FileReadPdf" method="post">
										<input type="text" name="uploadFileName" value="<%=rs2.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-warning" value="View">
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
									<form action="downloadFiles" method="post">
										<input type="text" name="uploadFileName" value="<%=rs3.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-primary"
											value="Download">
									</form>
								</td>
								<td>
									<form action="FileReadPdf" method="post">
										<input type="text" name="uploadFileName" value="<%=rs3.getString("FileName")%>"
											hidden> <input type="submit" class="btn btn-sm btn-warning" value="View">
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
		</div>
		<!-- Notice Model -->
		<div class="modal fade" id="myModal">
			<div class="modal-dialog modal-dialog-centered">
			  <div class="modal-content">
			  
				<!-- Modal Header -->
				<div class="modal-header">
				  <h4 class="modal-title">Important Notices</h4>
				  <button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				
				<!-- Modal body -->
				<div class="modal-body">
					<table class="table table-hover container" >
						<thead>
							<tr>
								<th>Date</th>
								<th>Notice</th>
								<th>&nbsp;</th>
								
							</tr>
						</thead>
						<tbody>
							<%
							PreparedStatement pstmt4 = con.prepareStatement("select * from notices where course =?");
							pstmt4.setString(1, c);
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
								
							</tr>
							<%
							}
						%>
	
						</tbody>
					</table>
	
				</div>
				
				<!-- Modal footer -->
				<div class="modal-footer">
				  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				</div>
				
			  </div>
			</div>
		  </div>
	</div>
	<%
	out.print("</body>");
	} else {
	out.print("<center><h4>Invalid email and password:)<br>Retry..</h4><center>");
	//response.sendRedirect("stuLogin.jsp");
	RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
	rd.include(request, response);
	}
	%>
	<jsp:include page="navBottom.jsp"></jsp:include>
	<script type="text/javascript" src="stuDashboard.js"></script>
	<script type="text/javascript">

	</script>
</body>

</html>