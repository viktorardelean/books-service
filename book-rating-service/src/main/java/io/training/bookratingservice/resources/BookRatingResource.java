package io.training.bookratingservice.resources;

import io.training.bookratingservice.models.BookRating;
import io.training.bookratingservice.models.UserBookRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class BookRatingResource {

    @RequestMapping("/{bookId}")
    public BookRating getBookRating(@PathVariable String bookId) {
        return new BookRating(bookId, 5);
    }

    @RequestMapping("users/{userId}")
    public UserBookRating getUserBookRating(@PathVariable String userId) {
        return new UserBookRating(Arrays.asList(new BookRating("100", 5),
                new BookRating("101", 3)));
    }

}
