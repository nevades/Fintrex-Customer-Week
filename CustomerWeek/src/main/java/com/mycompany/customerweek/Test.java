/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.customerweek;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Neva
 */
@WebServlet(name = "Test", urlPatterns = {"/Test"})
public class Test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (Connection con = Db.getConnection()) {

            String name = req.getParameter("name");
            String branch = req.getParameter("branch");
            String mobile = req.getParameter("mobile");

            PreparedStatement ps = con.prepareStatement("INSERT INTO `user` (`name`, `branch`, `mobile`) VALUES (?, ?, ?)");

            ps.setString(1, name);
            ps.setString(2, branch);
            ps.setString(3, mobile);

            ps.executeUpdate();

            resp.getWriter().print(name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
