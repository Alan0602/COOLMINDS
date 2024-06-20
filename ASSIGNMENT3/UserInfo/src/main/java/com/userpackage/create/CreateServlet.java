package com.userpackage.create;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/createUser")
public class CreateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = null;
        Connection con = null;
        PreparedStatement pst = null;

        String uname = request.getParameter("username");
        String password = request.getParameter("password");
        String fname = request.getParameter("firstName");
        String lname = request.getParameter("lastName");
        String address = request.getParameter("address");
        String pincode = request.getParameter("pinCode");
        String phno = request.getParameter("phoneNumber");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // class for MySQL driver
            // Disabling SSL in the connection URL
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?useSSL=false", "root", "1234567890");
            pst = con.prepareStatement("INSERT INTO users(username, password, firstname, lastname, address, pincode, phonenumber) VALUES(?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, uname);
            pst.setString(2, password);
            pst.setString(3, fname);
            pst.setString(4, lname);
            pst.setString(5, address);
            pst.setString(6, pincode);
            pst.setString(7, phno);

            dispatcher = request.getRequestDispatcher("index.jsp");

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                request.setAttribute("status", "success");
            } else {
                request.setAttribute("status", "failed");
            }

            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
