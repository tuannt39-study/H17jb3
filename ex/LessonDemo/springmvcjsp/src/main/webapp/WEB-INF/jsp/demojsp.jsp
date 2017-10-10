<%-- 
    Document   : demojsp
    Created on : Jun 12, 2017, 7:19:58 PM
    Author     : haopv
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="ft" uri="http://java.sun.com/jstl/fmt" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Jsp!</h1>
        
        lần 0: 
        <%= namePage%>
        
        <%! String namePage = "Làm quen jsp"; %>
        
        <br>lần 1: 
        <% namePage += " lần 1";
            out.println(namePage); %>
        
        <br/>lần 2:
        <%= namePage %>
        
        
        <%--
        <%= intVar1%>
        --%>
        
        <% 
            int intVar1 = 10;
            int intVar2 = 2;
        %>
        <br/>Biểu thức i: 
        <%= intVar1/intVar2 %>
        
        <br/>Time:
        <%
            Date dNow = new Date();
            out.println(dNow.toString());
            out.print("<br/>");
            
            SimpleDateFormat ft = 
            new SimpleDateFormat (" HH:mm:ss - 'Ngày'  dd 'tháng ' MM 'năm ' yyyy");
            out.println(ft.format(dNow));
                         
        %>
        ${name}
        
        <%
            ArrayList arr = new ArrayList();
            for (int i = 0; i < 10; i++){
               arr.add("c "+i);
            }
            for (int i = 0; i < arr.size(); i++){
               System.out.println(arr.get(i));
            }
        %>
        
        <ul>
            <%
            for (int i = 0; i < arr.size(); i++){ %>
            <li>
                <%    
                    out.println(arr.get(i));

                %>
            </li>
            <%    
                }
            %>
            
            <%
          Cookie ck = new Cookie("cookName", request.getParameter("name"));
                ck.setMaxAge(5*60);
                response.addCookie(ck);
            %>
            
            
        </ul>
    </body>
</html>
