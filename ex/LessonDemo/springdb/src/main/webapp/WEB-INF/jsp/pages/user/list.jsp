<%-- 
    Document   : list
    Created on : Jul 7, 2017, 7:16:31 PM
    Author     : haopv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


        <h1>Danh sach thanh vien</h1>
        <h3>Cách 1: theo câu lệnh query</h3>
        <c:forEach items="${listUsers}" var="u">
            ID: ${u.ID} -- tên đăng nhập: ${u.USERNAME} -- tên đầy đủ: ${u.NAME}<br/>
        </c:forEach>
            
            <hr/>
            
        <h3>Cách 2: theo Criteria</h3>
        <c:forEach items="${listUserByCriteria}" var="u">
            ID: ${u.ID} -- tên đăng nhập: ${u.username} -- tên đầy đủ: ${u.name} -- email: ${u.email} -- địa chỉ: ${u.address} <br/>
        </c:forEach>
            
            
        <h3>Danh sách user có quyền thuộc nhóm 1</h3>
        <c:forEach items="${listUserByRole}" var="u">
            ID: ${u.ID} -- tên đăng nhập: ${u.username} -- tên đầy đủ: ${u.name} -- email: ${u.email} -- địa chỉ: ${u.address} -- Tên nhóm Role: ${u.role.roleName} <br/>
        </c:forEach>
            
            


