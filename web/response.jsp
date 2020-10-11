
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <jsp:useBean id="firstBean" scope="session" class="data.Person"/>
    <jsp:setProperty name="firstBean" property="name" />
    Merhaba
    <jsp:getProperty name="firstBean" property="name" />
    Hoşgeldin
</body>
</html>
