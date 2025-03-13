<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatecity" method="post">
      <input type="text" name="cityname" value="${city.cityname}" placeholder="City Name" required>
      <br><br>
       <input type="hidden" name="cityId"  value="${city.cityId}"/>
      
      <br><br>
       <button type="submit">Update</button>
</form>
</body>
</html>