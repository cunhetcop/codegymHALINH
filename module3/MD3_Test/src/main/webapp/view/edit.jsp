
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background-image: url("https://codegym.vn/wp-content/uploads/2020/05/hue-2-1-1.jpg");
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Student Management Application</title>
</head>
<body>
<h1>Edit Student Information</h1>
<p>
    <c:if test="${message} !=null">
        <span class="message">${message}</span>
    </c:if>
</p>
<form method="post">
    <fieldset>
        <legend>Student information</legend>
        <table>
            <c:if test="${student != null}">
                <input type="hidden" name="id" value="${requestScope["student"].id}' />"/>
            </c:if>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["student"].name}"></td>
            </tr>
            <tr>
                <td>Date Of Birth: </td>
                <td><input type="date" name="dateOfBirth" id="dateOfBirth" value="${requestScope["student"].dateOfBirth}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["student"].address}"></td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td><input type="text" name="phoneNumber" id="phoneNumber" value="${requestScope["student"].phoneNumber}"></td>
            </tr>
            <tr>
                <td>Email Address: </td>
                <td><input ype="email" name="email" id="email" value="${requestScope["student"].email}"></td>
            </tr>
            <tr>
                <td>Class: </td>
                <td><input type="text" name="classStudent" id="classStudent" value="${requestScope["student"].classStudent.name}"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" class="btn btn-primary" value="Update information"></td>
                <td><button type="button" class="btn btn-warning"><a href="/students" id="a-cancel">Cancel</a></button></td>
            </tr>

        </table>
    </fieldset>
</form>
</body>
</html>