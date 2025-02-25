<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Cart</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h2 class="mb-3">List Cart</h2>

        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>Order Detail ID</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Status</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${orderdetailList}" var="m">
                    <tr>
                        <td>${m.orderDetailId}</td>
                        <td>${m.quantity}</td>
                        <td>${m.price}</td>
                        <td>${m.status}</td>
                        <td>
                            <a href="vieworderdetail?orderDetailId=${m.orderDetailId}" class="btn btn-primary btn-sm">View</a>
                            <a href="deleteorderdetail?orderDetailId=${m.orderDetailId}" class="btn btn-danger btn-sm">Delete</a>
                            <a href="#" class="btn btn-warning btn-sm">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
