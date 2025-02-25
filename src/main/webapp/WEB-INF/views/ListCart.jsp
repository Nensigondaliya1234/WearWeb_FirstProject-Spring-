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
		<h2 class="mb-3 text-center">List Cart</h2>

		<table class="table table-bordered table-striped">
			<thead class="table-dark">
				<tr>
					<th>Quantity</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cartList}" var="m">
					<tr>
						<td>${m.quantity}</td>
						<td>
							<a href="viewcart?cartId=${m.cartId}" class="btn btn-primary btn-sm">View</a>
							<a href="deletecart?cartId=${m.cartId}" class="btn btn-danger btn-sm">Delete</a>
							<a href="editcart?cartId=${m.cartId}" class="btn btn-warning btn-sm">Edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<!-- Bootstrap JS Bundle -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
