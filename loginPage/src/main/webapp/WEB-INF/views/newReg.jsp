<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
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
            margin-top: 20px; /* Adjust margin as needed to position below the menu */
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

        .message {
            color: green;
            text-align: center;
            margin-bottom: 15px;
        }

        .error-message {
            color: red;
            text-align: center;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

<%@ include file="menu.jsp" %> <!-- Menu included here -->

<div class="container">
    <h1>New Registration</h1>
    <form action="newReg" method="post">
        <% 
            if (request.getAttribute("saved") != null) { 
                out.println("<p class='message'>" + request.getAttribute("saved") + "</p>"); 
            } 
        %>
        <table>
            <tr>
                <td class="element">Name</td>
                <td><input type="text" name="name" placeholder="Enter your name" required /></td>
            </tr>
            <tr>
                <td class="element">City</td>
                <td><input type="text" name="city" placeholder="Enter your city" required /></td>
            </tr>
            <tr>
                <td class="element">Email</td>
                <td><input type="text" name="email" placeholder="Enter your email" required /></td>
            </tr>
            <tr>
                <td class="element">Mobile</td>
                <td><input type="text" name="mobile" placeholder="Enter your mobile" required /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
