<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Myntra Style Home Page</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
        }

        header {
            display: flex;
            justify-content: space-between;
            padding: 10px 20px;
            background-color: #000;
            color: #fff;
        }

        header .logo img {
            width: 100px;
        }

        nav ul {
            list-style-type: none;
            display: flex;
            gap: 20px;
        }

        nav ul li a {
            color: #fff;
            text-decoration: none;
            font-size: 16px;
        }

        .banner {
            width: 100%;
            margin-top: 20px;
        }

        .banner-img {
            width: 100%;
            height: auto;
        }

        .categories {
            margin: 40px 20px;
            text-align: center;
        }

        .categories h2 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .category-list {
            display: flex;
            justify-content: space-around;
            gap: 20px;
        }

        .category-item {
            text-align: center;
        }

        .category-item img {
            width: 200px;
            height: 200px;
            object-fit: cover;
            border-radius: 10px;
        }

        footer {
            background-color: #000;
            color: #fff;
            text-align: center;
            padding: 10px 0;
        }
    </style>
</head>
<body>

    <!-- Header Section -->
    <header>
        <div class="logo">
            <img src="logo.png" alt="Myntra Logo">
        </div>
        <nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Men</a></li>
                <li><a href="#">Women</a></li>
                <li><a href="#">Kids</a></li>
                <li><a href="#">Offers</a></li>
                <li><a href="#">Sign In</a></li>
            </ul>
        </nav>
    </header>

    <!-- Banner Section -->
    <section class="banner">
        <img src="banner.jpg" alt="Myntra Banner" class="banner-img">
    </section>

    <!-- Featured Categories Section -->
    <section class="categories">
        <h2>Featured Categories</h2>
        <div class="category-list">
            <div class="category-item">
                <img src="category1.jpg" alt="Category 1">
                <p>Category 1</p>
            </div>
            <div class="category-item">
                <img src="category2.jpg" alt="Category 2">
                <p>Category 2</p>
            </div>
            <div class="category-item">
                <img src="category3.jpg" alt="Category 3">
                <p>Category 3</p>
            </div>
        </div>
    </section>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2025 Myntra. All rights reserved.</p>
    </footer>

    <script>
        // Optional JavaScript functionality (like a carousel or dynamic content) can go here.
    </script>
</body>
</html>
