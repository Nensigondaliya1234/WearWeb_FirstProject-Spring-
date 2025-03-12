<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View City</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">

    <div class="card shadow p-4">
        <table class="table datatable datatable-table table-hover" id="city">
										<thead>
										<th>CityName</th>
										<th>StateName</th>
								        
										</thead>

										<tbody>
												<tr>
												    <td>${city[0][1]}</td>
													<td>${city[0][3]}</td>
							             			
												</tr>
											
										</tbody>

									</table>
    </div>

    <!-- Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
