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
        <form action="/springmvcjsp/login" method="POST">
            Name: <input type="text" value="" name="name" placeholder="Nhap tem">
            Pass: <input type="text" value="" name="pass" placeholder="nhap pass">
            <input type="submit" value="Gửi">
        </form>
        
        <%  
//            String  name = request.getParameter("name");
            //String  pass = request.getParameter("pass");
        
        %>
        
<%--        Name: <%=name%> <br/>
        Pass: <%=pass%> <br/> --%>
        
<%
     //System.out.println("Value");
    String valueName ="macdinh";
    System.out.println("Value Name: "+valueName);
    Cookie[] resCook = request.getCookies();
    for(int i = 0; i <resCook.length; i++){
        Cookie c = resCook[i];
        if(c.getName().equals("cookName")){
            valueName = c.getValue();
            System.out.println("Value name in jsP: "+valueName);
            response.sendRedirect("/springmvcjsp/hello");
            break;
        }
    }
    %>
    
    <%= valueName%>
        
    
        <jsp:include page= "/WEB-INF/jsp/footer.jsp">
            <jsp:param name="menu" value="3"></jsp:param>
        </jsp:include>
    </body>
</html>
