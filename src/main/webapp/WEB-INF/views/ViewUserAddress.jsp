<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View User Address</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">

    <h2 class="text-primary mb-4">View User Address</h2>

    <div class="card shadow-sm p-4">
        <p><strong>Title:</strong> ${useraddress.title }</p>
        <p><strong>Unit Name:</strong> ${useraddress.unitName }</p>
        <p><strong>Street:</strong> ${useraddress.street }</p>
        <p><strong>Landmark:</strong> ${useraddress.landMark }</p>
        <p><strong>Zipcode:</strong> ${useraddress.zipcode }</p>
    </div>

    <!-- Bootstrap JS (optional for interactive components) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
