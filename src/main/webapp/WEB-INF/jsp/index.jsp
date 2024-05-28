<!-- 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Accueil</title>
</head>
<body>
    <h1>Accueil</h1>
    <button onclick="location.href='clients'">Clients</button>
    <button onclick="location.href='developpeurs/page'">Développeurs</button>
</body>
</html>

-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Accueil</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
        }
        .button-container {
            display: flex;
            gap: 20px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Accueil</h1>
    <div class="button-container">
        <button onclick="location.href='clients'">Clients</button>
        <button onclick="location.href='developpeurs/page'">Développeurs</button>
    </div>
</body>
</html>
