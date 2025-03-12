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
            <table class="table datatable datatable-table table-hover" id="subCategory">
										<thead>
					                      <th>SubCategory Name</th>
					                      <th>CategoryName</th>
										</thead>

										<tbody>
												<tr>
                                                    <td>${subCategory[0][2]}</td>
                                                    <td>${subCategory[0][3]}</td>
                                                    
												</tr>
										</tbody>

									</table>
        </div>
    </div>
</div>

<!-- Bootstrap JS (Optional, needed for some Bootstrap features) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
