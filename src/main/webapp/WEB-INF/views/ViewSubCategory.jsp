<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View SubCategory</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h2 class="mb-0">View SubCategory</h2>
        </div>
        <div class="card-body">
            <table class="table table-bordered">
                <tr>
                    <th>SubCategory ID</th>
                    <td>${subcategory.subCategoryId}</td>
                </tr>
                <tr>
                    <th>SubCategory Name</th>
                    <td>${subcategory.subCategoryname}</td>
                </tr>
            </table>
        </div>
    </div>
</div>

<!-- Bootstrap JS (Optional, needed for some Bootstrap features) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
