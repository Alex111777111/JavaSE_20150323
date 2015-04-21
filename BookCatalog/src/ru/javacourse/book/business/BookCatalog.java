package ru.javacourse.book.business;

import ru.javacourse.book.annotation.BookDaoClass;
import ru.javacourse.book.dao.BookDAO;
import ru.javacourse.book.dao.BookDAOFactory;
import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookBusinessException;
import ru.javacourse.book.exception.BookDaoException;
import ru.javacourse.book.exception.BookRuntimeException;

import java.lang.reflect.Field;

public class BookCatalog
{
    private static BookCatalog instance;

    @BookDaoClass(name = "ru.javacourse.book.dao.BookDbDAO")
    private BookDAO dao;

    private BookCatalog() {
        try {
            Field field = BookCatalog.class.getDeclaredField("dao");
            BookDaoClass annotation = field.getAnnotation(BookDaoClass.class);
            if (annotation != null) {
                String daoName = annotation.name();
                if (daoName != null || !daoName.trim().isEmpty()) {
                    dao = BookDAOFactory.getDao(daoName);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        dao = BookDAOFactory.getDao();
    }

    public static BookCatalog getInstance() {
        if (instance == null) {
            instance = new BookCatalog();
        }
        return instance;
    }


    public Long addBook(Book book) throws BookBusinessException {
        try {
            return dao.addBook(book);
        } catch (BookDaoException ex) {
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
