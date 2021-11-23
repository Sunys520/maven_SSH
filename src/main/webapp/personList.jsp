<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/19
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${list}" var="p">
        <tr>
            <td>${p.pid}</td>
            <td>${p.name}</td>
            <td>${p.age}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
