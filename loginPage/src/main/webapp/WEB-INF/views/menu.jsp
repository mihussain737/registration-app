<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration and List Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 20px;
        }
        .nav {
            display: flex;
            justify-content: center;
            gap: 20px; /* Space between links */
            margin-bottom: 20px;
        }
        .nav a {
            text-decoration: none;
            color: #fff;
            background-color: #28a745;
            padding: 10px 15px;
            border-radius: 5px;
            font-weight: bold;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        .nav a:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="nav">
        <a href="newReg">New Registration</a>
        <a href="listAll">List Registrations</a>
    </div>
</body>
</html>
