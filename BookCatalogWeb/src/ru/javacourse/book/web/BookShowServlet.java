package ru.javacourse.book.web;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Антон on 04.06.2015.
 */
public class BookShowServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookStrId = request.getParameter("bookId");
        if(bookStrId != null && !bookStrId.trim().isEmpty()) {
            Long bookId = Long.parseLong(bookStrId);
            Book book = BookCatalog.getInstance().getBook(bookId);
            request.setAttribute("BOOK", book);
        }
        getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
    }
}
