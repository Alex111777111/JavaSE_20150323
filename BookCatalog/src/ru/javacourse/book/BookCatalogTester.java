package ru.javacourse.book;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookBusinessException;

public class BookCatalogTester
{
    public static void main(String[] args) throws BookBusinessException {
        BookCatalog bc = BookCatalog.getInstance();

        Book b = new Book();
        bc.addBook(b);
        bc.updateBook(b);
        bc.getBook(b.getBookId());
        bc.deleteBook(b.getBookId());

    }
}
