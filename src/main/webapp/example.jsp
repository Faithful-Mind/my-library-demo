<%--
  Created by IntelliJ IDEA.
  User: lpyy1
  Date: 2018/3/8
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8" />
    <%--<title>$Title$</title>--%>
    <title>My Library</title>
    <link rel="stylesheet" href="style1.css" />
  </head>
  <body>
  <h1>Welcome to My Library</h1>
  <hr />
  <form method="get" action="GetExampleBook.do">
    Select the Book you would like to borrow:
    <select name="reqBook">
      <option value="hfPython">${hfPython.name}</option>
      <option value="algs4">${algs4.name}</option>
      <option value="jzb">${jzb.name}</option>
    </select>
    <input type="submit">
  </form>
  <%--$END$--%>
  <footer class="right">by Faithful-Mind</footer>
  </body>
</html>