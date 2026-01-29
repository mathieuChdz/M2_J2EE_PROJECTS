<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 28/01/2026
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link href="/projetFrameWork/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="form-connexion">
    <form:form action="/debut" method="post" modelAttribute="login">
        <table border="0" cellpadding="5">
            <tr>
                <td>Name: </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Sauve">
                </td>
            </tr>
        </table>
    </form:form>
</div>



</body>
</html>
