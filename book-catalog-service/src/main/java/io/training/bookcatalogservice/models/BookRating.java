package io.training.bookcatalogservice.models;

import lombok.Data;

@Data
public class BookRating {

    private String bookId;
    private Integer rating;

    public BookRating(String bookId, Integer rating) {
        this.bookId = bookId;
        this.rating = rating;
    }

    public BookRating() {
    }
}
