/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Servlet;

import com.leapfrog.dao.ClientDao;
import com.leapfrog.dao.ComplainDao;
import com.leapfrog.daoimpl.ClientDaoimpl;
import com.leapfrog.daoimpl.ComplainDaoimpl;
import com.leapfrog.entity.Client;
import com.leapfrog.entity.Complain;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BkoNod
 */
public class InsertComplain extends HttpServlet {
PrintWriter out=null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        out=response.getWriter();
        out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        out=response.getWriter();
        out.println("post");
       
        try { 
            out.println("try");
           
            Client c=new Client();
            Complain comp=new Complain();
            ComplainDao compdao=new ComplainDaoimpl();
            ClientDao cdao=new ClientDaoimpl();
            
            
            c.setFirstName(request.getParameter("firstname"));
            
            c.setLastName(request.getParameter("lastname"));
            c.setEmail(request.getParameter("email"));
            
            int cresult=cdao.insert(c);
            
            int clientid=0;
            for( Client client:cdao.getAll())
                {
                   clientid=client.getId();
                   out.println(clientid);
                }
            
            comp.setTitle(request.getParameter("title"));
            comp.setDescription(request.getParameter("description"));
            comp.setClientId(clientid);
            
            int compresult=compdao.insert(comp);
            
            
            request.getRequestDispatcher("index.jsp").forward(request,response);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            out.println(ex);
        }   
        
        
    }
    
}
