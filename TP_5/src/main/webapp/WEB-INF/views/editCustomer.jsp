<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 29/01/2026
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Edit Customer</title>
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">

</head>
<body>

<form:form method="post" action="/update" modelAttribute="customer">

    <form:hidden path="id"/>

    <h2>Modification d'un customer</h2>

    <div class="form-row">
        <label for="name">Name</label>
        <form:input path="name" id="name" placeholder="Name"/>
    </div>

    <div class="form-row">
        <label for="email">Email</label>
        <form:input path="email" id="email" placeholder="Email"/>
    </div>

    <div class="form-row">
        <label>Adresse</label>
        <div class="form-row-adresse">
            <form:input path="adresse.rue" placeholder="Rue"/>
            <form:input path="adresse.ville" placeholder="Ville"/>
        </div>
    </div>

    <div class="form-actions">
        <input type="submit" value="Sauvegarder">
    </div>
</form:form>

</body>
</html>
