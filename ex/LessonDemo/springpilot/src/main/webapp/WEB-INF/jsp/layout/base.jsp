<%-- 
    Document   : home
    Created on : Jul 3, 2017, 8:40:56 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
        <link href="<c:url value="/assets/" />css/main.css" rel="stylesheet" type="text/css" media="all"/>
        <!--<link href="<c:url value="/assets/" />css/style.css" rel="stylesheet" type="text/css" media="all"/>-->
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="content" />
        <tiles:insertAttribute name= "footer" />

    </body>
</html>
