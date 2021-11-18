<%-- 
    Document   : View
    Created on : Nov 18, 2021, 2:14:50 PM
    Author     : abdel
--%>
<%@page import="model.Person" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View</title>
    </head>
    <body>
        <b>Data Stored ya </b> 
        <jsp:useBean id="person" class="model.Person" scope="request" />
        <jsp:getProperty property="name" name="person"/><br>
        <jsp:include page="IncludedPage.html"/>
    </body>
</html>
