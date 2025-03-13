<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateorder" method="post">
            
            <label for="status">Order Status</label>
            <select id="status" name="status" value="${order.status}" required>
                <option value="Shipped" selected>Shipped</option>
                <option value="Pending">Pending</option>
                <option value="Delivered">Delivered</option>
                <option value="Cancelled">Cancelled</option>
            </select>
                  <input type="hidden" name="orderId"  value="${order.orderId}"/>
            
            <button type="submit">Update</button>
        </form>
</body>
</html>