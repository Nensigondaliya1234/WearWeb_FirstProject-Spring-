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
        <h2 class="mb-4">List Cart</h2>

        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>Subcategory ID</th>
                    <th>Subcategory Name</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${subcategoryList}" var="m">
                    <tr>
                        <td>${m.subCategoryId}</td>
                        <td>${m.subCategoryname}</td>
                        <td>
                            <a href="viewsubcategory?subCategoryId=${m.subCategoryId}" class="btn btn-primary btn-sm">View</a>
                            <a href="deletesubcategory?subCategoryId=${m.subCategoryId}" class="btn btn-danger btn-sm">Delete</a>
                            <a href="editsubcategory?subCategoryId=${m.subCategoryId}" class="btn btn-warning btn-sm">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
