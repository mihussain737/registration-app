<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Of All Registration</title>
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
            max-width: 800px;
            width: 100%;
            margin: 20px;
            box-sizing: border-box;
        }
        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #28a745;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>
    <%@ include file="menu.jsp" %>
    <div class="container">
        <h1>List of All Registration</h1>
         <% 
        String updatedMessage = (String) request.getAttribute("updated");
        if (updatedMessage != null) { 
    %>
    <p style="color: green; text-align: center;"><%= updatedMessage %></p>
    <% } %>
        <table>
            <tr>
                <th>Name</th>
                <th>City</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Actions</th>
            </tr>
            <%
                // Retrieve ResultSet from request attribute
                ResultSet result = (ResultSet) request.getAttribute("result");

                if (result != null) {
                    while (result.next()) {
            %>
            <tr>
                <td><%= result.getString("name") %></td>
                <td><%= result.getString("city") %></td>
                <td><%= result.getString("email") %></td>
                <td><%= result.getString("mobile") %></td>
                <td><a href="delete?email=<%= result.getString("email") %>">Delete</a> &nbsp
                <a href="update?email=<%= result.getString("email") %>&mobile=<%= result.getString("mobile") %>">Update</a></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="4">No records found.</td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
</body>
</html>
