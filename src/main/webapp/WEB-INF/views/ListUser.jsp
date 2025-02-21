<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Profiles</title>

</head>

<body>
	<h2>List Cart</h2>

	<table border="1">
		<c:forEach items="${userList}" var="m">

			<tr>
			    <td>${m.userId }</td>
				<td>${m.firstName }</td>
				<td>${m.lastName }</td>
				<td>${m.email }</td>
				<td>${m.contactNum }</td>
				<td>${m.createdAt }</td>
				<td><a href="viewuser?userId=${m.userId}">View</a> | <a href="deleteuser?userId=${m.userId}">Delete</a> | Edit </td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>

