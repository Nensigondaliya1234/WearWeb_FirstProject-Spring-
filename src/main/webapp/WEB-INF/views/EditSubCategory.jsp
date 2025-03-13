<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatesubcategory" method="post">
                       
            <label for="subCategoryName">Sub-Category Name</label>
            <input type="text" id="subCategoryname" name="subCategoryname" value="${subcategory.subCategoryname}" required>
            <input type="hidden" name="subCategoryId"  value="${subcategory.subCategoryId}"/>
            
            <button type="submit">Update</button>
        </form>
</body>
</html>