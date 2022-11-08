<%--
  Created by IntelliJ IDEA.
  User: nguyenhalinh
  Date: 31/10/2022
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/edit">
    <table>
        <tr>
            <td>Nhập ID</td>
            <td><input name="id" value="${p.id}" readonly></td>
        </tr>

        <tr>
            <td>Nhập tên</td>
            <td><input name="name" value="${p.name}"></td>
        </tr>

        <tr>
            <td>Nhập url ảnh</td>
            <td><input name="img" value="${p.img}"></td>
        </tr>

        <tr>
            <td>Nhập giá</td>
            <td><input name="price" value="${p.price}"></td>
        </tr>
    </table>
    <button type="submit">Xác nhận</button>
</form>
</body>
</html>
