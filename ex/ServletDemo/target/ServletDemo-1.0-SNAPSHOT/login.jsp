<%-- 
    Document   : login
    Created on : Jun 30, 2017, 7:08:02 PM
    Author     : ahcogn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LOGIN</h1>
        <div style="text-algin:center">
            <form action="/ServletDemo/LoginProcess" method="POST">
                <br/>user name: <input name="name" type="text">
                <br/>Pass: <input name="password" type="password">
                <br/>
                <input value="ok" type="submit">
            </form>
        </div>
    </body>
</html>
