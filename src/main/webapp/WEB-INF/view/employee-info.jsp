<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yermakhansultan
  Date: 22.04.2025
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<body>
<h2>Employee Info</h2>
<form:form action="employee" >
    Name : <input path="name"><br>
    Surname : <input path="name"><br>
    Department : <input path="name"><br>
    Salary : <input path="name"><br>
    <input type="submit" value="OK, Submit">
</form:form>

</body>
</html>
