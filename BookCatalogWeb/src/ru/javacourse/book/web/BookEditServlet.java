package ru.javacourse.book.web;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookBusinessException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Антон on 04.06.2015.
 */
public class BookEditServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String priceStr = request.getParameter("price");
        Double price = Double.parseDouble(priceStr);
        String isbn = request.getParameter("isbn");

        Book book = new Book(null, title, price, isbn);
        try {
            BookCatalog.getInstance().addBook(book);
        } catch (BookBusinessException e) {
            e.printStackTrace();
        }
        response.sendRedirect("bookList");
    }
}
