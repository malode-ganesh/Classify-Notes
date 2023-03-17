<%@page import="com.connectionProvider.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@include file="Bootstrap/Bootstrap.jsp" %>
	<title>Message</title>
	<style>
		.msg {
			color: green;
		}
	</style>
</head>

<body>
	<jsp:include page="navbarSecure.jsp"></jsp:include>
	<%@page import="java.sql.*" %>
	<%!
Connection con;
public void jspInit(){
	
	try{	
		con = ConnectionProvider.getConnection();
	}catch(Exception e){
		System.out.print(e);
	}
}
%>
	<center><br><br><br>
		<h4 id="msg" class="msg"><%=request.getAttribute("Message")%></h4><br><br>
	</center>

	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
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
  	String course = request.getParameter("course");
  	int sem = Integer.parseInt(request.getParameter("sem"));

  	try{
  		PreparedStatement pstmt = con.prepareStatement("select * from db where course=? and sem=?");
  		pstmt.setString(1, course);
  		pstmt.setInt(2, sem);
  		ResultSet rs = pstmt.executeQuery();
  		
  		while(rs.next()){
  			String year = rs.getString("year").toUpperCase();
  			String sub = rs.getString("sub").toUpperCase();
  			String c = rs.getString("course");
  			/* int sem = rs.getInt("sem"); */
  			
  			String fileName = rs.getString("fileName");
  			System.out.println(sub);
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
									<input type="submit" class="btn btn-sm btn-primary" value="Download">
								</form>
							</td>

							<td>
								<form action="FileReadPdf" method="post">
									<input type="text" name="uploadFileName" value="<%out.print(fileName);%>" hidden>
									<input type="submit" class="btn btn-sm btn-warning" value="View">
								</form>
							</td>
						</tr>
					</tbody>
					<%
  	}
  	}catch(Exception e){
  	  	System.out.println(e);
  	}
  %>
				</table>
				<!-- <a href="AdminForm.jsp" class="btn btn-sm btn-success">Add</a> -->
				<button class="btn btn-sm btn-primary" value="Back" type="Button"
					onclick="history.go(-1);">BACK</button>
			</div>
			<div class="col-md-2"></div>
		</div>

	</div>
	<jsp:include page="navBottom.jsp"></jsp:include>
</body>
<script>
	setTimeout(() => {
		myFun();
	}, 2000);

	function myFun() {
		var x = document.getElementById("msg");
		x.style.display = "none";
	}
</script>

</html>