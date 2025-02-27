<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #ff9a9e, #fad0c4);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .cart-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 20px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .cart-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .cart-items {
            width: 100%;
            margin-bottom: 20px;
            border-top: 2px solid #ccc;
        }

        .cart-items div {
            display: flex;
            justify-content: space-between;
            padding: 10px 0;
            border-bottom: 1px solid #f1f1f1;
        }

        .cart-items div:last-child {
            border-bottom: none;
        }

        .cart-items p {
            margin: 0;
            font-size: 14px;
            color: #555;
        }

        .cart-items select, .cart-items input[type="number"] {
            width: 150px;
            padding: 5px;
            text-align: center;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .checkout-btn {
            width: 100%;
            padding: 10px;
            background: #ff758c;
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background 0.3s ease;
        }

        .checkout-btn:hover {
            background: linear-gradient(135deg, #e66782, #e6739c);
        }

        .empty-cart {
            color: #ff758c;
            font-weight: bold;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="cart-container">
        <h2>Your Cart</h2>

        <!-- Form for updating cart items -->
        <form action="savecart" method="post">
            <div class="cart-items">
                <!-- Dropdown for selecting a product -->
                <div>
                    <select name="productId" required>
          <option >Select Product</option>
          <c:forEach items="${allProduct}" var="s">
              <option value="${s.productId}">${s.productName}</option>
          </c:forEach>
          </select>
                </div>

                <!-- Quantity input -->
                <div>
                    <p>Quantity</p>
                    <input type="number" name="quantity" value="1" min="1" required>
                </div>
            </div>

            <!-- Submit button for updating cart or proceeding to checkout -->
            <button type="submit" class="checkout-btn">Proceed to Checkout</button>
        </form>
    </div>
</body>
</html>
