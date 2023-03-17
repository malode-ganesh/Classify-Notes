<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="UploadFileServlet" enctype="multipart/form-data">
<br><br><br>
<label>Id :</label><input type="number" name="id" required><br><br><br>
<label>Upload File :</label><input type="file" accept="application/pdf, application/docx" name="pdf" required><br>
<input type="submit" name="Submit">
</form>
</body>
</html>