package com.byx.demo.entity;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    int bookId;
    String bookName;
    int bookPrice;
    String author;
}
