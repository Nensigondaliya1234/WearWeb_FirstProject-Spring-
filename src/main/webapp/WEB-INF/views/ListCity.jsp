
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
	<h2>List City</h2>

	<table border="1">
		<c:forEach items="${cityList}" var="m">

			<tr>
				<td>${m.cityname }</td>
				<td><a href="viewcity?cityId=${m.cityId}">View</a> | <a href="deletecity?cityId=${m.cityId}">Delete</a> | Edit </td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
