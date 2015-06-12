<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.javacourse.book.domain.Book, java.util.List" %>


<%-- Все варианты библиотеки JSTL --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Book List</title>
</head>
<body>

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

    <c:forEach var="book" items="${BOOK_LIST}" varStatus="status">

        <c:url var="showUrl" value="bookShow">
            <c:param name="bookId" value="${book.bookId}"/>
        </c:url>
        <c:url var="deleteUrl" value="bookDelete">
            <c:param name="bookId" value="${book.bookId}"/>
        </c:url>

        <c:choose>
            <c:when test="${status.count%2==1}">
                <tr style="background-color: green;">
            </c:when>
            <c:otherwise>
                <tr style="background-color: yellow;">
            </c:otherwise>
        </c:choose>
            <td><a href="${showUrl}">${book.bookId}</a></td>
            <td>${book.title}</td>
            <td>${book.price}</td>
            <td>${book.isbn}</td>
            <td>
                <a href="${deleteUrl}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="bookShow">Add book</a>

</body>
</html>
