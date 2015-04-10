package ru.javacourse.book.dao;

import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookDaoException;

public class BookFakeDAO implements BookDAO
{
    @Override
    public Long addBook(Book book) throws BookDaoException {
        try {
            System.out.println("Add book for fake");
        } catch(Exception ex) {
            throw new BookDaoException(ex);
        }
        return 1L;
    }

    @Override
    public void updateBook(Book book) throws BookDaoException {
        System.out.println("Update book for fake");
    }

    @Override
    public void deleteBook(Long bookId) throws BookDaoException {
        System.out.println("Delete book for fake");
    }

    @Override
    public Book getBook(Long bookId) throws BookDaoException {
        System.out.println("Get book for fake");
        Book b = new Book(99L, "ISBNTEST", "TEST BOOK", 199.0);
        return b;
    }
}
