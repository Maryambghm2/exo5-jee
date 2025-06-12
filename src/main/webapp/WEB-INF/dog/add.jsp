<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Formulaire ajout Chien</h2>
<form action="add" method="post">
    <div>
        <label for="name">Nom :</label>
        <input type="text" name="name" id="name">
    </div>
    <div>
        <label for="breed">Race :</label>
        <input type="text" name="breed" id="breed">
    </div>
    <div>
        <label for="dateBirth">Date de naissance :</label>
        <input type="date" name="dateBirth" id="dateBirth">
    </div>
    <button>Ajouter</button>
</form>
</body>
</html>
