<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sub-Category Details</title>
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

        .subcategory-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 20px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .subcategory-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .subcategory-container input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .subcategory-container button {
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

        .subcategory-container button:hover {
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
    <div class="subcategory-container">
        <h2>Sub-Category Details</h2>
        <form action="savesubcategory" method="post">
        <br> Ctegory: <select name="categoryId">
			<option>Select Category</option>
			
			<c:forEach items="${allCategory}" var="s">

					<option value="${s.categoryId}">${s.categoryname }</option>
			
			</c:forEach>

		</select> <br>
            <input type="hidden" name="category_id" value="12345">
            
            <label for="subCategoryName">Sub-Category Name</label>
            <input type="text" id="subCategoryname" name="subCategoryname" value="Electronics" required>
            
            <button type="submit">Update Sub-Category</button>
        </form>
        
        <p class="back-link"><a href="categoryPage">Back to Category</a></p>
    </div>
</body>
</html>
