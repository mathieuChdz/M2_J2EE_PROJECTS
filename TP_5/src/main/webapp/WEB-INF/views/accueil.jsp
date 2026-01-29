<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 28/01/2026
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
    <link href="/projetFrameWork/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<form:form action="new" method="post">
    <input type="submit" value="Nouveau">
</form:form>

<table border="1" cellpadding="5">
    <tr>
        <th>Nom</th>
        <th>Email</th>
        <th>Rue</th>
        <th>Ville</th>
        <th>Actions</th>
    </tr>

    <c:forEach var="c" items="${listCustomer}">
        <tr>
            <td>${c.name}</td>
            <td>${c.email}</td>
            <td>${c.adresse.rue}</td>
            <td>${c.adresse.ville}</td>
            <td>
                <a href="${pageContext.request.contextPath}/customer/edit?id=${c.id}">
                    Edit
                </a>
                <form action="/delete" method="post" style="display:inline;">
                    <input type="hidden" name="id" value="${c.id}" />
                    <input type="submit" value="Supprimer" onclick="return confirm('Supprimer ce client ? SUR ?');"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
