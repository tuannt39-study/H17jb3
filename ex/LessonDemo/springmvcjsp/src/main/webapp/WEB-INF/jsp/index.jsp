<%-- 
    Document   : index.jsp
    Created on : Jun 9, 2017, 7:31:26 PM
    Author     : haopv
--%>

<%@page import="vn.hackedemic.sipring.beans.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        
        
        <h2>person</h2>
        Name: ${p1.name}; Age: ${p1.age}
        
        <h2>person array</h2>
        <%
            ArrayList<Person> arrPer = new ArrayList<Person>();
            arrPer.add(new Person("b","nv2",12));
            arrPer.add(new Person("c","nv3",13));
            arrPer.add(new Person("d","nv4",14));
            arrPer.add(new Person("e","nv5",15));
            arrPer.add(new Person("f","nv6",16));
        %>
        
        <c:forEach items="<%=arrPer%>" var="per">
            Tên: ${per.name}<br>
            Mã: ${per.code}<br>
            Tuổi: ${per.age}<br>
            <hr>
        </c:forEach>
        
        
        <jsp:include page= "/WEB-INF/jsp/footer.jsp">
            <jsp:param name="menu" value="1"></jsp:param>
        </jsp:include>
    </body>
</html>
