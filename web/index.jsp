<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/7
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>表单</title>
  </head>
  <body>
  <form action="/login" method="post">
    <input type="text" name="username" placeholder="请输入用户名"></br>
    <input type="password" name="password" placeholder="请输入密码"></br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
