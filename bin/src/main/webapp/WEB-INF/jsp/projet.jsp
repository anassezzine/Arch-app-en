<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Détails du Projet</title>
</head>
<body>
    <h1>Détails du Projet</h1>
    <p>Nom: ${projet.name}</p>
    <p>Description: ${projet.description}</p>
    <p>Date de Début: ${projet.dateDebut}</p>
    <p>Date de Fin: ${projet.dateFin}</p>
    <p>Statut: ${projet.statut}</p>
    <p>Exigences: ${projet.exigences}</p>
</body>
</html>
