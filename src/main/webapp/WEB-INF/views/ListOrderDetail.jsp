
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
		<c:forEach items="${orderdetailList}" var="m">

			<tr>
				<td>${m.orderDetailId }</td>
				<td>${m.quantity }</td>
				<td>${m.price }</td>
				<td>${m.status }</td>
				<td><a href="vieworderdetail?orderDetailId=${m.orderDetailId}">View</a> | <a href="deleteorderdetail?orderDetailId=${m.orderDetailId}">Delete</a> | Edit </td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
