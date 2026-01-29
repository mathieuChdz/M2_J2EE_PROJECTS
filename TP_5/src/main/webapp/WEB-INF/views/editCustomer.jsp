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
</head>
<body>

<form:form method="post" action="/update" modelAttribute="customer">

  <form:hidden path="id"/>

  Nom : <form:input path="name"/><br/>
  Email : <form:input path="email"/><br/>

  Rue : <form:input path="adresse.rue"/><br/>
  Ville : <form:input path="adresse.ville"/><br/>

  <input type="submit" value="Enregistrer"/>
</form:form>
</body>
</html>
