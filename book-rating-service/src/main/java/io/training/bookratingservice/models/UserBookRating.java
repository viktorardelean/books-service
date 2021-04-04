package io.training.bookratingservice.models;

import lombok.Data;

import java.util.List;

@Data
public class UserBookRating {

    private List<BookRating> userBookRatings;

    public UserBookRating(List<BookRating> userBookRatings) {
        this.userBookRatings = userBookRatings;
    }

    public UserBookRating() {
    }
}
