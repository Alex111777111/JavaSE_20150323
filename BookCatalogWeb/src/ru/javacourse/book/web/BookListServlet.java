package ru.javacourse.book.web;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookListServlet extends HttpServlet
{
    public static final String TEST = "1";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Book> books = BookCatalog.getInstance().findBooks(null);
        request.setAttribute("BOOK_LIST", books);

        getServletContext().getRequestDispatcher("/list.jsp").forward(request, response);
    }
}
