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
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="form-new-customer">
    <form:form action="new" method="post">
        <h2>Nouveau customer</h2>
        <input type="submit" value="Nouveau">
    </form:form>
</div>


<div class="table-customers">
    <table>
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
                    <div class="form-new-customer-actions">
                        <a href="${pageContext.request.contextPath}/customer/edit?id=${c.id}" class="btn">
                            Edit
                        </a>
                        <form action="/delete" method="post" style="display:inline;">
                            <input type="hidden" name="id" value="${c.id}" />
                            <input type="submit" value="Supprimer"/>
                        </form>
                    </div>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
