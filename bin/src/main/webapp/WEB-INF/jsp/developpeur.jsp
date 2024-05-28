<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Développeurs</title>
</head>
<body>
    <h1>Développeurs</h1>
    <ul>
        <c:forEach var="developpeur" items="${developpeurs}">
            <li>${developpeur.name}
                <ul>
                    <c:forEach var="projet" items="${developpeur.historiqueProjet}">
                        <li><a href="projets/${projet.id}">${projet.name}</a></li>
                    </c:forEach>
                </ul>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
