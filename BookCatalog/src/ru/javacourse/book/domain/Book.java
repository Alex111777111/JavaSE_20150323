package ru.javacourse.book.domain;

public class Book
{
    private Long bookId;
    private String title;
    private Double price;
    private String isbn;

    public Book() {
    }

    public Book(Long bookId, String isbn, String title, Double price) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.price = price;
        this.title = title;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
