<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>List Cart</title>
	<!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<div class="container mt-4">
		<h2 class="mb-4 text-center">List Cart</h2>

		<table class="table table-bordered table-hover">
			<thead class="table-dark">
				<tr>
					<th>State ID</th>
					<th>State Name</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${stateList}" var="m">
					<tr>
						<td>${m.stateId}</td>
						<td>${m.statename}</td>
						<td>
							<a href="viewstate?stateId=${m.stateId}" class="btn btn-primary btn-sm">View</a>
							<a href="deletestate?stateId=${m.stateId}" class="btn btn-danger btn-sm">Delete</a>
							<a href="editstate?stateId=${m.stateId}" class="btn btn-warning btn-sm">Edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<!-- Bootstrap JS (optional, for interactivity) -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
