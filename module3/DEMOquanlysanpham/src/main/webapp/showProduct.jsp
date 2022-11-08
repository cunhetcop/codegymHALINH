<%--
  Created by IntelliJ IDEA.
  User: nguyenhalinh
  Date: 31/10/2022
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ban cán sự lớp</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>Ban cán sự lớp</h2>
    <a type="button" class="btn btn-success" href="/createProduct.jsp">Thêm sản phẩm</a>

    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Ảnh</th>
            <th>Giá</th>
            <th>edit</th>
            <th>delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sanphams}" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.name}</td>
            <td><img src="${sp.img}" height ="200" width ="290"></td>
            <td>${sp.price}</td>
            <td><a type="button" class="btn btn-primary" href="/edit?id=${sp.id}">Edit</a></td>
            <td><a type="button" class="btn btn-danger" href="/delete?id=${sp.id}">Delete</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
