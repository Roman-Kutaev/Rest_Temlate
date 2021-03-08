<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<style>
    table{
        text-align: center;
    }
</style>
<body>
<table>
    <thead>
    <tr>
        <th>Email</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Avatar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${allUsers}">
        <tr>
            <td>${user.email}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.avatar}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
