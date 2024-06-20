<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Management</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<header>
    <a href="index.jsp">User Management</a>
    <nav>
        <a href="createUser.jsp" class="btn primary">Create</a>
        <a href="deleteUser.jsp" class="btn primary">Delete</a>
        <a href="updateUser.jsp" class="btn primary">Update</a>
        <!-- Form to trigger the viewUser action -->
        
    </nav>
</header>
<div class="container">
    <h1>Welcome to User Management</h1>
    <form action="viewUser" method="get" style="display:inline;">
            <button type="submit" class="btn primary">View Users</button>
        </form>
</div>
</body>
</html>
