<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View OrderDetail</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">

    <div class="card shadow-lg p-4">
        <h2 class="text-center text-primary mb-4">View Order Detail</h2>

        <table class="table datatable datatable-table table-hover" id="orderDetail">
										<thead>
										  <th>Status</th>
                                          <th>Quantity</th>
                                          <th>Price</th>
                                          <th>productName</th>
                                          <th>TotalAmount</th>
                                          
										</thead>

										<tbody>
											
												<tr>
												    <td>${orderDetail[0][5]}</td>
                                                    <td>${orderDetail[0][4]}</td>
                                                    <td>${orderDetail[0][2]}</td>
                                                    <td>${orderDetail[0][7]}</td>
                                                    <td>${orderDetail[0][6]}</td>
							             			
												</tr>
											
										</tbody>

									</table>
        <%-- <a href="orders.jsp" class="btn btn-primary mt-3">Back to Orders</a>--%>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
