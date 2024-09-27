<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 9/27/2024
  Time: 11:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Customers</title>
</head>
<body>
<form action="controls?action=insertCustomer" method="post">
    Name: <input name="name"> </br>
    Email: <input name="email"> </br>
    Phone: <input name="phone"> </br>
    Address: <input name="address"> </br>
    <input type="submit" value="Insert">
    <input type="reset" value="Clear">
</form>
</body>
</html>
