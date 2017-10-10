<%-- 
    Document   : form.jsp
    Created on : Jun 9, 2017, 9:10:55 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Form xu ly</h1>
        <form action="/springmvcintro/XuLyServlet" method="POST">
            Name: <input type="text" value="" name="name" placeholder="Nhap tem">
            Pass: <input type="text" value="" name="pass" placeholder="nhap pass">
            <input type="submit" value="Gửi">
        </form>
    </body>
</html>
