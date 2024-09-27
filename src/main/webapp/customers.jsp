<%@ page import="vn.edu.iuh.fit.lab_02.backend.models.Customer" %>
<%@ page import="vn.edu.iuh.fit.lab_02.backend.services.CustomerServices" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 9/27/2024
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<%
    CustomerServices services = new CustomerServices();
    List<Customer> lst = services.getAll();
%>
<table width="80%" align="center">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Email</th>
        <th><a href="insertCustomer.jsp">Insert Customer</a></th>

    </tr>
    <%
        for(Customer c : lst){
    %>
    <tr>
        <td><%=c.getCus_id()%></td>
        <td><%=c.getCus_name()%></td>
        <td><%=c.getAddress()%></td>
        <td><%=c.getPhone()%></td>
        <td><%=c.getEmail()%></td>
        <td><a href="">Update</a></td>
        <td><a href="">Delete</a></td>
    </tr>
    <%}%>
</table>
</body>
</html>
