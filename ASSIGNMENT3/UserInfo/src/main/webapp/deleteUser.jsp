<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<!DOCTYPE html>
<html>
<head>
    <title>Delete User</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
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
<div class="container">
    <h1>Select User to Delete</h1>
    <form action="deleteUser" method="post">
        <label for="username">Username:</label>
        <select id="username" name="username" class="fetchSelect">
            <option value="" disabled selected>Select a user</option>
            <%-- Fetch the list of usernames from the database and display them as options --%>
            <%
                Connection con = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?useSSL=false", "root", "1234567890");
                    pst = con.prepareStatement("SELECT username FROM users");
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        String username = rs.getString("username");
                        out.println("<option value='" + username + "'>" + username + "</option>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                }
            %>
        </select>
        <button type="submit" class="fetchButton">Delete User</button>
    </form>
    
    <%-- Display success or failure message --%>
    <%
        String status = (String) request.getAttribute("status");
        if ("success".equals(status)) {
            out.println("<p>User deleted successfully!</p>");
        } else if ("failed".equals(status)) {
            out.println("<p>Failed to delete user. Please try again.</p>");
        }
    %>
    
</div>
</body>
</html>
