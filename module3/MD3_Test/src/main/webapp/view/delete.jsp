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
<body>
<center>
    <h1>Delete Student</h1>
</center>
<div align="center">
    <form method="post">
        <h3>Are you sure?</h3>
        <table>
          Student Information
            <tr>
                <th>ID: </th>
                <td>${student.getId()}</td>
            </tr>
            <tr>
                <th>Name: </th>
                <td>${student.getName()}</td>
            </tr>
            <tr>
                <th>Date Of Birth: </th>
                <td>${student.getDateOfBirth()}</td>
            </tr>
            <tr>
                <th>Address: </th>
                <td>${student.getAddress()}</td>
            </tr>
            <tr>
                <th>Number Phone: </th>
                <td>${student.getPhoneNumber()}</td>
            </tr>
            <tr>
                <th>Email: </th>
                <td>${student.getEmail()}</td>
            </tr>
            <tr>
                <th>Class Name: </th>
                <td>${student.classStudent.name}</td>
            </tr>
            <tr>
                <td><button class="btn btn-danger" type="submit" class="btn btn-danger">Delete</button></td>
                <td><button type="button" class="btn btn-warning"><a href="/students" id="a-cancel">Cancel</a></button></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
