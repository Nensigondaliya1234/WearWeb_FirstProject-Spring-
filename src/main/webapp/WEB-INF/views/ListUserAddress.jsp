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
    <h2 class="mb-3">List Cart</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Unit Name</th>
                <th>Street</th>
                <th>Landmark</th>
                <th>Zipcode</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${useraddressList}" var="m">
                <tr>
                    <td>${m.userAddressId}</td>
                    <td>${m.title}</td>
                    <td>${m.unitName}</td>
                    <td>${m.street}</td>
                    <td>${m.landMark}</td>
                    <td>${m.zipcode}</td>
                    <td>
                        <a href="viewuseraddress?userAddressId=${m.userAddressId}" class="btn btn-info btn-sm">View</a>
                        <a href="deleteuseraddress?userAddressId=${m.userAddressId}" class="btn btn-danger btn-sm">Delete</a>
                        <a href="edituseraddress?userAddressId=${m.userAddressId}" class="btn btn-warning btn-sm">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS (optional for interactive components) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
