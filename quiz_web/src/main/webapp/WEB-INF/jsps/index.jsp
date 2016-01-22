<%--
  User: Reshetnyak Viktor
  Date: 18.01.2016
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="quizApp">
<head>
<%--
    <script src="../../js/angular.js"></script>
    <script src="../../js/app.js"></script>
    <script src="../../js/authenticate.js"></script>
    <script src="../../js/quiz.js"></script>
--%>
    <title>Авторизация</title>
</head>
<body>
<h5>
    <p style="color: red">
        <%
            if (request.getAttribute("error_auth") != null) {
                boolean error = (boolean) request.getAttribute("error_auth");
                if (error) {
                    String error_message = (String) request.getAttribute("error_message");
                    if (error_message != null) {
                        out.println(error_message);
                    } else {
                        out.println("Error authenticate!");
                    }
                }
            }
        %>
    </p>
</h5>

<form action="auth" method="post">
    <p>
        <label style="width: 80px" class="field">Введите свое имя</label>
        <input type="text" name="login" value="${login}"/>
        <button style="width: 100px; height: 25px" NAME="submit" type="submit" value="Login">Ok</button>
    </p>
</form>

<%--<form ng-submit="onLogin()" name="form" novalidate="" ng-controller="LoginCtrl">
    <fieldset>
        <legend>Log In</legend>
        <div class="form-field">
            <input type="text" ng-model="vm.username" name="username" required="" ng-minlength="6">
            <div class="form-field">
                <input type="password" ng-model="vm.password" name="password" required="" ng-minlength="6" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}">
            </div></div></fieldset>
    <button type="submit">Log In</button>
    <input type="submit" ng-click="login()" />
    <input type="submit" ng-click="logout()" value="Log out" />
    <a href="/resources/public/new-user.html">New user?</a>
</form>--%>

<h5>
    <a href="/test">Fill</a><b/>
    <a href="/test2">Fill-2</a><b/>
</h5>
</body>
</html>
