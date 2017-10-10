<%-- 
    Document   : home
    Created on : Jul 3, 2017, 8:40:56 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>san pham</title>
    </head>
    <body>
        <tiles:insertAttribute name="header"/>
        <tiles:insertAttribute name="menu_left"/>
        <tiles:insertAttribute name="content" />
        <tiles:insertAttribute name="footer" />
        
    </body>
</html>
