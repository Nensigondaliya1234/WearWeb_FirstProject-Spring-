<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatereviews" method="post">
        <br>
            
            
            <label for="reviewText">Review Text</label>
            <textarea id="reviewText" name="reviewText" rows="4" value="${reviews.reviewText}" required></textarea>
            
            <label for="rating">Rating</label>
            <input type="number" id="rating" name="rating" min="1" max="5" value="${reviews.rating}" required>
            <input type="hidden" name="reviewsId"  value="${reviews.reviewsId}"/>
            
            <button type="submit">Update</button>
        </form>
</body>
</html>