<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/10/30
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@  page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>余额</td>
    </tr>
    <c:forEach items="${accountlist}" var="account" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
