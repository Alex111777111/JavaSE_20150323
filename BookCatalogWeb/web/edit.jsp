<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.javacourse.book.domain.Book" %>

<html>
<head>
    <title>Edit book</title>
</head>
<body>

<form action="bookEdit" method="POST">
  <input type="hidden" name="bookId" value="${BOOK.bookId}"/>
  Title:<input type="text" name="title" value="${BOOK.title}"/><br/>
  Price:<input type="text" name="price" value="${BOOK.price}"/><br/>
  ISBN:<input type="text" name="isbn" value="${BOOK.isbn}"/><br/>
  <input type="submit" value="Save">
</form>

</body>
</html>
