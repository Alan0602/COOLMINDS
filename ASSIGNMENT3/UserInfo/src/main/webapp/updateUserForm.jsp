<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update User</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <a href="index.jsp">User Management</a>
        <nav>
            <a href="createUser.jsp" class="btn primary">Create</a>
            <a href="deleteUser.jsp" class="btn primary">Delete</a>
            <a href="updateUser.jsp" class="btn primary">Update</a>
            <a href="viewUser.jsp" class="btn primary">View</a>
        </nav>
    </header>
    <main>
        <div class="container">
            <h2>Update User</h2>
            <form action="updateUser" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" value="${username}" readonly>

                <label for="password">Password:</label>
                <input type="password" id="password" name="password" placeholder="${password}">

                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" placeholder="${firstName}">

                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" name="lastName" placeholder="${lastName}">

                <label for="address">Address:</label>
                <textarea id="address" name="address" placeholder="${address}"></textarea>

                <label for="pinCode">Pin Code:</label>
                <input type="number" id="pinCode" name="pinCode" placeholder="${pinCode}">

                <label for="phoneNumber">Phone Number:</label>
                <input type="tel" id="phoneNumber" name="phoneNumber" placeholder="${phoneNumber}">

                <button type="submit" class="btn primary">Update User</button>
            </form>
        </div>
    </main>
    <footer>
        <p>&copy; 2024 User Management. All rights reserved.</p>
       
    </footer>
</body>
</html>
