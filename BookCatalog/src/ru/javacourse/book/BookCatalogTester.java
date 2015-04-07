package ru.javacourse.book;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;

public class BookCatalogTester
{
    public static void main(String[] args) {
        BookCatalog bc = new BookCatalog();

        Book b = new Book();
        bc.addBook(b);
        bc.updateBook(b);
        bc.getBook(b.getBookId());
        bc.deleteBook(b.getBookId());

    }
}
