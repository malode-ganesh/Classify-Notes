/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2023-03-16 13:13:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import dao.UserDao;
import com.connectionProvider.ConnectionProvider;
import com.entities.Users;
import java.sql.*;

public final class stuDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

Connection con = ConnectionProvider.getConnection();
	String c;
  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/navbarSecure.jsp", Long.valueOf(1678972404926L));
    _jspx_dependants.put("/Bootstrap/Bootstrap.jsp", Long.valueOf(1676569842580L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.connectionProvider.ConnectionProvider");
    _jspx_imports_classes.add("dao.UserDao");
    _jspx_imports_classes.add("com.entities.Users");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"ISO-8859-1\">\r\n");
      out.write("	<title>Student Dashboard</title>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./Bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/JQuery/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/js/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"./Bootstrap/fontawesome/fontawesome.css\" type=\"text/css\"> -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/fontawesome/f-icons.js\" ></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./Bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/JQuery/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/js/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"./Bootstrap/fontawesome/fontawesome.css\" type=\"text/css\"> -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"./Bootstrap/fontawesome/f-icons.js\" ></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\"> <img src=\"img/logo.PNG\" alt=\"Classify\" width=\"110px\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\">Home <span\r\n");
      out.write("							class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("				<li class=\"nav-item\">\r\n");
      out.write("					<button class=\"btn btn-sm btn-dark mt-1\" onClick=\"displayResult()\">Result</button>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link \" href=\"#\">About</a></li>\r\n");
      out.write("				<!-- <li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("						role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> Courses </a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">BCA</a> <a class=\"dropdown-item\" href=\"#\">BBA</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">MCA</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li> -->\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("				<li><a class=\"btn btn-danger\" href=\"LogoutStu\"><span class=\"glyphicon glyphicon-log-in \"></span> Logout</a>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<script>\r\n");
      out.write("		function displayResult() {\r\n");
      out.write("			location\r\n");
      out.write("				.replace(\"https://www.srtmun.ac.in/en/examination/results.html\");\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

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
	
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<nav>\r\n");
      out.write("			<div class=\"nav nav-tabs\" id=\"nav-tab\" role=\"tablist\">\r\n");
      out.write("				<a class=\"nav-item nav-link active\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-home\" role=\"tab\"\r\n");
      out.write("					aria-controls=\"nav-home\" aria-selected=\"true\"><i class=\"fa-solid fa-magnifying-glass\"> </i>\r\n");
      out.write("					Search</a>\r\n");
      out.write("				<a class=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\"\r\n");
      out.write("					aria-controls=\"nav-profile\" aria-selected=\"false\"><i class=\"fa-solid fa-square-1\"></i>\r\n");
      out.write("					First Year</a>\r\n");
      out.write("				<a class=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\" href=\"#nav-contact\" role=\"tab\"\r\n");
      out.write("					aria-controls=\"nav-contact\" aria-selected=\"false\">Second\r\n");
      out.write("					Year</a>\r\n");
      out.write("				<a class=\"nav-item nav-link\" id=\"nav-third-tab\" data-toggle=\"tab\" href=\"#nav-third\" role=\"tab\"\r\n");
      out.write("					aria-controls=\"nav-third-tab\" aria-selected=\"false\">Third Year</a>\r\n");
      out.write("\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-danger btn-sm\" data-toggle=\"modal\" data-target=\"#myModal\">\r\n");
      out.write("					Notice\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<div class=\"tab-content\" id=\"nav-tabContent\">\r\n");
      out.write("			<!--Upload doc Tab  -->\r\n");
      out.write("			<div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<form action=\"Msg.jsp\" method=\"post\">\r\n");
      out.write("						<h5>Course</h5>\r\n");
      out.write("						<input type=\"radio\" id=\"c\" name=\"course\" value=\"");
      out.print(c);
      out.write("\" checked>\r\n");
      out.write("						<label for=\"c\"> ");
      out.print(user1.getCourse().toUpperCase());
      out.write("\r\n");
      out.write("						</label><br>\r\n");
      out.write("						<div class=\" p-2\">\r\n");
      out.write("\r\n");
      out.write("							<div class=\"\">\r\n");
      out.write("								<label for=\"year\">\r\n");
      out.write("									<h5>Select Year</h5>\r\n");
      out.write("								</label> <select name=\"year\" id=\"sel1\" onchange=\"select1()\" id=\"year\"\r\n");
      out.write("									class=\"btn btn-info\" required>\r\n");
      out.write("									<option value=\"\">Select</option>\r\n");
      out.write("									<option value=\"fy\">First Year</option>\r\n");
      out.write("									<option value=\"sy\">Second Year</option>\r\n");
      out.write("									<option value=\"ty\">Third Year</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br>\r\n");
      out.write("							<div class=\"\">\r\n");
      out.write("								<label for=\"sem\">\r\n");
      out.write("									<h5>Select Sem</h5>\r\n");
      out.write("								</label> <select name=\"sem\" id=\"sel2\" onchange=\"select2()\" class=\"btn btn-info\"\r\n");
      out.write("									required>\r\n");
      out.write("									<!--<option value=\"\">Select</option>\r\n");
      out.write("									 <option value=\"1\">1</option>\r\n");
      out.write("									<option value=\"2\">2</option>\r\n");
      out.write("									<option value=\"3\">3</option>\r\n");
      out.write("									<option value=\"4\">4</option>\r\n");
      out.write("									<option value=\"5\">5</option>\r\n");
      out.write("									<option value=\"6\">6</option> -->\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br> <label for=\"sub\">\r\n");
      out.write("								<h5>Select Subject</h5>\r\n");
      out.write("							</label> <select name=\"sub\" id=\"sub\" class=\"btn btn-info\" required>\r\n");
      out.write("								<!-- <option value=\"\">Select</option>\r\n");
      out.write("								<option value=\"fc\">FC</option>\r\n");
      out.write("								<option value=\"c-lang\">C</option>\r\n");
      out.write("								<option value=\"cpp\">C++</option>\r\n");
      out.write("								<option value=\"java\">Java</option>\r\n");
      out.write("								<option value=\"web-d\">Web Development</option>\r\n");
      out.write("								<option value=\"mad\">Mobile Application Development</option> -->\r\n");
      out.write("							</select>\r\n");
      out.write("						</div>\r\n");
      out.write("						<br> <input class=\"btn btn-outline-danger\" type=\"submit\" value=\"Get Files\">\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- upload doc Tab close-->\r\n");
      out.write("			<!--FY Tab-->\r\n");
      out.write("			<div class=\"tab-pane fade\" id=\"nav-profile\" role=\"tabpanel\" aria-labelledby=\"nav-profile-tab\">\r\n");
      out.write("				<div class=\"container p-2\">\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("						<thead class=\"thead-dark\">\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th scope=\"col\">Subject</th>\r\n");
      out.write("								<th scope=\"col\">Year</th>\r\n");
      out.write("								<th scope=\"col\">Sem</th>\r\n");
      out.write("								<th scope=\"col\">FileName</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							");

							PreparedStatement pstmt = con.prepareStatement("select * from db where course=? and year=?");
							pstmt.setString(1, c);
							pstmt.setString(2, "fy");
							ResultSet rs = pstmt.executeQuery();

							while (rs.next()) {
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>");
      out.print(rs.getString("sub"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(rs.getString("year"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(rs.getString("sem"));
      out.write("</td>\r\n");
      out.write("								<td><a href=\"#\">");
      out.print(rs.getString("FileName"));
      out.write("</a></td>\r\n");
      out.write("\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"downloadFiles\" method=\"post\">\r\n");
      out.write("										<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(rs.getString("FileName"));
      out.write("\"\r\n");
      out.write("											hidden> <input type=\"submit\" class=\"btn btn-sm btn-primary\"\r\n");
      out.write("											value=\"Download\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"FileReadPdf\" method=\"post\">\r\n");
      out.write("										<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(rs.getString("FileName"));
      out.write("\"\r\n");
      out.write("											hidden> <input type=\"submit\" class=\"btn btn-sm btn-warning\" value=\"View\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--FY Tab close-->\r\n");
      out.write("			<!--SY Tab-->\r\n");
      out.write("			<div class=\"tab-pane fade\" id=\"nav-contact\" role=\"tabpanel\" aria-labelledby=\"nav-contact-tab\">\r\n");
      out.write("				<div class=\"container p-2\">\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("						<thead class=\"thead-dark\">\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th scope=\"col\">Subject</th>\r\n");
      out.write("								<th scope=\"col\">Year</th>\r\n");
      out.write("								<th scope=\"col\">Sem</th>\r\n");
      out.write("								<th scope=\"col\">FileName</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							");

							PreparedStatement pstmt2 = con.prepareStatement("select * from db where course=? and year=?");
							pstmt2.setString(1, c);
							pstmt2.setString(2, "sy");
							ResultSet rs2 = pstmt2.executeQuery();

							while (rs2.next()) {
							
      out.write("\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>");
      out.print(rs2.getString("sub"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(rs2.getString("year"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(rs2.getString("sem"));
      out.write("</td>\r\n");
      out.write("								<td><a href=\"#\"> ");
      out.print(rs2.getString("FileName"));
      out.write("</a></td>\r\n");
      out.write("\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"downloadFiles\" method=\"post\">\r\n");
      out.write("										<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(rs2.getString("FileName"));
      out.write("\"\r\n");
      out.write("											hidden> <input type=\"submit\" class=\"btn btn-sm btn-primary\"\r\n");
      out.write("											value=\"Download\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"FileReadPdf\" method=\"post\">\r\n");
      out.write("										<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(rs2.getString("FileName"));
      out.write("\"\r\n");
      out.write("											hidden> <input type=\"submit\" class=\"btn btn-sm btn-warning\" value=\"View\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--SY Tab close  -->\r\n");
      out.write("			<!--TY Tab-->\r\n");
      out.write("			<div class=\"tab-pane fade\" id=\"nav-third\" role=\"tabpanel\" aria-labelledby=\"nav-third-tab\">\r\n");
      out.write("				<div class=\"container p-2\">\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("						<thead class=\"thead-dark\">\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th scope=\"col\">Subject</th>\r\n");
      out.write("								<th scope=\"col\">Year</th>\r\n");
      out.write("								<th scope=\"col\">Sem</th>\r\n");
      out.write("								<th scope=\"col\">FileName</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							");

							PreparedStatement pstmt3 = con.prepareStatement("select * from db where course=? and year=?");
							pstmt3.setString(1, c);
							pstmt3.setString(2, "ty");
							ResultSet rs3 = pstmt3.executeQuery();

							while (rs3.next()) {
							
      out.write("\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>");
      out.print(rs3.getString("sub"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(rs3.getString("year"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(rs3.getString("sem"));
      out.write("</td>\r\n");
      out.write("								<td><a href=\"#\"> ");
      out.print(rs3.getString("FileName"));
      out.write("</a></td>\r\n");
      out.write("\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"downloadFiles\" method=\"post\">\r\n");
      out.write("										<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(rs3.getString("FileName"));
      out.write("\"\r\n");
      out.write("											hidden> <input type=\"submit\" class=\"btn btn-sm btn-primary\"\r\n");
      out.write("											value=\"Download\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"FileReadPdf\" method=\"post\">\r\n");
      out.write("										<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(rs3.getString("FileName"));
      out.write("\"\r\n");
      out.write("											hidden> <input type=\"submit\" class=\"btn btn-sm btn-warning\" value=\"View\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--TY Tab close  -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- Notice Model -->\r\n");
      out.write("		<div class=\"modal fade\" id=\"myModal\">\r\n");
      out.write("			<div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("			  <div class=\"modal-content\">\r\n");
      out.write("			  \r\n");
      out.write("				<!-- Modal Header -->\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("				  <h4 class=\"modal-title\">Important Notices</h4>\r\n");
      out.write("				  <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<!-- Modal body -->\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<table class=\"table table-hover container\" >\r\n");
      out.write("						<thead>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th>Date</th>\r\n");
      out.write("								<th>Notice</th>\r\n");
      out.write("								<th>&nbsp;</th>\r\n");
      out.write("								\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							");

							PreparedStatement pstmt4 = con.prepareStatement("select * from notices where course =?");
							pstmt4.setString(1, c);
							ResultSet data = pstmt4.executeQuery();
							
							while(data.next()){
								
      out.write("\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>");
      out.print(data.getString("uploadDate"));
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print(data.getString("fileName"));
      out.write("</td>\r\n");
      out.write("								<td>\r\n");
      out.write("									<form action=\"ReadNotice\" method=\"post\">\r\n");
      out.write("											<input type=\"text\" name=\"uploadFileName\" value=\"");
      out.print(data.getString("FileName"));
      out.write("\"\r\n");
      out.write("												hidden> <input type=\"submit\" class=\"btn btn-sm btn-warning\" value=\"View\">\r\n");
      out.write("										</form>\r\n");
      out.write("								</td>\r\n");
      out.write("								\r\n");
      out.write("							</tr>\r\n");
      out.write("							");

							}
						
      out.write("\r\n");
      out.write("	\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("	\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<!-- Modal footer -->\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("				  <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			  </div>\r\n");
      out.write("			</div>\r\n");
      out.write("		  </div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	out.print("</body>");
	} else {
	out.print("<center><h4>Invalid email and password:)<br>Retry..</h4><center>");
	//response.sendRedirect("stuLogin.jsp");
	RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
	rd.include(request, response);
	}
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navBottom.jsp", out, false);
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\" src=\"stuDashboard.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
