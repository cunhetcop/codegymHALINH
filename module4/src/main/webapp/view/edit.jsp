<%--
  Created by IntelliJ IDEA.
  User: nguyenhalinh
  Date: 14/11/2022
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/edit" method="post">
    <table>
        <tr><td><input value="${product.id}" readonly name="id"></td></tr>
        <tr><td><input value="${product.name}"  name="name"></td></tr>
        <tr><td><input value="${product.price}" name="price"></td></tr>
        <tr><td><input value="${product.img}" name="img"></td></tr>
        <tr><td><input type="submit" value="Submit"></td></tr>
    </table>

</form>
</body>
</html>
