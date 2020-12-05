<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>

<body>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>
<div>
    <form method="POST" action="${pageContext.request.contextPath}/login">
        <h2>Вход в систему</h2>
        <div>
            <label>
                <input name="username" type="text" placeholder="Username"
                       autofocus="true"/>
            </label>
            <label>
                <input name="password" type="password" placeholder="Password"/>
            </label>
            <button type="submit">Log In</button>
        </div>
    </form>
</div>

</body>
</html>