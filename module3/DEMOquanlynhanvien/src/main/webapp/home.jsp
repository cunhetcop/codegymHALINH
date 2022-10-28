<%--
  Created by IntelliJ IDEA.
  User: nguyenhalinh
  Date: 28/10/2022
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>Dark Striped Table</h2>
    <p>Combine .table-dark and .table-striped to create a dark, striped table:</p>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${nhanviens}" var="nv">
        <tr>
            <td>${nv.id}</td>
            <td>${nv.name}</td>
            <td><img src="${nv.img}" width="250" height="200"></td>
            <c:if test="${nv.status==true}"><td style="color: aqua">Còn làm</td></c:if>
            <c:if test="${nv.status==true}"><td style="color: red">Nghỉ làm</td></c:if>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

