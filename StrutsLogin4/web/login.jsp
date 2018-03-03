<%-- 
    Document   : login
    Created on : Mar 3, 2018, 9:14:01 PM
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
        <h1>Login Page</h1>
        <s:form action="login">
            <s:textfield name="username" label="Username"></s:textfield>
            <s:password name="password" label="Password"></s:password>
            <s:submit value="Login"></s:submit>
        </s:form>
        <a href="reg.jsp">New Registration</a>
    </body>
</html>
