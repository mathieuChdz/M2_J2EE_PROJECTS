<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 30/09/2025
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ajout d'un article</title>
</head>
<body>

<jsp:useBean id="login" class="fr.uvsq.amis.projet1.modele.Login" scope="session" />

<h2>Client : <jsp:getProperty name="login" property="nom"/> | <jsp:getProperty name="login" property="prenom"/></h2>

<form action="/formArticle" method="post">
  <p>Saisissez votre article: </p>

  nom : <input name="articleNom" type="text"></br>
  prix : <input name="articlePrix" type="text"></br>
  quantité : <input name="articleQuantite" type="text"></br>
  <input type="submit" name="click">
</form>

</body>
</html>
