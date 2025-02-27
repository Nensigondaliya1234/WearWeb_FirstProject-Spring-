<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Address</title>
    <!-- Bootstrap 4 CDN -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #ff9a9e, #fad0c4);
            height: 100vh;
        }
        .address-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 30px;
            max-width: 500px;
            margin: auto;
        }
        .address-container h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .address-container .form-group {
            margin-bottom: 15px;
        }
        .address-container .form-control {
            border-radius: 5px;
        }
        .address-container .btn {
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            color: white;
            border-radius: 5px;
            font-size: 16px;
            transition: background 0.3s ease;
        }
        .address-container .btn:hover {
            background: linear-gradient(135deg, #e66782, #e6739c);
        }
        .back-link {
            margin-top: 20px;
            text-align: center;
        }
        .back-link a {
            color: #ff758c;
            font-weight: bold;
        }
        .back-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="address-container">
        <h2>User Address</h2>
        <form action="saveuseraddress" method="post">
        
            <div class="form-group">
                <label for="cityId">City</label>
                <select name="cityId" id="cityId" class="form-control" required>
                    <option value="">Select City</option>
                    <c:forEach items="${allCity}" var="s">
                        <option value="${s.cityId}">${s.cityname}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="stateId">State</label>
                <select name="stateId" id="stateId" class="form-control" required>
                    <option value="">Select State</option>
                    <c:forEach items="${allState}" var="s">
                        <option value="${s.stateId}">${s.statename}</option>
                    </c:forEach>
                </select>
            </div>
            
             <!-- <input type="hidden" name="userId" value="${userId}" /> -->
            <div class="form-group">
            
                <label for="title">Title</label>
                <input type="text" id="title" name="title" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="unitName">Unit Name</label>
                <input type="text" id="unitName" name="unitName" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="street">Street</label>
                <input type="text" id="street" name="street" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="landMark">Landmark</label>
                <input type="text" id="landMark" name="landMark" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="zipCode">Zip Code</label>
                <input type="number" id="zipCode" name="zipcode" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="addressDetail">Address Detail</label>
                <input type="text" id="addressDetail" name="addressDetail" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Update Address</button>
        </form>

        <p class="back-link"><a href="useraddress">Back to Profile</a></p>
    </div>

    <!-- Bootstrap 4 JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
