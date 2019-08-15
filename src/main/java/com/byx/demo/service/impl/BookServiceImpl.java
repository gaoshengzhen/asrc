package com.byx.demo.service.impl;

import com.byx.demo.entity.Book;
import com.byx.demo.mapper.BookMapper;
import com.byx.demo.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper service;

    @Override
    public List<Book> getAll() {
        return service.getAll();
    }

    @Override
    public int del(int bookId) {
        return service.del(bookId);
    }

    @Override
    public void update(Book book) {
        service.update(book);
    }

    @Override
    public int add(Book book) {
        return service.add(book);
    }

    @Override
    public Book getById(int bookId) {
        return service.getById(bookId);
    }
}
