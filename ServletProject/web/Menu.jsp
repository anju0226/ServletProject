<%--
  Created by IntelliJ IDEA.
  User: Anju
  Date: 22/06/2016
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>LOGIN</title>
  </head>
  <body>

  <form id = "login" action="/login" method="get">


    Username: <input type="text" placeholder="Enter Username" name="name"><br>

    Password: <input type="text" placeholder="Enter password" name="pass"><br>

    <input type="submit" value="Login"><br>

    <a href="Register.jsp">Register</a>
  </form>


  </body>
</html>
