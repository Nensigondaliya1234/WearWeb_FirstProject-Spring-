<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area</title>
</head>
<body>
<form action="savearea" method="post">
      <input type="text" name="areaname" placeholder="Area Name" required>
      <br><br>
      <select name="cityId" required>
          <option >Select City</option>
          <c:forEach items="${allCity}" var="s">
              <option value="${s.cityId}">${s.cityname}</option>
          </c:forEach>
      </select>
      <br><br>
      <button type="submit">Add</button>
</form>
</body>
</html>
