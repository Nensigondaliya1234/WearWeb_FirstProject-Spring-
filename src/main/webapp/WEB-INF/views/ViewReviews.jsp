<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Reviews</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-sm">
        <div class="card-header bg-primary text-white">
            <h2 class="mb-0">View Reviews</h2>
        </div>
        <div class="card-body">
            <table class="table datatable datatable-table table-hover" id="reviews">
										<thead>
                                          <th>Rating</th>
                                          <th>Review Text</th>
                                          <th>ProductName</th>
                                          <th>FirstName</th>
                                          <th>LastName</th>
                                          
										</thead>

										<tbody>
											
												<tr>
                                                    <td>${reviews[0][3]}</td>
                                                    <td>${reviews[0][4]}</td>
                                                    <td>${reviews[0][6]}</td>
                                                    <td>${reviews[0][7]}</td>
                                                    <td>${reviews[0][8]}</td>
							             			
												</tr>
											
										</tbody>

									</table>


        </div>
    </div>
</div>

<!-- Bootstrap JS Bundle (optional for interactive components) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
