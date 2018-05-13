package com.awsome.service.impl;

import com.awsome.domain.Book;
import com.awsome.domain.BookRepository;
import com.awsome.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book insertBook(Book book) {
        return bookRepository.save(book);
    }
}
