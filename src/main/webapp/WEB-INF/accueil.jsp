<%--
  Created by IntelliJ IDEA.
  User: lbouvet
  Date: 29/06/2021
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil</title>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="${pageContext.request.contextPath}/">Accueil</a></li>
                <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <h1>Accueil</h1>
        <p>Bonjour ${name}</p>
    </main>
</body>
</html>
