<%-- 
    Document   : login
    Created on : Jul 12, 2017, 7:25:38 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page tu tao</title>
    </head>
    <body>
        <c:url value="/j_spring_security_check" var="security_acton"></c:url>
        <c:if test="${error}">
            <font color="red"> Sai thông tin user hoặc pass</font>
        </c:if>
        <h1>Login Page tu tao!</h1>
        <form action="${security_acton}" method="POST">
            Name: <input type="text" value="" name="username" placeholder="Nhap tem"><br/>
            Pass: <input type="password" value="" name="password" placeholder="nhap pass"><br/>
            <input type="checkbox" value="yes" name="_spring_security_remember_me"/> Nhớ đăng nhập <br/>
            <input type="submit" value="Gửi">
        </form>
        
                
    </body>
</html>
