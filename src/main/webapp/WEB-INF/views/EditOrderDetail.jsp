<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateorderdetail" method="post">
            
            <label for="quantity">Quantity</label>
            <input type="number" id="quantity" name="quantity" value="${orderdetail.quantity}" required>
               
          <input type="hidden" name="orderDetailId"  value="${orderdetail.orderDetailId}"/>
      

            
            <button type="submit">Update</button>
        </form>
</body>
</html>