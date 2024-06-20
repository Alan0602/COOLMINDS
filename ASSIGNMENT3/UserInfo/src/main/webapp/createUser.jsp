<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create User</title>
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
            <h2>Create User</h2>
            <form action="createUser" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>

                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>

                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" required>

                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" name="lastName" required>

                <label for="address">Address:</label>
                <textarea id="address" name="address" required></textarea>

                <label for="pinCode">Pin Code:</label>
                <input type="number" id="pinCode" name="pinCode" required>

                <label for="phoneNumber">Phone Number:</label>
                <input type="tel" id="phoneNumber" name="phoneNumber" required>

                <button type="submit" class="btn primary">Create User</button>
            </form>
        </div>
    </main>
    <footer>
        <p>&copy; 2024 User Management. All rights reserved.</p>
       
    </footer>
</body>
</html>
