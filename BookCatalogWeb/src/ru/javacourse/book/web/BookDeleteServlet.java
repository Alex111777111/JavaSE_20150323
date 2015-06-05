package ru.javacourse.book.web;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Антон on 04.06.2015.
 */
public class BookDeleteServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookStrId = request.getParameter("bookId");
        if(bookStrId != null || !bookStrId.trim().isEmpty()) {
            try {
                Long bookId = Long.parseLong(bookStrId);
                BookCatalog.getInstance().deleteBook(bookId);
            } catch(Exception ex) {
                ex.printStackTrace(System.out);
            }
        }
        response.sendRedirect("bookList");
    }
}
