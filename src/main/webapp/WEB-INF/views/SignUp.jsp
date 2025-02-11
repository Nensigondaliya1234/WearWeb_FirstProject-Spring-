<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="saveuser" method="post">
    User name:<input type="text" name="username"/>
    <br><br>
    Email: <input type="text" name="email"/>
    <br><br>
    Password:<input type="Password" name="password"/>
    <br>
    <input type="submit" value="SignUp"/>
    <br>
    <a href="login">Login</a>
</form>
</body>
</html>