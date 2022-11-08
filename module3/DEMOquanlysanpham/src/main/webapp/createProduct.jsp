<%--
  Created by IntelliJ IDEA.
  User: nguyenhalinh
  Date: 31/10/2022
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/create">
<table>
    <tr>
        <td>Nhập ID</td>
        <td><input name="id" placeholder="Nhập ID"></td>
    </tr>

    <tr>
        <td>Nhập tên</td>
        <td><input name="name" placeholder="Nhập tên"></td>
    </tr>

    <tr>
        <td>Nhập url ảnh</td>
        <td><input name="img" placeholder="Nhập url"></td>
    </tr>

    <tr>
        <td>Nhập giá</td>
        <td><input name="price" placeholder="Nhập giá"></td>
    </tr>
</table>
    <button type="submit">Xác nhận</button>
</form>
</body>
</html>
