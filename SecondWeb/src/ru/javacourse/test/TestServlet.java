package ru.javacourse.test;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ����� on 04.06.2015.
 */
@WebServlet(name = "TestServlet")
public class TestServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = BookCatalog.getInstance().findBooks(null);
        request.setAttribute("BOOK_LIST", books);
    }

}
