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
<body class="container mt-4">
    <h2 class="text-center mb-4">List Cart</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Rating</th>
                <th>Review Text</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${reviewsList}" var="m">
                <tr>
                    <td>${m.reviewsId}</td>
                    <td>${m.rating}</td>
                    <td>${m.reviewText}</td>
                    <td>
                        <a href="viewreviews?reviewsId=${m.reviewsId}" class="btn btn-info btn-sm">View</a>
                        <a href="deletereviews?reviewsId=${m.reviewsId}" class="btn btn-danger btn-sm">Delete</a>
                        <a href="editreviews?reviewsId=${m.reviewsId}" class="btn btn-warning btn-sm">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
