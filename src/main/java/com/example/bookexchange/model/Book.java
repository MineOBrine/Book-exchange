package com.example.bookexchange.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String category;
    private String condition; // e.g. "good", "fair", "new"
    private String type;      // "buy" or "borrow"
    private String price;

    private String owner;
    private String ownerEmail;
    private String ownerPhone;

    private String imageURL; // stored path/URL for the uploaded file
}
