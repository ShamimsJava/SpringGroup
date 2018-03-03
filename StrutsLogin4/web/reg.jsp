<%-- 
    Document   : reg
    Created on : Mar 3, 2018, 9:14:10 PM
    Author     : shamim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registration Page</h1>
        <s:form action="reg">
            <s:textfield name="name" label="Name"></s:textfield>
            <s:textfield name="username" label="Username"></s:textfield>
            <s:password name="password" label="Password"></s:password>
            <s:submit value="Registration"></s:submit>
        </s:form>
    </body>
</html>
