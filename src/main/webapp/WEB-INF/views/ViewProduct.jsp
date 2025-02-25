<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>View Product</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center mb-4">View Product</h2>
        <div class="card shadow p-4">
            <div class="row">
                <div class="col-md-6">
                    <p><strong>Product ID:</strong> ${product.productId }</p>
                    <p><strong>Product Name:</strong> ${product.productName }</p>
                    <p><strong>Base Price:</strong> ${product.basePrice }</p>
                    <p><strong>Offer Percentage:</strong> ${product.offerePercentage }%</p>
                    <p><strong>Offer Price:</strong> ${product.offerePrice }</p>
                    <p><strong>Product Detail:</strong> ${product.productDetail }</p>
                    <p><strong>Quantity:</strong> ${product.quantity }</p>
                </div>
                <div class="col-md-6">
                    <p><strong>Product Images:</strong></p>
                    <img src="${product.productImageURL1 }" class="img-fluid rounded mb-2" alt="Product Image 1">
                    <img src="${product.productImageURL2 }" class="img-fluid rounded mb-2" alt="Product Image 2">
                    <img src="${product.productImageURL3 }" class="img-fluid rounded" alt="Product Image 3">
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
