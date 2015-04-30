package ru.javacourse.book.dao;

import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookDaoException;
import ru.javacourse.book.filter.BookFilter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Антон on 27.04.2015.
 */
public abstract class BookFileDAO implements BookDAO
{
    protected List<Book> books = null;

    @Override
    public Long addBook(Book book) throws BookDaoException {
        if (books == null) {
            loadBooks();
        }
        long bookId = 0;
        try {
            bookId = Math.round(Math.random() * 1000000000);
            boolean found = true;
            while (found) {
                found = false;
                for (Book b : books) {
                    if (b.getBookId().equals(bookId)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    bookId = Math.round(Math.random() * 1000000000);
                }
            }
            book.setBookId(bookId);
            books.add(book);
            saveBooks();
        } catch (Exception ex) {
            throw new BookDaoException(ex);
        }
        return bookId;
    }

    @Override
    public void updateBook(Book book) throws BookDaoException {
        if (books == null) {
            loadBooks();
        }
        for (Book b : books) {
            if (b.getBookId().equals(book.getBookId())) {
                b.update(book);
                saveBooks();
                break;
            }
        }
    }

    @Override
    public void deleteBook(Long bookId) throws BookDaoException {
        if (books == null) {
            loadBooks();
        }
        for (Iterator<Book> it = books.iterator(); it.hasNext(); ) {
            Book b = it.next();
            if (b.getBookId().equals(bookId)) {
                it.remove();
                saveBooks();
                break;
            }
        }
    }

    @Override
    public Book getBook(Long bookId) throws BookDaoException {
        if (books == null) {
            loadBooks();
        }
        for (Book b : books) {
            if (b.getBookId().equals(bookId)) {
                System.out.println("Found book for GET");
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooks(BookFilter filter) throws BookDaoException {
        if (books == null) {
            loadBooks();
        }
        return books;
    }

    protected abstract void loadBooks();

    protected abstract void saveBooks();
}
