<%--
  User: Reshetnyak Viktor
  Date: 18.01.2016
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="quizApp">
<head>
    <script src="../js/angular/angular.js"></script>
    <script src="../../js/app.js"></script>
    <title>Тесты</title>
</head>
<body>
<div ng-controller="QuizCtrl"> //Directive
    <question-container ng-show="questionsvisible"></question-container>
    <correct-container ng-show="!notvisible"></correct-container>
</div>

</body>
</html>
