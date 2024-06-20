package com.userpackage.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewUser")
public class ViewUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        List<User> userList = new ArrayList<>();
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?useSSL=false", "root", "1234567890");
            pst = con.prepareStatement("SELECT * FROM users");
            rs = pst.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("firstname"));
                user.setLastName(rs.getString("lastname"));
                user.setAddress(rs.getString("address"));
                user.setPincode(rs.getString("pincode"));
                user.setPhoneNumber(rs.getString("phonenumber"));
                userList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Printing HTML content
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>View Users</title>");
        out.println("<link rel='stylesheet' type='text/css' href='css/styles.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("<a href='index.jsp'>User Management</a>");
        out.println("<nav>");
        out.println("<a href='createUser.jsp' class='btn primary'>Create</a>");
        out.println("<a href='deleteUser.jsp' class='btn primary'>Delete</a>");
        out.println("<a href='updateUser.jsp' class='btn primary'>Update</a>");
        out.println("<a href='viewUser.jsp' class='btn primary'>View</a>");
        out.println("</nav>");
        out.println("</header>");
        out.println("<div class='container'>");
        out.println("<h1>View Users</h1>");
        out.println("<table>");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Username</th>");
        out.println("<th>Password</th>");
        out.println("<th>First Name</th>");
        out.println("<th>Last Name</th>");
        out.println("<th>Address</th>");
        out.println("<th>Pincode</th>");
        out.println("<th>Phone Number</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");

        for (User user : userList) {
            out.println("<tr>");
            out.println("<td>" + user.getUsername() + "</td>");
            out.println("<td>" + user.getPassword() + "</td>");
            out.println("<td>" + user.getFirstName() + "</td>");
            out.println("<td>" + user.getLastName() + "</td>");
            out.println("<td>" + user.getAddress() + "</td>");
            out.println("<td>" + user.getPincode() + "</td>");
            out.println("<td>" + user.getPhoneNumber() + "</td>");
            out.println("</tr>");
        }

        out.println("</tbody>");
        out.println("</table>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
