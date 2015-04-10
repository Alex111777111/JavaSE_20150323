package ru.javacourse.book.business;

import ru.javacourse.book.dao.BookDAO;
import ru.javacourse.book.dao.BookDAOFactory;
import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookBusinessException;
import ru.javacourse.book.exception.BookDaoException;
import ru.javacourse.book.exception.BookRuntimeException;

public class BookCatalog
{
    private BookDAO dao = BookDAOFactory.getDao();

    public Long addBook(Book book) throws BookBusinessException {
        String g = null;
        System.out.println(g.toString());
        try {
            return dao.addBook(book);
        } catch(BookDaoException ex) {
            throw new BookBusinessException(ex);
        }
    }

    public void updateBook(Book book) {
        try {
            dao.updateBook(book);
        } catch (BookDaoException ex) {
            throw new BookRuntimeException(ex);
        }
    }

    public void deleteBook(Long bookId) {
        try {
            dao.deleteBook(bookId);
        } catch (BookDaoException e) {
            e.printStackTrace();
        }
    }

    public Book getBook(Long bookId) {
        try {
            return dao.getBook(bookId);
        } catch (BookDaoException e) {
            e.printStackTrace();
        }
        return null;
    }
}
