
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Area</title>
</head>
<body>
	<h2>List Area</h2>

	<table border="1">
	<tr>
			<th>AreaName</th>
		</tr>
		<c:forEach items="${areaList}" var="m">

			<tr>
				<td>${m.areaname }</td>
				<td><a href="viewarea?areaId=${m.areaId}">View</a> | <a href="deletearea?areaId=${m.areaId}">Delete</a> | Edit </td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
