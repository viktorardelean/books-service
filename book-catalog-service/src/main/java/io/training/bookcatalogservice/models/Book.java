package io.training.bookcatalogservice.models;

import lombok.Data;

@Data
public class Book {

    private String bookId;
    private String title;

    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public Book() {
    }

}
