package ru.javacourse.book.exception;

public class BookException extends Exception
{
    public BookException() {
    }

    public BookException(String message) {
        super(message);
    }

    public BookException(Throwable cause) {
        super(cause);
    }

    public BookException(String message, Throwable cause) {
        super(message, cause);
    }
}
