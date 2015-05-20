package ru.javacourse.book;

import ru.javacourse.book.business.BookCatalog;
import ru.javacourse.book.domain.Book;
import ru.javacourse.book.exception.BookBusinessException;
import ru.javacourse.book.filter.BookFilter;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Properties;

public class BookCatalogTester
{
    public static void main(String[] args) throws BookBusinessException {

//        for(Charset ch : Charset.availableCharsets().values()) {
//            System.out.println(ch.name());
//            System.out.println(ch.aliases());
//        }

        BookCatalog bc = BookCatalog.getInstance();

        Book b1 = new Book(null, "12345", "OldTitle", 99.9);
        long bookId = bc.addBook(b1);

        Book b2 = bc.getBook(bookId);

        b2.setTitle("New title");
        bc.updateBook(b2);

        BookFilter filter = new BookFilter();
        filter.setTitle("New");
        List<Book> books = bc.findBooks(filter);
        for(Book b : books) {
            System.out.println(b);
        }
//        if (books.size() != 1) {
//            System.out.println("Error");
//        }
//        bc.deleteBook(b2.getBookId());
    }
}
