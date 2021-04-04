package io.training.bookcatalogservice.resources;

import io.training.bookcatalogservice.models.Book;
import io.training.bookcatalogservice.models.BookRating;
import io.training.bookcatalogservice.models.CatalogItem;
import io.training.bookcatalogservice.models.UserBookRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class BookCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {

        UserBookRating userBookRating = restTemplate.getForObject("http://book-rating-service/rating/users/" + userId,
                UserBookRating.class);



        return userBookRating.getUserBookRatings().stream().map( rating -> {
            Book book = restTemplate.getForObject("http://book-info-service/books/" + rating.getBookId(), Book.class);
            return new CatalogItem(
                book.getTitle(),
                "From a renowned historian comes a groundbreaking narrative of humanity’s creation and evoluti" +
                "on—a #1 international bestseller—that explores the ways in which biology and history have defined " +
                "us and enhanced our understanding of what it means to be “human.”\n",
                rating.getRating());}).collect(Collectors.toList());

//        return Arrays.asList(new CatalogItem(
//                "Sapiens: A Brief History of Humankind",
//                "From a renowned historian comes a groundbreaking narrative of humanity’s creation and evoluti" +
//                        "on—a #1 international bestseller—that explores the ways in which biology and history have defined " +
//                        "us and enhanced our understanding of what it means to be “human.”\n",
//                5),
//                new CatalogItem(
//                        "Greenlights",
//                        "#1 NEW YORK TIMES BESTSELLER • Over one million copies sold! From the Academy " +
//                                "Award®–winning actor, an unconventional memoir filled with raucous stories, outlaw wisdom, " +
//                                "and lessons learned the hard way about living with greater satisfaction",
//                        4
//                ),
//                new CatalogItem(
//                        "A Promised Land",
//                        "A riveting, deeply personal account of history in the making—from the president who " +
//                                "inspired us to believe in the power of democracy",
//                        5
//                )
//        );

    }
}
