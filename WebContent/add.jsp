<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert book</title>
</head>
<body>
<form method="post" action="AddServlet">
		Enter book name<br> <input type="text" name="name" required><br>
		Enter author name<br> <input type="text" name="aname" required><br>
		<button type="submit">Add</button>
	</form>
</body>
</html>