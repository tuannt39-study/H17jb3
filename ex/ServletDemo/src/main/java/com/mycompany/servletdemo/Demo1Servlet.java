/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ahcogn
 */
//@WebServlet(name = "Demo1Servlet", urlPatterns = {"/Demo1Servlet"})
public class Demo1Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Demo1Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Demo1Servlet at " + request.getContextPath() + "</h1>");

            ServletConfig sc = this.getServletConfig();
            out.print("Name init: " + sc.getInitParameter("username"));
            out.print("<br/>");

            Enumeration<String> e = sc.getInitParameterNames();
            String name = "";
            while (e.hasMoreElements()) {
                name = e.nextElement();
                out.println("param name: " + name);
                out.print("param value: " + sc.getInitParameter(name));
                out.print("<br/>");
            }
            ServletContext sCt = sc.getServletContext();
            
            Enumeration<String> e1 = sCt.getInitParameterNames();
            String nameSCt = "";
            while (e1.hasMoreElements()) {
                name = e1.nextElement();
                out.println("param name: " + name);
                out.print("param value: " + sCt.getInitParameter(name));
                out.print("<br/>");
            }
            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
