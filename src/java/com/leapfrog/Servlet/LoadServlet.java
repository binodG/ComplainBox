/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Servlet;

import com.leapfrog.dao.ComplainDao;
import com.leapfrog.daoimpl.ComplainDaoimpl;
import com.leapfrog.entity.Complain;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BkoNod
 */
public class LoadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            ComplainDao doa=new ComplainDaoimpl();
            List <Complain> objlist=new ArrayList <>();
            objlist=doa.getAll();
            request.setAttribute("complainList",objlist );
            request.getRequestDispatcher("ComplainList.jsp").forward(request, response);
        } catch (Exception ex) {
            out.println(ex);
            
          
        } 
       
    }
    
    
}
