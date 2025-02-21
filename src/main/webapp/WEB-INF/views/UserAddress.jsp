<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Address</title>
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

        .address-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            padding: 20px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .address-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .address-container input[type="text"],
        .address-container input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .address-container button {
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

        .address-container button:hover {
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
    <div class="address-container">
        <h2>User Address</h2>
        <form action="saveuseraddress" method="post">
            <input type="hidden" name="user_id" value="12345">
            
            <label for="title">Title</label>
            <input type="text" id="title" name="title" value="Mr." required>
            
            <label for="unitName">Unit Name</label>
            <input type="text" id="unitName" name="unitName" value="Apt 101" required>
            
            <label for="street">Street</label>
            <input type="text" id="street" name="street" value="123 Main St" required>
            
            <label for="landMark">Landmark</label>
            <input type="text" id="landMark" name="landMark" value="Near Central Park" required>
            
            <label for="zipCode">Zip Code</label>
            <input type="number" id="zipCode" name="zipcode" value="10001" required>
            
            <button type="submit">Update Address</button>
        </form>
        
        <p class="back-link"><a href="userProfile">Back to Profile</a></p>
    </div>
</body>
</html>
