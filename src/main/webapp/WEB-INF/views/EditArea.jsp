<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatearea" method="post">
      <input type="text" name="areaname" value="${area.areaname}" placeholder="Area Name" required>
      <br>
      <input type="hidden" name="areaId"  value="${area.areaId}"/>
      
      <br>
      <button type="submit">Update</button>
</form>
</body>
</html>