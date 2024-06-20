package com.userpackage.update;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateUser")
public class UpdateUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uname = request.getParameter("username");
        String password = request.getParameter("password");
        String fname = request.getParameter("firstName");
        String lname = request.getParameter("lastName");
        String address = request.getParameter("address");
        String pincode = request.getParameter("pinCode");
        String phno = request.getParameter("phoneNumber");

        Connection con = null;
        PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?useSSL=false", "root", "1234567890");

            String query = "UPDATE users SET ";
            boolean needComma = false;

            if (password != null && !password.isEmpty()) {
                query += "password=?";
                needComma = true;
            }
            if (fname != null && !fname.isEmpty()) {
                if (needComma) query += ", ";
                query += "firstname=?";
                needComma = true;
            }
            if (lname != null && !lname.isEmpty()) {
                if (needComma) query += ", ";
                query += "lastname=?";
                needComma = true;
            }
            if (address != null && !address.isEmpty()) {
                if (needComma) query += ", ";
                query += "address=?";
                needComma = true;
            }
            if (pincode != null && !pincode.isEmpty()) {
                if (needComma) query += ", ";
                query += "pincode=?";
                needComma = true;
            }
            if (phno != null && !phno.isEmpty()) {
                if (needComma) query += ", ";
                query += "phonenumber=?";
                needComma = true;
            }
            query += " WHERE username=?";
            
            pst = con.prepareStatement(query);

            int index = 1;
            if (password != null && !password.isEmpty()) pst.setString(index++, password);
            if (fname != null && !fname.isEmpty()) pst.setString(index++, fname);
            if (lname != null && !lname.isEmpty()) pst.setString(index++, lname);
            if (address != null && !address.isEmpty()) pst.setString(index++, address);
            if (pincode != null && !pincode.isEmpty()) pst.setString(index++, pincode);
            if (phno != null && !phno.isEmpty()) pst.setString(index++, phno);
            pst.setString(index, uname);

            pst.executeUpdate();

            response.sendRedirect("viewUser.jsp");

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
