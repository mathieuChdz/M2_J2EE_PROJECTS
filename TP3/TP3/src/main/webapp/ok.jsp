<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 25/09/2025
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

coucou

<%
    int i = 0;
    i++;
    out.println("la val de i est :" + i);

    String p = (String)session.getAttribute("lePrenom");
    out.println("Le prénom entré est : " + p);
%>

</body>
</html>
