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
        <table class="table datatable datatable-table table-hover" id="useraddress">
										<thead>
                                          <th>Title</th>
                                          <th>Unit Name</th>
                                          <th>Street</th>
                                          <th>AddressDetail</th>
                                          <th>Landmark</th>
                                          <th>Zipcode</th>
                                          <th>StateName</th>
                                          <th>CityName</th>
                                          <th>FirstName</th>
                                          <th>LatName</th>
                                          </thead>

										<tbody>
												<tr>
                                                    <td>${userAddress[0][7]}</td>
                                                    <td>${userAddress[0][8]}</td>
                                                    <td>${userAddress[0][6]}</td>
                                                    <td>${userAddress[0][1]}</td>
                                                    <td>${userAddress[0][4]}</td>
                                                    <td>${userAddress[0][10]}</td>
                                                    <td>${userAddress[0][12]}</td>
                                                    <td>${userAddress[0][11]}</td>
                                                    <td>${userAddress[0][13]}</td>
                                                    <td>${userAddress[0][14]}</td>
                                                    
												</tr>
										</tbody>

									</table>


    </div>

    <!-- Bootstrap JS (optional for interactive components) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
