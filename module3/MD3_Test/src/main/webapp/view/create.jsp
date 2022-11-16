<%--
  Created by IntelliJ IDEA.
  User: Tinh Chu
  Date: 7/5/2022
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <h1>Student Management</h1>
    <h2>
        <a type="button" class="btn btn-secondary" href="students?action=students">List All Students</a>
    </h2>
</center>
<div align="center">

    <form method="post">
        <table class="table-primary">
            <caption>
                <tr>
                    <th>StudentName:</th>
                    <td>
                        <input type="text" name="name" pattern="[a-zA-Z][a-zA-Z ]{2,}" title="Tên không được chứa số" id="name" size="45" placeholder="Enter name"/>
                    </td>
                </tr>
                <tr>
                    <th>Date Of Birth:</th>
                    <td>
                        <input type="text" name="dateOfBirth" id="dateOfBirth" size="45" placeholder="Enter date of birth as YYYY-MM-DD"/>
                    </td>
                </tr>
                <tr>
                    <th>Address:</th>
                    <td>
                        <input type="text" name="address" id="address" size="45" placeholder="Enter address"/>
                    </td>
                </tr>
                <tr>
                    <th>Phone Number:</th>
                    <td>
                        <input type="text" name="phoneNumber" id="phoneNumber" size="45" placeholder="Enter phone number"/>
                    </td>
                </tr>
                <tr>
                    <th>Email Address:</th>
                    <td>
                        <input type="email" name="email" pattern="[^ @]*@[^ @]*" title="email sai định dạng" id="email" size="45" placeholder="Enter email"/>
                    </td>
                </tr>
                <tr>
                    <th>Class:</th>
                    <td>
                        <select name="classStudent" id="class">
                            <option value="" disabled selected>Open this select menu</option>
                            <c:forEach var="c" items="${classStudent}">
                                <option value="${c.id}"><c:out value="${c.name}"/></option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <input type="button" class="btn btn-success" type="submit" value="Create"/> </td>
                    <td align="left"><button type="button" class="btn btn-warning"><a href="/students" id="a-cancel">Cancel</a></button> </td>

                </tr>

            </caption>
        </table>
    </form>


</div>
</body>
</html>
