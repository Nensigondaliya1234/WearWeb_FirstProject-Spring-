<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="savecity" method="post">
      <input type="text" name="cityname" placeholder="City Name" required>
      <br><br>
      <select name="stateId" required>
          <option >Select State</option>
          <c:forEach items="${allState}" var="s">
              <option value="${s.stateId}">${s.statename}</option>
          </c:forEach>
      </select>
      <br><br>
       <button type="submit">Add</button>
</form>
</body>
</html>