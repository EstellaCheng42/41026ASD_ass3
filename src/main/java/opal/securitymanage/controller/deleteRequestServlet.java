/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opal.securitymanage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import opal.dao.SecurityRequestDao;
import opal.entity.SecurityRequest;

/**
 *
 * @author chengming
 */
@WebServlet(name = "deleteRequestServlet", value = "/deleteRequestServlet")
public class deleteRequestServlet extends HttpServlet {
    SecurityRequest request;
    SecurityRequestDao securityRequestDao;
          
     public deleteRequestServlet() throws ClassNotFoundException, SQLException{
        securityRequestDao = new SecurityRequestDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        securityRequestDao.DeleteRequest(request.getParameter("requestId"));
        response.sendRedirect("requestManageServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
