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
        <h2 class="text-center mb-4">List Cart</h2>

        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>Product ID</th>
                    <th>Product Name</th>
                    <th>Base Price</th>
                    <th>Offer Percentage</th>
                    <th>Offer Price</th>
                    <th>Product Detail</th>
                    <th>Image 1</th>
                    <th>Image 2</th>
                    <th>Image 3</th>
                    <th>Quantity</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${productList}" var="m">
                    <tr>
                        <td>${m.productId}</td>
                        <td>${m.productName}</td>
                        <td>${m.basePrice}</td>
                        <td>${m.offerePercentage}%</td>
                        <td>${m.offerePrice}</td>
                        <td>${m.productDetail}</td>
                        <td><img src="${m.productImageURL1}" alt="Image 1" width="50"></td>
                        <td><img src="${m.productImageURL2}" alt="Image 2" width="50"></td>
                        <td><img src="${m.productImageURL3}" alt="Image 3" width="50"></td>
                        <td>${m.quantity}</td>
                        <td>
                            <a href="viewproduct?productId=${m.productId}" class="btn btn-info btn-sm">View</a>
                            <a href="deleteproduct?productId=${m.productId}" class="btn btn-danger btn-sm">Delete</a>
                            <a href="editproduct?productId=${m.productId}" class="btn btn-warning btn-sm">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>