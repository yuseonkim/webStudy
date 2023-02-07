<%--
  Created by IntelliJ IDEA.
  User: yuling
  Date: 2023/02/07
  Time: 11:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인 창</title>
</head>
<body>
  <form name="frmLogin" method="get" action="login">
    아이디 : <input type="text" name="user_id"><br>
    비밀번호 : <input type="password" name="user_pw"><br>
      <input type="submit" value="로그인"> <input type="reset" value="다시 입력">
  </form>

</body>
</html>
