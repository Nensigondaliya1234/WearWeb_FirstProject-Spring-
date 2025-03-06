<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f8f9fa;
        }

        .forgot-container {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            padding: 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .forgot-container h2 {
            margin-bottom: 15px;
            color: #333;
            font-weight: bold;
        }

        .forgot-container p {
            color: #666;
            font-size: 14px;
            margin-bottom: 15px;
        }

        .forgot-container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        .forgot-container button {
            width: 100%;
            padding: 10px;
            background: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background 0.3s ease;
        }

        .forgot-container button:hover {
            background: #0056b3;
        }

        .login-link {
            margin-top: 15px;
            color: #888;
            font-size: 14px;
        }

        .login-link a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .login-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="forgot-container">
        <form action="sendOtp" method="post">
            <h2>Forgot Password</h2>
            <p>Enter your email to receive a password reset link.</p>
            <input type="email" name="email" placeholder="Enter Email" required>
            <button type="submit">Send Reset Link</button>
            <p class="login-link">Remembered your password? <a href="login">Login</a></p>
        </form>
    </div>
</body>
</html>
