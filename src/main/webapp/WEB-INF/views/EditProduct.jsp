<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateproduct" method="post">
            
		          
		<br>
		   <input type="text" name="productName" placeholder="productName" value="${product.productName}" required>
            <input type="number" name="offerePrice" placeholder="Offer Price" value="${product.offerePrice}" required>
            <input type="number" name="offerePercentage" placeholder="Offer Percentage" value="${product.offerePrice}" required>
            <input type="url" name="productImageURL1" placeholder="Product Image URL 1" value="${product.productImageURL1}"required>
            <input type="url" name="productImageURL2" placeholder="Product Image URL 2" value="${product.productImageURL2}">
            <input type="url" name="productImageURL3" placeholder="Product Image URL 3" value="${product.productImageURL3}">
            <input type="hidden" name="productId"  value="${product.productId}"/>
            
            <button type="submit">Add Product</button>
        </form>
</body>
</html>