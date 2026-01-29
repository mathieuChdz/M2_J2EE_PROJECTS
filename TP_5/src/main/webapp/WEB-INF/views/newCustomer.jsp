<%--
  Created by IntelliJ IDEA.
  User: chedo
  Date: 29/01/2026
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <meta charset="UTF-8">
  <title>Accueil</title>
  <link href="/projetFrameWork/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<form:form action="sauve" method="post" modelAttribute="customer">
  <table border="0" cellpadding="5">
    <tr>
      <td>Name: </td>
      <td><form:input path="name" /></td>
    </tr>
    <tr>
      <td>Email: </td>
      <td><form:input path="email" /></td>
    </tr>
    <tr>
      <td>Adresse: </td>
      <td><form:input path="adresse.rue" /></td>
      <td><form:input path="adresse.ville" /></td>
    </tr>
    <tr><td><input type="submit" value="Sauve"></td></tr>
  </table>
</form:form>



</body>
</html>
