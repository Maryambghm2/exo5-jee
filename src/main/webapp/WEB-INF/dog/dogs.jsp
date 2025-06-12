<%@ page import="org.example.exo5.model.Dog" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="dogs" type="java.util.ArrayList<org.example.exo5.model.Dog>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link href="">
    <title>Listes Chiens</title>
</head>
<body>
<table class="table table-dark">
    <thead>
    <tr>
        <th>Identifiant :</th>
        <th>Nom :</th>
        <th>Race :</th>
        <th>Date de naissance :</th>
    </tr>
    </thead>
    <tbody>
    <% for (Dog d : dogs) {%>
    <tr>
        <td><%= d.getId()%>
        </td>
        <td><%= d.getName()%>
        </td>
        <td><%= d.getBreed()%>
        </td>
        <td><%= d.getDateBirth()%>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
