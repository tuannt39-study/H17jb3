<%-- 
    Document   : menu_left
    Created on : Jul 5, 2017, 4:14:31 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="float: left;">
        <p>Danh mục tin tức - ${nav}</p>
        <ul>
            <li>Danh mục 1</li>
            <li>Danh mục 2</li>
            <li>Danh mục 3</li>
            <li>Danh mục 4</li>
            <li>Danh mục 5</li>
            <c:forEach items="${newsCats}" var="nc">
            <li> <a href="<c:url value="/newscat/${nc.id}"/>">${nc.name}</a></li>
            </c:forEach>
        </ul>
</div>

