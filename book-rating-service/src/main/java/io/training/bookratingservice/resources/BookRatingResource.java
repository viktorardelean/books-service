package io.training.bookratingservice.resources;

import io.training.bookratingservice.models.BookRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class BookRatingResource {

    @RequestMapping("/{bookId}")
    public BookRating getBookRating(@PathVariable String bookId) {
        return new BookRating(bookId, 5);
    }

}
