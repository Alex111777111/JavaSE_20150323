package ru.javacourse.book.business;

import ru.javacourse.book.dao.BookDAO;
import ru.javacourse.book.dao.BookDAOFactory;
import ru.javacourse.book.domain.Book;

public class BookCatalog
{
    private BookDAO dao = BookDAOFactory.getDao();

    public Long addBook(Book book) {
        return dao.addBook(book);
    }

    public void updateBook(Book book) {
        dao.updateBook(book);
    }

    public void deleteBook(Long bookId) {
        dao.deleteBook(bookId);
    }

    public Book getBook(Long bookId) {
        return dao.getBook(bookId);
    }
}
