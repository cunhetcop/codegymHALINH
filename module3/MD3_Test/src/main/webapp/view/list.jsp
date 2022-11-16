<%--
  Created by IntelliJ IDEA.
  User: Tinh Chu
  Date: 7/5/2022
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background-image: url("https://codegym.vn/wp-content/uploads/2020/05/hue-2-1-1.jpg");
        }
    </style>
    <title>Student Management Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container">
<center>
    <h1>Student Management UI</h1>
</center>

<div>
    <h2>
        <a type="button" class="btn btn-success" href="/students?action=create">Create new Student</a>
    </h2>

    <div class="input-group">

        <form action="/students">
            <input name="action" value="search" hidden>
            <input name="search" placeholder="Search"><button type="submit">Search</button>
        </form>
<%--        <form method="post" action="/students">--%>
<%--            <input name="action" value="search" hidden>--%>
<%--            <input id="search" name="name" class="form-control rounded" placeholder="Search" aria-label="Search" aria-describedby="search-addon" />--%>
<%--            <button type="submit" class="btn btn-outline-primary">Search</button>--%>
<%--        </form>--%>
    </div>


    <table class="table table-dark table-hover">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Address</th>
            <th>PhoneNumber</th>
            <th>Email</th>
            <th>Class</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${listStudent}">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.name}"/></td>
                <td><c:out value="${student.dateOfBirth}"/></td>
                <td><c:out value="${student.address}"/></td>
                <td><c:out value="${student.phoneNumber}"/></td>
                <td><c:out value="${student.email}"/> </td>
                <td><c:out value="${student.classStudent.name}"/></td>
                <td>
                    <a type="button" class="btn btn-primary" href="/students?action=edit&id=${student.id}">Edit</a>
                    <a type="button" class="btn btn-danger" href="/students?action=delete&id=${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
