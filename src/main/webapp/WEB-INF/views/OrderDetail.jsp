<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Details</title>
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

        .order-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 20px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .order-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .order-container input[type="number"],
        .order-container select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .order-container button {
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

        .order-container button:hover {
            background: linear-gradient(135deg, #e66782, #e6739c);
        }

        .back-link {
            margin-top: 20px;
        }

        .back-link a {
            color: #ff758c;
            text-decoration: none;
            font-weight: bold;
        }

        .back-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="order-container">
        <h2>Order Details</h2>
        <form action="saveorderdetail" method="post">
            <input type="hidden" name="order_id" value="12345">
            
            <label for="quantity">Quantity</label>
            <input type="number" id="quantity" name="quantity" value="2" required>
            
            <label for="price">Price per Item ($)</label>
            <input type="number" id="price" name="price" value="99" step="1" required>
            
            <label for="total_amount">Total Amount ($)</label>
            <input type="number" id="total_amount" name="total_amount" value="199" step="0.01" required>
            
            <label for="status">Order Status</label>
            <select id="status" name="status" required>
                <option value="Shipped" selected>Shipped</option>
                <option value="Pending">Pending</option>
                <option value="Delivered">Delivered</option>
                <option value="Cancelled">Cancelled</option>
            </select>
            
            <button type="submit">Update Order</button>
        </form>
        
        <p class="back-link"><a href="orders">Back to Orders</a></p>
    </div>
</body>
</html>
