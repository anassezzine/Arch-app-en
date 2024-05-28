<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Clients</title>
</head>
<body>
    <h1>Clients</h1>
    <ul>
        <c:forEach var="client" items="${clients}">
            <li>${client.name}
                <ul>
                    <c:forEach var="projet" items="${client.projets}">
                        <li><a href="projets/${projet.id}">${projet.name}</a></li>
                    </c:forEach>
                </ul>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
