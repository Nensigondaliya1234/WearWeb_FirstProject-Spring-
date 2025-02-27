<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Review</title>
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

        .review-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 20px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .review-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .review-container textarea,
        .review-container input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .review-container button {
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

        .review-container button:hover {
            background: linear-gradient(135deg, #e66782, #e6739c);
        }

        .back-link {
            margin-top: 20px;
        }

        .back-link a {
            color: #ff758c;
            text-decoration: none;
            font-weight: bold;
        }

        .back-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="review-container">
        <h2>Product Review</h2>
        <form action="savereviews" method="post">
        <br> Product: <select name="productId">
			<option>Select Product</option>
			
			<c:forEach items="${allProduct}" var="s">

					<option value="${s.productId}">${s.productName }</option>
			
			</c:forEach>

		</select> <br>
            
            
            <label for="reviewText">Review Text</label>
            <textarea id="reviewText" name="reviewText" rows="4" required></textarea>
            
            <label for="rating">Rating</label>
            <input type="number" id="rating" name="rating" min="1" max="5" value="5" required>
            
            <button type="submit">Submit Review</button>
        </form>
        
        <p class="back-link"><a href="product">Back to Product</a></p>
    </div>
</body>
</html>
