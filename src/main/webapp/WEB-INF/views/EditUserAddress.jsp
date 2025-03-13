<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="updateuseraddress" method="post">
        
            <div class="form-group">
            
                <label for="title">Title</label>
                <input type="text" id="title" name="title" class="form-control"  value="${useraddress.title}" required>
            </div>

            <div class="form-group">
                <label for="unitName">Unit Name</label>
                <input type="text" id="unitName" name="unitName" class="form-control" value="${useraddress.unitName}" required>
            </div>

            <div class="form-group">
                <label for="street">Street</label>
                <input type="text" id="street" name="street" class="form-control" value="${useraddress.street}" required>
            </div>

            <div class="form-group">
                <label for="landMark">Landmark</label>
                <input type="text" id="landMark" name="landMark" class="form-control" value="${useraddress.landMark}" required>
            </div>
            <div class="form-group">
                <label for="zipCode">Zip Code</label>
                <input type="number" id="zipCode" name="zipcode" class="form-control"  value="${useraddress.zipcode}" required>
            </div>
             <input type="hidden" name="userAddressId"  value="${useraddress.userAddressId}"/>
            
            <button type="submit" class="btn btn-primary btn-block">Update Address</button>
        </form>

</body>
</html>