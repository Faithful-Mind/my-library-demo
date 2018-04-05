<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
      <c:forEach var="bookEntry" items="${booksMap}">
        <option value="${bookEntry.key}">${bookEntry.value.name}</option>
      </c:forEach>
    </select>
    <input type="submit">
  </form>
  <%--$END$--%>
  <footer class="right">by Faithful-Mind</footer>
  </body>
</html>
