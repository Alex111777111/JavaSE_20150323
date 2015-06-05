<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.javacourse.book.domain.Book, java.util.List" %>

<html>
<head>
    <title>Book List</title>
</head>
<body>
<%
    List<Book> list = (List<Book>) request.getAttribute("BOOK_LIST");
%>
<table border="1">
    <thead>
    <tr>
        <th>BookID</th>
        <th>Title</th>
        <th>Price</th>
        <th>ISBN</th>
        <th>Delete</th>
    </tr>
    </thead>
    <%
        for (Book b : list) {
    %>
    <tr>
        <td><a href="bookShow?bookId=<%=b.getBookId() %>"><%=b.getBookId()%></a>
        </td>
        <td><%=b.getTitle()%>
        </td>
        <td><%=b.getPrice()%>
        </td>
        <td><%=b.getIsbn()%>
        </td>
        <td>
            <a href="bookDelete?bookId=<%=b.getBookId() %>">Delete</a>
        </td>
    </tr>
    <%
        }
    %>
</table>

<a href="bookShow">Add book</a>

</body>
</html>
