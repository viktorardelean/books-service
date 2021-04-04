package io.training.bookinfoservice.resources;

import io.training.bookinfoservice.models.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookResource {

    @RequestMapping("/{bookId}")
    public Book getBookInfo(@PathVariable String bookId) {
        return new Book(bookId, "A Promised Land");
        //Sapiens: A Brief History of Humankind
        //Greenlights
    }

}
