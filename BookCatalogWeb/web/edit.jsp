<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.javacourse.book.domain.Book" %>

<html>
<head>
    <title>Edit book</title>
</head>
<body>

<%
  Book book = (Book)request.getAttribute("BOOK");
%>

<h3>${BOOK.bookId}</h3>

<form action="bookEdit" method="POST">
  <%
  if(book != null) {
  %>
  <input type="hidden" name="bookId" value="<%=book.getBookId() %>"/>
  Title:<input type="text" name="title" value="<%=book.getTitle()%>"/><br/>
  Price:<input type="text" name="price" value="<%=book.getPrice() %>"/><br/>
  ISBN:<input type="text" name="isbn" value="<%=book.getIsbn() %>"/><br/>
  <%
    } else {
  %>
  Title:<input type="text" name="title" value=""/><br/>
  Price:<input type="text" name="price" value=""/><br/>
  ISBN:<input type="text" name="isbn" value=""/><br/>
  <%
    }
  %>
  <input type="submit" value="Save">
</form>

</body>
</html>
