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


public class ReadWholeServlet extends HttpServlet {
PrintWriter out=null;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         out=response.getWriter();
         out.println("Post");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       out=response.getWriter();
        try {
            List<Complain> objList=new ArrayList<>();
            ComplainDao dao=new ComplainDaoimpl();
            Complain complainObj=dao.getById(Integer.parseInt(request.getParameter("id")));
            objList.add(complainObj);
            request.setAttribute("complain", objList);
            request.getRequestDispatcher("ReadWhole.jsp").forward(request,response);
        } catch (Exception ex) {
          out.println(ex);
        }
     
      out.println("get");
    }
    
}
