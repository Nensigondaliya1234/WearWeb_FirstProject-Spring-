<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Quantity</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">

    <div class="card shadow-lg p-4">
        <table class="table datatable datatable-table table-hover" id="cart">
										<thead>
										
								       <th>Quantity</th>
								       <th>Product Name</th>
								       <th>First Name</th>
								       <th>Last Name</th>
								      
										</thead>

										<tbody>
											<!--<c:forEach items="${cart}" var="u">-->
												<tr>
												    
													<td>${cart[0][2]}</td>
													<td>${cart[0][4]}</td>
													<td>${cart[0][5]}</td>
													<td>${cart[0][6]}</td>
							             			
												</tr>
											<!--</c:forEach>-->
										</tbody>

									</table>

    </div>

    <!-- Bootstrap JS (Optional, for interactive components) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
