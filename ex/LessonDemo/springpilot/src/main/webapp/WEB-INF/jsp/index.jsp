<%-- 
    Document   : index.jsp
    Created on : Jun 9, 2017, 7:31:26 PM
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
        <h1>Trang chủ</h1>
        Name: <%= request.getAttribute("name") %> <br/>
        Name: ${name} <br/>
        Hoc sinh: ${name2}
    </body>
</html>
