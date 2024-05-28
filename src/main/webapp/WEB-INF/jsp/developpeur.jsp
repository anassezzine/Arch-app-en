<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.projets.model.Developpeur" %>


<!DOCTYPE html>
<html>
<head>
    <title>Développeurs</title>
</head>
<body>
	<p>Hello</p> 
    <h1>Développeurs</h1>
    <ul>
        <% 
            for (Developpeur developpeur : developpeurs) {
        %>
            <li><%= developpeur.getName() %></li>
        <% 
            }
        %>
    </ul>
<!-- 
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
     -->
</body>
</html>
