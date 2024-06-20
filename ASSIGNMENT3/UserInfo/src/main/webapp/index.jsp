<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Management</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <a href="index.jsp">User Management</a>
        <nav>
            <a href="createUser.jsp" class="btn primary">Create</a>
            <a href="deleteUser.jsp" class="btn primary">Delete</a>
            <a href="updateUser.jsp" class="btn primary">Update</a>
            <a href="viewUser.jsp" class="btn primary" >View</a>
        </nav>
    </header>
    <main>
        <h1>Welcome to User Management</h1>
        <p>Manage your users with ease using our powerful user management application.</p>
        <div class="grid">
            <div class="card">
                <h3>Create User</h3>
                <p>Add a new user to your application.</p>
                <a href="createUser.jsp" class="btn primary">Create User</a>
            </div>
            <div class="card">
                <h3>Delete User</h3>
                <p>Remove a user from your application.</p>
                <a href="deleteUser.jsp" class="btn primary">Delete User</a>
            </div>
            <div class="card">
                <h3>Update User</h3>
                <p>Modify an existing user's information.</p>
                <a href="updateUser.jsp" class="btn primary">Update User</a>
            </div>
            <div class="card">
                <h3>View Users</h3>
                <p>See a list of all users in your application.</p>
                <a href="viewUser.jsp" class="btn primary">View Users</a>
            </div>
        </div>
    </main>
    <footer>
        <p>&copy; 2024 User Management. All rights reserved.</p>
       
    </footer>
</body>
</html>
