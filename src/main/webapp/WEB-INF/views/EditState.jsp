<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatestate" method="post">
      <input type="text" name="statename" placeholder="State Name" value="${state.statename}" required>
      <br><br>
       <input type="hidden" name="stateId"  value="${state.stateId}"/>
      
       <button type="submit">Update</button>
</form>

</body>
</html>