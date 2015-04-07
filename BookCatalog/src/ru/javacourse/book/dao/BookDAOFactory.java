package ru.javacourse.book.dao;

public class BookDAOFactory
{
    public static BookDAO getDao() {
        return new BookFakeDAO();
    }
}
