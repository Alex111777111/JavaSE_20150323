package ru.javacourse.book.exception;

public class BookBusinessException extends BookException
{
    public BookBusinessException() {
    }

    public BookBusinessException(String message) {
        super(message);
    }

    public BookBusinessException(Throwable cause) {
        super(cause);
    }

    public BookBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
