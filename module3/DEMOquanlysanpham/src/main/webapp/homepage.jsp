<%--
  Created by IntelliJ IDEA.
  User: nguyenhalinh
  Date: 31/10/2022
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1>WELCOME TO KIMCHI CATTERY</h1>
<h2>Đăng nhập</h2>
<div class="table">
<form class="form-horizontal" method="post" action="/userlist">
    <div class="form-group">
        <label class="control-label col-sm-2" for="id">ID:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="id" name="userinput" placeholder="Enter id">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="pwd">Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="pwd" name="passinput" placeholder="Enter password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
    <c:if test="${taikhoan!=null}">
        <h1>Yêu cầu đăng nhập!</h1>
    </c:if>
</form>
</div>
</body>
</html>
