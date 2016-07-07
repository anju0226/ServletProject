<%--
  Created by IntelliJ IDEA.
  User: Anju
  Date: 27/06/2016
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Report</title>
</head>
<body>
<fieldset>
    <legend>Report</legend>


    <label for="momo">MoMo<span style="color:red">*</span></label>
    <input type="text"  name="momo" id="momo" value="<%=request.getAttribute("momo")%>"><br>

    <label for="chowmin">Chowmin<span style="color:red">*</span></label>
    <input type="text"  name="chowmin" id="chowmin" value="<%=request.getAttribute("chowmin")%>"><br>

    <label for="friedrice">Fried Rice<span style="color:red">*</span></label>
    <input type="text"  name="friedrice" id="friedrice" value="<%=request.getAttribute("fried")%>"><br>


    </fieldset>

</body>
</html>
