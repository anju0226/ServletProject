<%--
  Created by IntelliJ IDEA.
  User: Anju
  Date: 26/06/2016
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><form action="/register" method="get">
    <fieldset>
        <legend>Register</legend>


            <label for="fname">First Name<span style="color:red">*</span></label>
            <input type="text"  name="fname" id="fname"><br>

            <label for="lname">Last Name<span style="color:red">*</span></label>
            <input type="text"  name="lname" id="lname"><br>


           <label for="username">Username<span style="color:red">*</span></label>
           <input type="text"  name="username" id="username"><br>

           <label for="password">Password<span style="color:red">*</span></label>
           <input type="password"  name="password" id="password"><br>


           <label for="address">Address<span style="color:red">*</span></label>
           <input type="text"  name="address" id="address"><br>


           <label for="lname">Contact<span style="color:red">*</span></label>
           <input type="text"  name="contact" id="contact"><br>


           <input type="submit"  id="register" value="register">

    </fieldset>
</form>
    <title>Title</title>
</head>
<body>

</body>
</html>
