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
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="container-index">
    <div class="header-title">
        <h2>Projet (CUSTOMERS)</h2>
    </div>

    <div class="form-connexion">
        <form:form action="/debut" method="post" modelAttribute="login">
            <h1>Connexion</h1>

            <div class="form-row">
                <label for="name">Login</label>
                <form:input path="name" id="name" placeholder="Name"/>
            </div>

            <input type="submit" value="Connexion">
        </form:form>
    </div>
</div>



</body>
</html>
