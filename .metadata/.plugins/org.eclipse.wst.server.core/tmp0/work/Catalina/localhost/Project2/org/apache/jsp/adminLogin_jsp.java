/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2023-03-16 13:19:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1678970898584L));
    _jspx_dependants.put("/Bootstrap/Bootstrap.jsp", Long.valueOf(1676569842580L));
    _jspx_dependants.put("/navBottom.jsp", Long.valueOf(1674328894742L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"ISO-8859-1\">\r\n");
      out.write("	<title>Admin Login</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg container-fluid\">\r\n");
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
      out.write("				<li class=\"nav-item\"><a class=\"nav-link \" href=\"adminLogin.jsp\">Admin\r\n");
      out.write("						Login</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<!-- <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a class=\"btn btn-info\" href=\"stuReg.jsp\"><span class=\"glyphicon glyphicon-user \"></span> Sign Up</a></li>&nbsp;&nbsp;\r\n");
      out.write("      <li><a class=\"btn btn-warning\" href=\"stuLogin.jsp\"><span class=\"glyphicon glyphicon-log-in \"></span> Login</a></li>\r\n");
      out.write("    </ul> -->\r\n");
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
      out.write("	<div class=\"text-center\">");
      out.print(request.getAttribute("msg") );
      out.write("</div>\r\n");
      out.write("	<br><br><br><br><br>\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div class=\"col-md-4\"></div>\r\n");
      out.write("		<div class=\"col-md-4\">\r\n");
      out.write("			<div class=\"global-container\">\r\n");
      out.write("				<div class=\"card login-form\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h3 class=\"card-title text-center\">Admin Login</h3>\r\n");
      out.write("						<div class=\"card-text\">\r\n");
      out.write("\r\n");
      out.write("							<form action=\"adminDashboard.jsp\" method=\"post\">\r\n");
      out.write("								<!-- to error: add class \"has-danger\" -->\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("									<label for=\"exampleInputEmail1\">Email address</label>\r\n");
      out.write("									<input type=\"email\" name=\"email\" class=\"form-control form-control-sm\"\r\n");
      out.write("										id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required\r\n");
      out.write("										placeholder=\"Enter username\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("									<label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("									<input type=\"password\" name=\"pwd\" class=\"form-control form-control-sm\"\r\n");
      out.write("										id=\"exampleInputPassword1\" required placeholder=\"Enter password\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" style=\"float:right;font-size:12px;\">Forgot password?</a>\r\n");
      out.write("								<br><br>\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\r\n");
      out.write("\r\n");
      out.write("								<div class=\"sign-up\">\r\n");
      out.write("									Don't have an account? <a href=\"register.jsp\">Create One</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<br><br>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("   ");
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
      out.write("<body><br><br>\r\n");
      out.write("<nav class=\"text-center\">\r\n");
      out.write("<hr>\r\n");
      out.write("<p>Made with &#10084; by Ganesh Malode</p>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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