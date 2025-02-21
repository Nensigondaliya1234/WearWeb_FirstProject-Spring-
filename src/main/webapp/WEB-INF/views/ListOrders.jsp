
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Cart</title>
</head>
<body>
	<h2>List Cart</h2>

	<table border="1">
		<c:forEach items="${ordersList}" var="m">

			<tr>
				<td>${m.orderId }</td>
				<td>${m.totalAmount }</td>
				<td>${m.status }</td>
				<td><a href="vieworders?orderId=${m.orderId}">View</a> | <a href="deleteorders?orderId=${m.orderId}">Delete</a> | Edit </td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
