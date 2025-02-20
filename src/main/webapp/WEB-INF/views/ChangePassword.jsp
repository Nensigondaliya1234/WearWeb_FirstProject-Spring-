<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
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

        .change-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            padding: 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .change-container h2 {
            margin-bottom: 20px;
            color: #333;
            font-weight: bold;
        }

        .change-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 14px;
        }

        .change-container button {
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

        .change-container button:hover {
            background: linear-gradient(135deg, #e66782, #e6739c);
        }

        .login-link {
            margin-top: 20px;
            color: #888;
        }

        .login-link a {
            color: #ff758c;
            text-decoration: none;
            font-weight: bold;
        }

        .login-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="change-container">
        <form action="updatepassword" method="post">
            <h2>Change Password</h2>
            <input type="text" name="otp" placeholder="otp" required>
            <input type="password" name="password" placeholder="New Password" required>
            <input type="password" name="confirm_password" placeholder="Confirm New Password" required>
            <button type="submit">Change Password</button>
            <p class="login-link">Remembered your password? <a href="login">Login</a></p>
        </form>
    </div>
</body>
</html>
