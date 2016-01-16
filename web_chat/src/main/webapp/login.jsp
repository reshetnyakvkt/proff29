<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14.01.2016
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/title.html" %>
</head>
<body>
<h2>Welcome</h2><br>
<form action="j_security_check" method=post>
    <p><strong>Please enter your Name: </strong>
        <input type="text" name="j_username" size="25">
        <input type="submit" value="Submit">
</form>
</body>
</html>
