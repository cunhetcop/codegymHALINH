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
    <h2>Bảng quản lý nhân viên</h2>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Tên</th>
            <th>Ảnh</th>
            <th>Trạng Thái</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${nhanviens}" var="nv">
            <tr>
                <td>${nv.id}</td>
                <td>${nv.name}</td>
                <td><img src="${nv.img}" width="270" height="200"></td>
                <c:if test="${nv.status==true}">
                    <td style="color: green">Còn làm</td>
                </c:if>
                <c:if test="${nv.status==false}">
                    <td style="color: red">Nghỉ làm</td>
                </c:if>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

