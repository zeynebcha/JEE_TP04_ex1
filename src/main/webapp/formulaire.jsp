<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire</title>
</head>
<body>
<h2>Formulaire de Saisie</h2>
<form action="formController" method="post">
    Nom: <input type="text" name="nom" required><br><br>
    Prénom: <input type="text" name="prenom" required><br><br>
    Sexe:
    <select name="sexe">
        <option value="Masculin">Masculin</option>
        <option value="Féminin">Féminin</option>
    </select><br><br>
    Transport: <input type="text" name="transport"><br><br>
    Code Postal: <input type="text" name="codePostal" required><br><br>
    <input type="submit" value="Envoyer">
</form>
</body>
</html>

