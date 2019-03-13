<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>AUTHOR</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${BOOK}">
					<tr>
						<td>${book.id}</td>
						<td>${book.name}</td>
						<td>${book.author.name}</td>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>