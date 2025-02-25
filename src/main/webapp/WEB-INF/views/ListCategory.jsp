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

<div class="container mt-5">
	<h2 class="mb-4">List Cart</h2>

	<table class="table table-bordered table-striped">
		<thead class="table-dark">
			<tr>
				<th>Category Name</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${categoryList}" var="m">
				<tr>
					<td>${m.categoryname }</td>
					<td>
						<a href="viewcategory?categoryId=${m.categoryId}" class="btn btn-primary btn-sm">View</a>
						<a href="deletecategory?categoryId=${m.categoryId}" class="btn btn-danger btn-sm">Delete</a>
						<a href="editcategory?categoryId=${m.categoryId}" class="btn btn-warning btn-sm">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<!-- Bootstrap JS (Optional if needed for other functionalities) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
