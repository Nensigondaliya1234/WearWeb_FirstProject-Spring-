<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatecategory" method="post">
            <h2>Category Form</h2>
            <input type="text" name="categoryname" value="${category.categoryname}" placeholder="categoryname" required>
            <input type="hidden" name="categoryId"  value="${category.categoryId}"/>
            
            <button type="submit">Update</button>
        </form>
</body>
</html>