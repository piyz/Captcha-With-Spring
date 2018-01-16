<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 16.01.2018
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>First Page</title>
</head>
<body>
    <h3>Captcha form</h3>
    <s:form method="post" commandName="form" action="${pageContext.request.contextPath}/save">
        <table>
            <tr>
                <td>Username</td>
                <td>
                    <s:input path="username" required="required"/>
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <s:password path="password" required="required"/>
                </td>
            </tr>
            <tr>
                <td>Captcha</td>
                <td>
                    <img src="${pageContext.request.contextPath}/captcha-image">
                    <br>
                    <input type="text" name="captcha" required="required">
                    <br>
                        ${error}
                    <br>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>
    </s:form>
</body>
</html>
