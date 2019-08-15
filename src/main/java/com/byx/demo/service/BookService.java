package com.byx.demo.service;

import com.byx.demo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    int del(int bookId);
    void update(Book book);
    int add(Book book);
    Book getById(int bookId);
}
