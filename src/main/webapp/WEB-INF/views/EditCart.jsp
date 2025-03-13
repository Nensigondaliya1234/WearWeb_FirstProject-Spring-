<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatecart" method="post">
            <div class="cart-items">
                <div>
                    <p>Quantity</p>
                    <input type="number" name="quantity" value="${cart.quantity}" min="1" required>
                </div>
            </div>
      <input type="hidden" name="cartId"  value="${cart.cartId}"/>

            <button type="submit" class="checkout-btn">Update</button>
        </form>
</body>
</html>