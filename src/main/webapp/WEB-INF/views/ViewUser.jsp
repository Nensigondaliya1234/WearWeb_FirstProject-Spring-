<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Users</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4">
        <h2 class="text-center mb-4">View Users</h2>
        
        <table class="table table-bordered">
            <tbody>
                <tr>
                    <th>User ID</th>
                    <td>${user.userId}</td>
                </tr>
                <tr>
                    <th>First Name</th>
                    <td>${user.firstName}</td>
                </tr>
                <tr>
                    <th>Last Name</th>
                    <td>${user.lastName}</td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td>${user.email}</td>
                </tr>
                <tr>
                    <th>Contact Number</th>
                    <td>${user.contactNum}</td>
                </tr>
                <tr>
                    <th>Created At</th>
                    <td>${user.createdAt}</td>
                </tr>
            </tbody>
        </table>

        <%-- <a href="viewuser" class="btn btn-primary">Back</a>--%>
    </div>
</div>

<!-- Bootstrap JS (optional, for components that require JavaScript) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
