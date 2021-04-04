package io.training.bookratingservice.models;

import lombok.Data;

@Data
public class BookRating {

    public BookRating(String bookId, Integer rating) {
        this.bookId = bookId;
        this.rating = rating;
    }

    private String bookId;
    private Integer rating;
}
