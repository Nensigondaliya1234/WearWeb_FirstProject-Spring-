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
    <h2 class="text-center">List Cart</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>Wishlist ID</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${wishlistList}" var="m">
                <tr>
                    <td>${m.wishlistId}</td>
                    <td>
                        <a href="viewwishlist?wishlistId=${m.wishlistId}" class="btn btn-info btn-sm">View</a>
                        <a href="deletewishlist?wishlistId=${m.wishlistId}" class="btn btn-danger btn-sm">Delete</a>
                        <a href="editwishlist?wishlistId=${m.wishlistId}" class="btn btn-warning btn-sm">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
