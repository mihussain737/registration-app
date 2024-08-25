<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
        }

        td {
            padding: 10px 0;
        }

        .element {
            font-weight: bold;
            color: #444;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ddd;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 20px;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }

        .error-message {
            color: red;
            text-align: center;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Login Form</h1>
    <form action="login" method="post">
        <% 
        if (request.getAttribute("error") != null) { 
            out.println("<p class='error-message'>" + request.getAttribute("error") + "</p>"); 
        } 
        %>
        <table>
            <tr>
                <td class="element">Email</td>
                <td><input type="text" name="email" placeholder="Enter your email" /></td>
            </tr>
            <tr>
                <td class="element">Password</td>
                <td><input type="text" name="password" placeholder="Enter your password" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Login"></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
