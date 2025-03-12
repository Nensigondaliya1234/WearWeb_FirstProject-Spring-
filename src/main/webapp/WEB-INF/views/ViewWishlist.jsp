
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<table class="table datatable datatable-table table-hover" id="wishlist">
										<thead>
										  <th>createdAt</th>
										  <th>ProductName</th>
										  <th>FirstName</th>
										  <th>LastName</th>
										  </thead>

										<tbody>
												<tr>
												    <td>${wishlist[0][1]}</td>
												    <td>${wishlist[0][4]}</td>
												    <td>${wishlist[0][5]}</td>
												    <td>${wishlist[0][6]}</td>
                                                   


												</tr>
										</tbody>

									</table>

</body>
</html>
