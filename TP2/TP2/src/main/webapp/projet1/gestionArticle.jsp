<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 30/09/2025
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, java.util.ArrayList" %>
<%@ page isELIgnored="false" %>

<jsp:useBean id="login" class="fr.uvsq.amis.projet1.modele.Login" scope="session" />
<jsp:useBean id="listArticles" class="java.util.ArrayList" scope="session" />


<html>
<head>
    <title>Title</title>
</head>
<body>

<c:out value="test de la lib"/>

<h2>Client : <jsp:getProperty name="login" property="nom"/> | <jsp:getProperty name="login" property="prenom"/></h2>

<h2>Liste des articles</h2>

<table>
    <tr>
        <th>nom</th>
        <th>prix</th>
        <th>quantité</th>
    </tr>
    <c:forEach var="article" items="${listArticles}">
        <tr>
            <td><c:out value="${article.nom}"/></td>
            <td><c:out value="${article.prix}"/></td>
            <td><c:out value="${article.quantite}"/></td>
        </tr>
    </c:forEach>
</table>

<form action="/projet1/addArticles.jsp" method="post">
    <input type="submit" value="Ajouter un article">
</form>

<form action="/deconnexion" method="get">
    <input type="submit" value="deconnexion">
</form>

</body>
</html>
