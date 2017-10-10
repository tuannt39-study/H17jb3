<%-- 
    Document   : header
    Created on : Jul 3, 2017, 8:57:11 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class=""> 
    <a href="${pageContext.request.contextPath}"> Home</a> | <a href="<c:url value="/hello"/>"> Giới thiệu</a> 
    | <a href="<c:url value="/product"/>">Sản phẩm</a>
    
    <c:choose>
        <c:when test="${pageContext.request.userPrincipal.authenticated}">
        | <a href="<c:url value="/auth/logout"/>">Logout</a>
         </c:when>
         <c:otherwise>
        | <a href="<c:url value="/auth/login"/>">Login</a>
         </c:otherwise>
    </c:choose>
</nav>

