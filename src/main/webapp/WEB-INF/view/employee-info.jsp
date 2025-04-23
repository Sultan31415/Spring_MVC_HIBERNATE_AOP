<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<center>
<h2>Employee Info</h2>

<%--@elvariable id="employee" type=""--%>
<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path = "id"/>
    Name: <form:input path="name"/><br>
    Surname: <form:input path="surname"/><br>
    Department: <form:input path="department"/><br>
    Salary: <form:input path="salary"/><br><br>

    <input type="submit" value="OK, Submit"/>
</form:form>

</center>

</body>
</html>
