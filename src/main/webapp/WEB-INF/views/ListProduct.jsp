
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
		<c:forEach items="${productList}" var="m">

			<tr>
				<td>${m.productId }</td>
				<td>${m.productName }</td>
				<td>${m.basePrice }</td>
				<td>${m.offerePercentage }</td>
				<td>${m.offerePrice }</td>
				<td>${m.productDetail }</td>
				<td>${m.productImageURL1 }</td>
				<td>${m.productImageURL2 }</td>
				<td>${m.productImageURL3 }</td>
				<td>${m.quantity }</td>
				<td><a href="viewproduct?productId=${m.productId}">View</a> | <a href="deleteproduct?productId=${m.productId}">Delete</a> | Edit </td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
