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
        <% 
            Person p = (Person) request.getAttribute("person");
        %>
        <b>Data Stored ya </b> <%= p.getName() %>
    </body>
</html>
