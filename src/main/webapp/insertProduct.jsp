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
    <title>Insert Products</title>
    <form action="controls?action=insert_products" method="post">
        Name: <input name="name"/><br/>
        Description: <input name="desc"/><br/>
        Unit: <input name="unit"/><br/>
        Manufacturer: <input name="manu"/><br/>
        Status: <select name="status">
        <option selected="true" label="ACTIVE" value="1">ACTIVE</option>
        <option label="IN_ACTIVE" value="0">IN_ACTIVE</option>
        <option label="TERMINATED" value="-1">TERMINATED</option>
    </select><br/>
        <input type="submit" value="Insert"/>
        <input type="reset" value="Clear"/>
    </form>
</head>
<body>

</body>
</html>
