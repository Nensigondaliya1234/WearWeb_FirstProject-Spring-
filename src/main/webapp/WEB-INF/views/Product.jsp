<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #ff9a9e, #fad0c4);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .product-form-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 20px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .product-form-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .product-form-container input[type="text"],
        .product-form-container input[type="number"],
        .product-form-container input[type="url"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .product-form-container button {
            width: 100%;
            padding: 10px;
            background: #ff758c;
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background 0.3s ease;
        }

        .product-form-container button:hover {
            background: linear-gradient(135deg, #e66782, #e6739c);
        }
    </style>
</head>
<body>
    <div class="product-form-container">
        <form action="saveproduct" method="post">
            <h2>Add Product</h2>
            <input type="text" name="productName" placeholder="Product Name" required>
		<div class="form-group">
                <label for="categoryId">Category</label>
                <select name="categoryId" id="categoryId" class="form-control" required>
                    <option value="">Select Category</option>
                    <c:forEach items="${allCategory}" var="s">
                        <option value="${s.categoryId}">${s.categoryname}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="subCategoryId">SubCategory</label>
                <select name="subCategoryId" id="subCategoryId" class="form-control" required>
                    <option value="">Select SubCategory</option>
                    <c:forEach items="${allSubCategory}" var="s">
                        <option value="${s.subCategoryId}">${s.subCategoryname}</option>
                    </c:forEach>
                </select>
            </div>
            
		<br>
            <input type="number" name="basePrice" placeholder="Base Price" required>
            <input type="number" name="offerePrice" placeholder="Offer Price" required>
            <input type="number" name="offerePercentage" placeholder="Offer Percentage" required>
            <input type="text" name="productDetail" placeholder="Product Detail" required>
            <input type="file" name="productImage" placeholder="Product Image URL 1" required>
            <input type="file" name="productImage2" placeholder="Product Image URL 2">
            <input type="file" name="productImage3" placeholder="Product Image URL 3">
            <input type="number" name="quantity" placeholder="Quntity" required>
            <button type="submit">Add Product</button>
        </form>
    </div>
</body>
</html>
