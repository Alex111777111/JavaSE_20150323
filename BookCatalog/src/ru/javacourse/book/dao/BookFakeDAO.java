package ru.javacourse.book.dao;

import ru.javacourse.book.domain.Book;

public class BookFakeDAO implements BookDAO
{
    @Override
    public Long addBook(Book book) {
        System.out.println("Add book for fake");
        return 1L;
    }

    @Override
    public void updateBook(Book book) {
        System.out.println("Update book for fake");
    }

    @Override
    public void deleteBook(Long bookId) {
        System.out.println("Delete book for fake");
    }

    @Override
    public Book getBook(Long bookId) {
        System.out.println("Get book for fake");
        Book b = new Book(99L, "ISBNTEST", "TEST BOOK", 199.0);
        return b;
    }
}
