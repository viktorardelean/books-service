package io.training.bookcatalogservice.models;

import lombok.*;

@Data
public class CatalogItem {

    private String title;
    private String description;
    private Integer rating;

    public CatalogItem(String title, String description, Integer rating) {
        this.title = title;
        this.description = description;
        this.rating = rating;
    }
}
