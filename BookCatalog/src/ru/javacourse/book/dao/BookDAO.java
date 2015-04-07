package ru.javacourse.book.dao;

import ru.javacourse.book.domain.Book;

public interface BookDAO
{
    public Long addBook(Book book);

    public void updateBook(Book book);

    public void deleteBook(Long bookId);

    public Book getBook(Long bookId);

}
