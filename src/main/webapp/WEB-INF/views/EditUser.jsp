<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form class="row g-3 needs-validation" action="updateuser" method="post"   >
                    <div class="col-12">
                      <label for="firstName" class="form-label">First Name</label>
                      <input type="text" name="firstName" class="form-control" id="yourName" value="${user.firstName}" required>
                      <div class="invalid-feedback">Please, enter First name!</div>
                    </div>
                    
                    <div class="col-12">
                      <label for="lastName" class="form-label">Last Name</label>
                      <input type="text" name="lastName" class="form-control" id="yourName" value="${user.lastName}" required>
                      <div class="invalid-feedback">Please, enter Last name!</div>
                    </div>

                    <div class="col-12">
                      <label for="yourEmail" class="form-label">Your Email</label>
                      <input type="email" name="email" class="form-control" id="yourEmail" value="${user.email}" required>
                      <div class="invalid-feedback">Please enter a valid Email adddress!</div>
                    </div>
                                   
                     <div class="col-12">
                      <label for="contactNum" class="form-label">Contact Number</label>
                      <input type="text" name="contactNum" class="form-control" id="contactNum" value="${user.contactNum}" required>
                      <div class="invalid-feedback">Please, enter your Contact Number!</div>
                    </div>
                    <div class="col-12">
                      <label for="gender" class="form-label">Gender</label>
                      <input type="text" name="gender" class="form-control" id="yourName" value="${user.gender}" required>
                      <div class="invalid-feedback">Please, enter Gender</div>
                    </div>
             <input type="hidden" name="userId"  value="${user.userId}"/>
            
                    <div class="col-12">
                      <button class="btn btn-primary w-100" type="submit">Update</button>
                    </div>
                    
                  </form>
</body>
</html>